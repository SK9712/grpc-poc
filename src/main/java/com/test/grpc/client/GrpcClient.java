package com.test.grpc.client;

import com.test.grpc.Envelope;
import com.test.grpc.EnvelopeServiceGrpc;
import com.test.grpc.Request;
import com.test.grpc.Response;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import com.google.protobuf.ByteString;

import java.util.concurrent.TimeUnit;
import java.util.Iterator;

public class GrpcClient {
    private final ManagedChannel channel;
    private final EnvelopeServiceGrpc.EnvelopeServiceBlockingStub blockingStub;

    public GrpcClient(String host, int port) {
        channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext(true) // For testing only, don't use in production
                .build();

        blockingStub = EnvelopeServiceGrpc.newBlockingStub(channel);
    }

    public void sendMessage(String type, String payload) {
        Envelope request = Envelope.newBuilder()
                .setMessageId(java.util.UUID.randomUUID().toString())
                .setTimestamp(String.valueOf(System.currentTimeMillis()))
                .setType(type)
                .setPayload(ByteString.copyFromUtf8(payload))
                .setVersion("1.0")
                .setSource("client")
                .build();

        try {
            Response response = blockingStub.sendMessage(request);
            System.out.println("Server response - Status: " + response.getStatus() +
                    ", Message: " + response.getMessage());
        } catch (StatusRuntimeException e) {
            System.err.println("RPC failed: " + e.getStatus());
        }
    }

    public void streamMessages(String filterType, String sourceFilter) {
        Request request = Request.newBuilder()
                .setFilterType(filterType)
                .setSourceFilter(sourceFilter)
                .build();

        try {
            Iterator<Envelope> messages = blockingStub.streamMessages(request);
            while (messages.hasNext()) {
                Envelope message = messages.next();
                System.out.println("Received message:");
                System.out.println("ID: " + message.getMessageId());
                System.out.println("Type: " + message.getType());
                System.out.println("Payload: " + message.getPayload().toStringUtf8());
                System.out.println("-------------------");
            }
        } catch (StatusRuntimeException e) {
            System.err.println("RPC failed: " + e.getStatus());
        }
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public static void main(String[] args) throws InterruptedException {
        GrpcClient client = new GrpcClient("localhost", 50051);
        try {
            // Test unary call
            client.sendMessage("TEST", "Hello from client!");

            // Test streaming call
            client.streamMessages("TEST", "client");
        } finally {
            client.shutdown();
        }
    }
}