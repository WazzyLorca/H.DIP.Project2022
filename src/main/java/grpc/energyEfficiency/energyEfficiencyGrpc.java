package grpc.energyEfficiency;

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
 * the energyEfficiency service definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: energyEfficiency.proto")
public final class energyEfficiencyGrpc {

  private energyEfficiencyGrpc() {}

  public static final String SERVICE_NAME = "energyEfficiency.energyEfficiency";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.energyEfficiency.ActivateLightsRequest,
      grpc.energyEfficiency.ActivateLightsResponse> getActivateLightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ActivateLights",
      requestType = grpc.energyEfficiency.ActivateLightsRequest.class,
      responseType = grpc.energyEfficiency.ActivateLightsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.energyEfficiency.ActivateLightsRequest,
      grpc.energyEfficiency.ActivateLightsResponse> getActivateLightsMethod() {
    io.grpc.MethodDescriptor<grpc.energyEfficiency.ActivateLightsRequest, grpc.energyEfficiency.ActivateLightsResponse> getActivateLightsMethod;
    if ((getActivateLightsMethod = energyEfficiencyGrpc.getActivateLightsMethod) == null) {
      synchronized (energyEfficiencyGrpc.class) {
        if ((getActivateLightsMethod = energyEfficiencyGrpc.getActivateLightsMethod) == null) {
          energyEfficiencyGrpc.getActivateLightsMethod = getActivateLightsMethod = 
              io.grpc.MethodDescriptor.<grpc.energyEfficiency.ActivateLightsRequest, grpc.energyEfficiency.ActivateLightsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "energyEfficiency.energyEfficiency", "ActivateLights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.energyEfficiency.ActivateLightsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.energyEfficiency.ActivateLightsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new energyEfficiencyMethodDescriptorSupplier("ActivateLights"))
                  .build();
          }
        }
     }
     return getActivateLightsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.energyEfficiency.TemperatureRequest,
      grpc.energyEfficiency.TemperatureResponse> getCheckTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckTemperature",
      requestType = grpc.energyEfficiency.TemperatureRequest.class,
      responseType = grpc.energyEfficiency.TemperatureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.energyEfficiency.TemperatureRequest,
      grpc.energyEfficiency.TemperatureResponse> getCheckTemperatureMethod() {
    io.grpc.MethodDescriptor<grpc.energyEfficiency.TemperatureRequest, grpc.energyEfficiency.TemperatureResponse> getCheckTemperatureMethod;
    if ((getCheckTemperatureMethod = energyEfficiencyGrpc.getCheckTemperatureMethod) == null) {
      synchronized (energyEfficiencyGrpc.class) {
        if ((getCheckTemperatureMethod = energyEfficiencyGrpc.getCheckTemperatureMethod) == null) {
          energyEfficiencyGrpc.getCheckTemperatureMethod = getCheckTemperatureMethod = 
              io.grpc.MethodDescriptor.<grpc.energyEfficiency.TemperatureRequest, grpc.energyEfficiency.TemperatureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "energyEfficiency.energyEfficiency", "CheckTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.energyEfficiency.TemperatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.energyEfficiency.TemperatureResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new energyEfficiencyMethodDescriptorSupplier("CheckTemperature"))
                  .build();
          }
        }
     }
     return getCheckTemperatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.energyEfficiency.PresRoomRequest,
      grpc.energyEfficiency.PresRoomResponse> getPresRoomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PresRoom",
      requestType = grpc.energyEfficiency.PresRoomRequest.class,
      responseType = grpc.energyEfficiency.PresRoomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.energyEfficiency.PresRoomRequest,
      grpc.energyEfficiency.PresRoomResponse> getPresRoomMethod() {
    io.grpc.MethodDescriptor<grpc.energyEfficiency.PresRoomRequest, grpc.energyEfficiency.PresRoomResponse> getPresRoomMethod;
    if ((getPresRoomMethod = energyEfficiencyGrpc.getPresRoomMethod) == null) {
      synchronized (energyEfficiencyGrpc.class) {
        if ((getPresRoomMethod = energyEfficiencyGrpc.getPresRoomMethod) == null) {
          energyEfficiencyGrpc.getPresRoomMethod = getPresRoomMethod = 
              io.grpc.MethodDescriptor.<grpc.energyEfficiency.PresRoomRequest, grpc.energyEfficiency.PresRoomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "energyEfficiency.energyEfficiency", "PresRoom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.energyEfficiency.PresRoomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.energyEfficiency.PresRoomResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new energyEfficiencyMethodDescriptorSupplier("PresRoom"))
                  .build();
          }
        }
     }
     return getPresRoomMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static energyEfficiencyStub newStub(io.grpc.Channel channel) {
    return new energyEfficiencyStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static energyEfficiencyBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new energyEfficiencyBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static energyEfficiencyFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new energyEfficiencyFutureStub(channel);
  }

  /**
   * <pre>
   * the energyEfficiency service definition
   * </pre>
   */
  public static abstract class energyEfficiencyImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Light management system
     * Server streaming method
     * </pre>
     */
    public void activateLights(grpc.energyEfficiency.ActivateLightsRequest request,
        io.grpc.stub.StreamObserver<grpc.energyEfficiency.ActivateLightsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getActivateLightsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Temperature management system
     * Server streaming method
     * </pre>
     */
    public void checkTemperature(grpc.energyEfficiency.TemperatureRequest request,
        io.grpc.stub.StreamObserver<grpc.energyEfficiency.TemperatureResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckTemperatureMethod(), responseObserver);
    }

    /**
     * <pre>
     * Presentation room management system
     * Unary streaming server method
     * </pre>
     */
    public void presRoom(grpc.energyEfficiency.PresRoomRequest request,
        io.grpc.stub.StreamObserver<grpc.energyEfficiency.PresRoomResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPresRoomMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getActivateLightsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                grpc.energyEfficiency.ActivateLightsRequest,
                grpc.energyEfficiency.ActivateLightsResponse>(
                  this, METHODID_ACTIVATE_LIGHTS)))
          .addMethod(
            getCheckTemperatureMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                grpc.energyEfficiency.TemperatureRequest,
                grpc.energyEfficiency.TemperatureResponse>(
                  this, METHODID_CHECK_TEMPERATURE)))
          .addMethod(
            getPresRoomMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                grpc.energyEfficiency.PresRoomRequest,
                grpc.energyEfficiency.PresRoomResponse>(
                  this, METHODID_PRES_ROOM)))
          .build();
    }
  }

  /**
   * <pre>
   * the energyEfficiency service definition
   * </pre>
   */
  public static final class energyEfficiencyStub extends io.grpc.stub.AbstractStub<energyEfficiencyStub> {
    private energyEfficiencyStub(io.grpc.Channel channel) {
      super(channel);
    }

    private energyEfficiencyStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected energyEfficiencyStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new energyEfficiencyStub(channel, callOptions);
    }

    /**
     * <pre>
     * Light management system
     * Server streaming method
     * </pre>
     */
    public void activateLights(grpc.energyEfficiency.ActivateLightsRequest request,
        io.grpc.stub.StreamObserver<grpc.energyEfficiency.ActivateLightsResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getActivateLightsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Temperature management system
     * Server streaming method
     * </pre>
     */
    public void checkTemperature(grpc.energyEfficiency.TemperatureRequest request,
        io.grpc.stub.StreamObserver<grpc.energyEfficiency.TemperatureResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getCheckTemperatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Presentation room management system
     * Unary streaming server method
     * </pre>
     */
    public void presRoom(grpc.energyEfficiency.PresRoomRequest request,
        io.grpc.stub.StreamObserver<grpc.energyEfficiency.PresRoomResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getPresRoomMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * the energyEfficiency service definition
   * </pre>
   */
  public static final class energyEfficiencyBlockingStub extends io.grpc.stub.AbstractStub<energyEfficiencyBlockingStub> {
    private energyEfficiencyBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private energyEfficiencyBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected energyEfficiencyBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new energyEfficiencyBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Light management system
     * Server streaming method
     * </pre>
     */
    public java.util.Iterator<grpc.energyEfficiency.ActivateLightsResponse> activateLights(
        grpc.energyEfficiency.ActivateLightsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getActivateLightsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Temperature management system
     * Server streaming method
     * </pre>
     */
    public java.util.Iterator<grpc.energyEfficiency.TemperatureResponse> checkTemperature(
        grpc.energyEfficiency.TemperatureRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getCheckTemperatureMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Presentation room management system
     * Unary streaming server method
     * </pre>
     */
    public java.util.Iterator<grpc.energyEfficiency.PresRoomResponse> presRoom(
        grpc.energyEfficiency.PresRoomRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getPresRoomMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * the energyEfficiency service definition
   * </pre>
   */
  public static final class energyEfficiencyFutureStub extends io.grpc.stub.AbstractStub<energyEfficiencyFutureStub> {
    private energyEfficiencyFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private energyEfficiencyFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected energyEfficiencyFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new energyEfficiencyFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_ACTIVATE_LIGHTS = 0;
  private static final int METHODID_CHECK_TEMPERATURE = 1;
  private static final int METHODID_PRES_ROOM = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final energyEfficiencyImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(energyEfficiencyImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ACTIVATE_LIGHTS:
          serviceImpl.activateLights((grpc.energyEfficiency.ActivateLightsRequest) request,
              (io.grpc.stub.StreamObserver<grpc.energyEfficiency.ActivateLightsResponse>) responseObserver);
          break;
        case METHODID_CHECK_TEMPERATURE:
          serviceImpl.checkTemperature((grpc.energyEfficiency.TemperatureRequest) request,
              (io.grpc.stub.StreamObserver<grpc.energyEfficiency.TemperatureResponse>) responseObserver);
          break;
        case METHODID_PRES_ROOM:
          serviceImpl.presRoom((grpc.energyEfficiency.PresRoomRequest) request,
              (io.grpc.stub.StreamObserver<grpc.energyEfficiency.PresRoomResponse>) responseObserver);
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

  private static abstract class energyEfficiencyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    energyEfficiencyBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.energyEfficiency.energyEfficiencyImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("energyEfficiency");
    }
  }

  private static final class energyEfficiencyFileDescriptorSupplier
      extends energyEfficiencyBaseDescriptorSupplier {
    energyEfficiencyFileDescriptorSupplier() {}
  }

  private static final class energyEfficiencyMethodDescriptorSupplier
      extends energyEfficiencyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    energyEfficiencyMethodDescriptorSupplier(String methodName) {
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
      synchronized (energyEfficiencyGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new energyEfficiencyFileDescriptorSupplier())
              .addMethod(getActivateLightsMethod())
              .addMethod(getCheckTemperatureMethod())
              .addMethod(getPresRoomMethod())
              .build();
        }
      }
    }
    return result;
  }
}
