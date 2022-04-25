package grpc.foresightMaintenance;

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
 * the foresight maintenance service definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: foresightMaintenance.proto")
public final class foresightMaintenanceGrpc {

  private foresightMaintenanceGrpc() {}

  public static final String SERVICE_NAME = "foresightMaintenance.foresightMaintenance";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.foresightMaintenance.CheckCo2LevelsRequest,
      grpc.foresightMaintenance.CheckCo2LevelsResponse> getCheckCo2LevelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckCo2Levels",
      requestType = grpc.foresightMaintenance.CheckCo2LevelsRequest.class,
      responseType = grpc.foresightMaintenance.CheckCo2LevelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.foresightMaintenance.CheckCo2LevelsRequest,
      grpc.foresightMaintenance.CheckCo2LevelsResponse> getCheckCo2LevelsMethod() {
    io.grpc.MethodDescriptor<grpc.foresightMaintenance.CheckCo2LevelsRequest, grpc.foresightMaintenance.CheckCo2LevelsResponse> getCheckCo2LevelsMethod;
    if ((getCheckCo2LevelsMethod = foresightMaintenanceGrpc.getCheckCo2LevelsMethod) == null) {
      synchronized (foresightMaintenanceGrpc.class) {
        if ((getCheckCo2LevelsMethod = foresightMaintenanceGrpc.getCheckCo2LevelsMethod) == null) {
          foresightMaintenanceGrpc.getCheckCo2LevelsMethod = getCheckCo2LevelsMethod = 
              io.grpc.MethodDescriptor.<grpc.foresightMaintenance.CheckCo2LevelsRequest, grpc.foresightMaintenance.CheckCo2LevelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "foresightMaintenance.foresightMaintenance", "CheckCo2Levels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.foresightMaintenance.CheckCo2LevelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.foresightMaintenance.CheckCo2LevelsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new foresightMaintenanceMethodDescriptorSupplier("CheckCo2Levels"))
                  .build();
          }
        }
     }
     return getCheckCo2LevelsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.foresightMaintenance.CheckElecUsageRequest,
      grpc.foresightMaintenance.CheckElecUsageResponse> getCheckElecUsageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckElecUsage",
      requestType = grpc.foresightMaintenance.CheckElecUsageRequest.class,
      responseType = grpc.foresightMaintenance.CheckElecUsageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.foresightMaintenance.CheckElecUsageRequest,
      grpc.foresightMaintenance.CheckElecUsageResponse> getCheckElecUsageMethod() {
    io.grpc.MethodDescriptor<grpc.foresightMaintenance.CheckElecUsageRequest, grpc.foresightMaintenance.CheckElecUsageResponse> getCheckElecUsageMethod;
    if ((getCheckElecUsageMethod = foresightMaintenanceGrpc.getCheckElecUsageMethod) == null) {
      synchronized (foresightMaintenanceGrpc.class) {
        if ((getCheckElecUsageMethod = foresightMaintenanceGrpc.getCheckElecUsageMethod) == null) {
          foresightMaintenanceGrpc.getCheckElecUsageMethod = getCheckElecUsageMethod = 
              io.grpc.MethodDescriptor.<grpc.foresightMaintenance.CheckElecUsageRequest, grpc.foresightMaintenance.CheckElecUsageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "foresightMaintenance.foresightMaintenance", "CheckElecUsage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.foresightMaintenance.CheckElecUsageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.foresightMaintenance.CheckElecUsageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new foresightMaintenanceMethodDescriptorSupplier("CheckElecUsage"))
                  .build();
          }
        }
     }
     return getCheckElecUsageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.foresightMaintenance.CheckDecibelLevelsRequest,
      grpc.foresightMaintenance.CheckDecibelLevelsResponse> getCheckDecibelLevelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckDecibelLevels",
      requestType = grpc.foresightMaintenance.CheckDecibelLevelsRequest.class,
      responseType = grpc.foresightMaintenance.CheckDecibelLevelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.foresightMaintenance.CheckDecibelLevelsRequest,
      grpc.foresightMaintenance.CheckDecibelLevelsResponse> getCheckDecibelLevelsMethod() {
    io.grpc.MethodDescriptor<grpc.foresightMaintenance.CheckDecibelLevelsRequest, grpc.foresightMaintenance.CheckDecibelLevelsResponse> getCheckDecibelLevelsMethod;
    if ((getCheckDecibelLevelsMethod = foresightMaintenanceGrpc.getCheckDecibelLevelsMethod) == null) {
      synchronized (foresightMaintenanceGrpc.class) {
        if ((getCheckDecibelLevelsMethod = foresightMaintenanceGrpc.getCheckDecibelLevelsMethod) == null) {
          foresightMaintenanceGrpc.getCheckDecibelLevelsMethod = getCheckDecibelLevelsMethod = 
              io.grpc.MethodDescriptor.<grpc.foresightMaintenance.CheckDecibelLevelsRequest, grpc.foresightMaintenance.CheckDecibelLevelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "foresightMaintenance.foresightMaintenance", "CheckDecibelLevels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.foresightMaintenance.CheckDecibelLevelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.foresightMaintenance.CheckDecibelLevelsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new foresightMaintenanceMethodDescriptorSupplier("CheckDecibelLevels"))
                  .build();
          }
        }
     }
     return getCheckDecibelLevelsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static foresightMaintenanceStub newStub(io.grpc.Channel channel) {
    return new foresightMaintenanceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static foresightMaintenanceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new foresightMaintenanceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static foresightMaintenanceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new foresightMaintenanceFutureStub(channel);
  }

  /**
   * <pre>
   * the foresight maintenance service definition
   * </pre>
   */
  public static abstract class foresightMaintenanceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * checks Co2 levels
     * bi - directional streaming server method
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.foresightMaintenance.CheckCo2LevelsRequest> checkCo2Levels(
        io.grpc.stub.StreamObserver<grpc.foresightMaintenance.CheckCo2LevelsResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getCheckCo2LevelsMethod(), responseObserver);
    }

    /**
     * <pre>
     * checks the electrical usage
     * bi - directional streaming server method
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.foresightMaintenance.CheckElecUsageRequest> checkElecUsage(
        io.grpc.stub.StreamObserver<grpc.foresightMaintenance.CheckElecUsageResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getCheckElecUsageMethod(), responseObserver);
    }

    /**
     * <pre>
     * checks the Decibel levels
     * client streaming service method
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.foresightMaintenance.CheckDecibelLevelsRequest> checkDecibelLevels(
        io.grpc.stub.StreamObserver<grpc.foresightMaintenance.CheckDecibelLevelsResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getCheckDecibelLevelsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCheckCo2LevelsMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                grpc.foresightMaintenance.CheckCo2LevelsRequest,
                grpc.foresightMaintenance.CheckCo2LevelsResponse>(
                  this, METHODID_CHECK_CO2LEVELS)))
          .addMethod(
            getCheckElecUsageMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                grpc.foresightMaintenance.CheckElecUsageRequest,
                grpc.foresightMaintenance.CheckElecUsageResponse>(
                  this, METHODID_CHECK_ELEC_USAGE)))
          .addMethod(
            getCheckDecibelLevelsMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                grpc.foresightMaintenance.CheckDecibelLevelsRequest,
                grpc.foresightMaintenance.CheckDecibelLevelsResponse>(
                  this, METHODID_CHECK_DECIBEL_LEVELS)))
          .build();
    }
  }

  /**
   * <pre>
   * the foresight maintenance service definition
   * </pre>
   */
  public static final class foresightMaintenanceStub extends io.grpc.stub.AbstractStub<foresightMaintenanceStub> {
    private foresightMaintenanceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private foresightMaintenanceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected foresightMaintenanceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new foresightMaintenanceStub(channel, callOptions);
    }

    /**
     * <pre>
     * checks Co2 levels
     * bi - directional streaming server method
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.foresightMaintenance.CheckCo2LevelsRequest> checkCo2Levels(
        io.grpc.stub.StreamObserver<grpc.foresightMaintenance.CheckCo2LevelsResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getCheckCo2LevelsMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * checks the electrical usage
     * bi - directional streaming server method
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.foresightMaintenance.CheckElecUsageRequest> checkElecUsage(
        io.grpc.stub.StreamObserver<grpc.foresightMaintenance.CheckElecUsageResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getCheckElecUsageMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * checks the Decibel levels
     * client streaming service method
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.foresightMaintenance.CheckDecibelLevelsRequest> checkDecibelLevels(
        io.grpc.stub.StreamObserver<grpc.foresightMaintenance.CheckDecibelLevelsResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getCheckDecibelLevelsMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * the foresight maintenance service definition
   * </pre>
   */
  public static final class foresightMaintenanceBlockingStub extends io.grpc.stub.AbstractStub<foresightMaintenanceBlockingStub> {
    private foresightMaintenanceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private foresightMaintenanceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected foresightMaintenanceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new foresightMaintenanceBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * the foresight maintenance service definition
   * </pre>
   */
  public static final class foresightMaintenanceFutureStub extends io.grpc.stub.AbstractStub<foresightMaintenanceFutureStub> {
    private foresightMaintenanceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private foresightMaintenanceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected foresightMaintenanceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new foresightMaintenanceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_CHECK_CO2LEVELS = 0;
  private static final int METHODID_CHECK_ELEC_USAGE = 1;
  private static final int METHODID_CHECK_DECIBEL_LEVELS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final foresightMaintenanceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(foresightMaintenanceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK_CO2LEVELS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.checkCo2Levels(
              (io.grpc.stub.StreamObserver<grpc.foresightMaintenance.CheckCo2LevelsResponse>) responseObserver);
        case METHODID_CHECK_ELEC_USAGE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.checkElecUsage(
              (io.grpc.stub.StreamObserver<grpc.foresightMaintenance.CheckElecUsageResponse>) responseObserver);
        case METHODID_CHECK_DECIBEL_LEVELS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.checkDecibelLevels(
              (io.grpc.stub.StreamObserver<grpc.foresightMaintenance.CheckDecibelLevelsResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class foresightMaintenanceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    foresightMaintenanceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.foresightMaintenance.foresightMaintenanceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("foresightMaintenance");
    }
  }

  private static final class foresightMaintenanceFileDescriptorSupplier
      extends foresightMaintenanceBaseDescriptorSupplier {
    foresightMaintenanceFileDescriptorSupplier() {}
  }

  private static final class foresightMaintenanceMethodDescriptorSupplier
      extends foresightMaintenanceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    foresightMaintenanceMethodDescriptorSupplier(String methodName) {
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
      synchronized (foresightMaintenanceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new foresightMaintenanceFileDescriptorSupplier())
              .addMethod(getCheckCo2LevelsMethod())
              .addMethod(getCheckElecUsageMethod())
              .addMethod(getCheckDecibelLevelsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
