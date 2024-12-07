package com.test.grpc;

import io.grpc.stub.StreamObserver;
import com.google.protobuf.ByteString;

public class EnvelopeServiceImpl extends EnvelopeServiceGrpc.EnvelopeServiceImplBase {
    @Override
    public void sendMessage(Envelope request, StreamObserver<Response> responseObserver) {
        try {
            // Log received message details
            System.out.println("Received message:");
            System.out.println("ID: " + request.getMessageId());
            System.out.println("Type: " + request.getType());
            System.out.println("Source: " + request.getSource());
            System.out.println("Message: " + request.getPayload());
            System.out.println("Timestamp: " + request.getTimestamp());

            // Create and send response
            Response response = Response.newBuilder()
                    .setStatus("SUCCESS")
                    .setMessage("Message processed successfully")
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            Response errorResponse = Response.newBuilder()
                    .setStatus("ERROR")
                    .setMessage("Error processing message: " + e.getMessage())
                    .build();
            responseObserver.onNext(errorResponse);
            responseObserver.onCompleted();
        }
    }

    @Override
    public void streamMessages(Request request, StreamObserver<Envelope> responseObserver) {
        try {
            // Example: Stream multiple messages based on filter
            String filterType = request.getFilterType();
            String sourceFilter = request.getSourceFilter();

            // Simulate streaming multiple messages
            for (int i = 0; i < 5; i++) {
                Envelope message = Envelope.newBuilder()
                        .setMessageId("MSG-" + i)
                        .setTimestamp(String.valueOf(System.currentTimeMillis()))
                        .setType(filterType)
                        .setSource(sourceFilter)
                        .setVersion("1.0")
                        .setPayload(ByteString.copyFromUtf8("Sample payload " + i))
                        .build();

                responseObserver.onNext(message);
                Thread.sleep(100); // Simulate processing delay
            }

            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(e);
        }
    }
}
