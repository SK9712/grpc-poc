package com.test.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Service definition for message handling
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.9.1)",
    comments = "Source: protoc-27.2-win64/envelope.proto")
public final class EnvelopeServiceGrpc {

  private EnvelopeServiceGrpc() {}

  public static final String SERVICE_NAME = "messaging.EnvelopeService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSendMessageMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.test.grpc.Envelope,
      com.test.grpc.Response> METHOD_SEND_MESSAGE = getSendMessageMethod();

  private static volatile io.grpc.MethodDescriptor<com.test.grpc.Envelope,
      com.test.grpc.Response> getSendMessageMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.test.grpc.Envelope,
      com.test.grpc.Response> getSendMessageMethod() {
    io.grpc.MethodDescriptor<com.test.grpc.Envelope, com.test.grpc.Response> getSendMessageMethod;
    if ((getSendMessageMethod = EnvelopeServiceGrpc.getSendMessageMethod) == null) {
      synchronized (EnvelopeServiceGrpc.class) {
        if ((getSendMessageMethod = EnvelopeServiceGrpc.getSendMessageMethod) == null) {
          EnvelopeServiceGrpc.getSendMessageMethod = getSendMessageMethod = 
              io.grpc.MethodDescriptor.<com.test.grpc.Envelope, com.test.grpc.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "messaging.EnvelopeService", "SendMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.test.grpc.Envelope.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.test.grpc.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new EnvelopeServiceMethodDescriptorSupplier("SendMessage"))
                  .build();
          }
        }
     }
     return getSendMessageMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getStreamMessagesMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.test.grpc.Request,
      com.test.grpc.Envelope> METHOD_STREAM_MESSAGES = getStreamMessagesMethod();

  private static volatile io.grpc.MethodDescriptor<com.test.grpc.Request,
      com.test.grpc.Envelope> getStreamMessagesMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.test.grpc.Request,
      com.test.grpc.Envelope> getStreamMessagesMethod() {
    io.grpc.MethodDescriptor<com.test.grpc.Request, com.test.grpc.Envelope> getStreamMessagesMethod;
    if ((getStreamMessagesMethod = EnvelopeServiceGrpc.getStreamMessagesMethod) == null) {
      synchronized (EnvelopeServiceGrpc.class) {
        if ((getStreamMessagesMethod = EnvelopeServiceGrpc.getStreamMessagesMethod) == null) {
          EnvelopeServiceGrpc.getStreamMessagesMethod = getStreamMessagesMethod = 
              io.grpc.MethodDescriptor.<com.test.grpc.Request, com.test.grpc.Envelope>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "messaging.EnvelopeService", "StreamMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.test.grpc.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.test.grpc.Envelope.getDefaultInstance()))
                  .setSchemaDescriptor(new EnvelopeServiceMethodDescriptorSupplier("StreamMessages"))
                  .build();
          }
        }
     }
     return getStreamMessagesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EnvelopeServiceStub newStub(io.grpc.Channel channel) {
    return new EnvelopeServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EnvelopeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EnvelopeServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EnvelopeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EnvelopeServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service definition for message handling
   * </pre>
   */
  public static abstract class EnvelopeServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Send a message
     * </pre>
     */
    public void sendMessage(com.test.grpc.Envelope request,
        io.grpc.stub.StreamObserver<com.test.grpc.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getSendMessageMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stream messages
     * </pre>
     */
    public void streamMessages(com.test.grpc.Request request,
        io.grpc.stub.StreamObserver<com.test.grpc.Envelope> responseObserver) {
      asyncUnimplementedUnaryCall(getStreamMessagesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.test.grpc.Envelope,
                com.test.grpc.Response>(
                  this, METHODID_SEND_MESSAGE)))
          .addMethod(
            getStreamMessagesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.test.grpc.Request,
                com.test.grpc.Envelope>(
                  this, METHODID_STREAM_MESSAGES)))
          .build();
    }
  }

  /**
   * <pre>
   * Service definition for message handling
   * </pre>
   */
  public static final class EnvelopeServiceStub extends io.grpc.stub.AbstractStub<EnvelopeServiceStub> {
    private EnvelopeServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EnvelopeServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnvelopeServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EnvelopeServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Send a message
     * </pre>
     */
    public void sendMessage(com.test.grpc.Envelope request,
        io.grpc.stub.StreamObserver<com.test.grpc.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stream messages
     * </pre>
     */
    public void streamMessages(com.test.grpc.Request request,
        io.grpc.stub.StreamObserver<com.test.grpc.Envelope> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getStreamMessagesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service definition for message handling
   * </pre>
   */
  public static final class EnvelopeServiceBlockingStub extends io.grpc.stub.AbstractStub<EnvelopeServiceBlockingStub> {
    private EnvelopeServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EnvelopeServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnvelopeServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EnvelopeServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Send a message
     * </pre>
     */
    public com.test.grpc.Response sendMessage(com.test.grpc.Envelope request) {
      return blockingUnaryCall(
          getChannel(), getSendMessageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stream messages
     * </pre>
     */
    public java.util.Iterator<com.test.grpc.Envelope> streamMessages(
        com.test.grpc.Request request) {
      return blockingServerStreamingCall(
          getChannel(), getStreamMessagesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service definition for message handling
   * </pre>
   */
  public static final class EnvelopeServiceFutureStub extends io.grpc.stub.AbstractStub<EnvelopeServiceFutureStub> {
    private EnvelopeServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EnvelopeServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnvelopeServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EnvelopeServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Send a message
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.test.grpc.Response> sendMessage(
        com.test.grpc.Envelope request) {
      return futureUnaryCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_MESSAGE = 0;
  private static final int METHODID_STREAM_MESSAGES = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EnvelopeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EnvelopeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_MESSAGE:
          serviceImpl.sendMessage((com.test.grpc.Envelope) request,
              (io.grpc.stub.StreamObserver<com.test.grpc.Response>) responseObserver);
          break;
        case METHODID_STREAM_MESSAGES:
          serviceImpl.streamMessages((com.test.grpc.Request) request,
              (io.grpc.stub.StreamObserver<com.test.grpc.Envelope>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class EnvelopeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EnvelopeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.test.grpc.EnvelopeProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EnvelopeService");
    }
  }

  private static final class EnvelopeServiceFileDescriptorSupplier
      extends EnvelopeServiceBaseDescriptorSupplier {
    EnvelopeServiceFileDescriptorSupplier() {}
  }

  private static final class EnvelopeServiceMethodDescriptorSupplier
      extends EnvelopeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EnvelopeServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (EnvelopeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EnvelopeServiceFileDescriptorSupplier())
              .addMethod(getSendMessageMethod())
              .addMethod(getStreamMessagesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
