package grpc.newForesightManagement;

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
 * Service Foresight Management
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: newForesightManagement.proto")
public final class newForesightManagementGrpc {

  private newForesightManagementGrpc() {}

  public static final String SERVICE_NAME = "newForesightManagement";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.newForesightManagement.containsString,
      grpc.newForesightManagement.containsString> getSendDecibelLevelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendDecibelLevels",
      requestType = grpc.newForesightManagement.containsString.class,
      responseType = grpc.newForesightManagement.containsString.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.newForesightManagement.containsString,
      grpc.newForesightManagement.containsString> getSendDecibelLevelsMethod() {
    io.grpc.MethodDescriptor<grpc.newForesightManagement.containsString, grpc.newForesightManagement.containsString> getSendDecibelLevelsMethod;
    if ((getSendDecibelLevelsMethod = newForesightManagementGrpc.getSendDecibelLevelsMethod) == null) {
      synchronized (newForesightManagementGrpc.class) {
        if ((getSendDecibelLevelsMethod = newForesightManagementGrpc.getSendDecibelLevelsMethod) == null) {
          newForesightManagementGrpc.getSendDecibelLevelsMethod = getSendDecibelLevelsMethod = 
              io.grpc.MethodDescriptor.<grpc.newForesightManagement.containsString, grpc.newForesightManagement.containsString>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "newForesightManagement", "SendDecibelLevels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.newForesightManagement.containsString.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.newForesightManagement.containsString.getDefaultInstance()))
                  .setSchemaDescriptor(new newForesightManagementMethodDescriptorSupplier("SendDecibelLevels"))
                  .build();
          }
        }
     }
     return getSendDecibelLevelsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.newForesightManagement.containsString,
      grpc.newForesightManagement.containsString> getCo2LevelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Co2Levels",
      requestType = grpc.newForesightManagement.containsString.class,
      responseType = grpc.newForesightManagement.containsString.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.newForesightManagement.containsString,
      grpc.newForesightManagement.containsString> getCo2LevelsMethod() {
    io.grpc.MethodDescriptor<grpc.newForesightManagement.containsString, grpc.newForesightManagement.containsString> getCo2LevelsMethod;
    if ((getCo2LevelsMethod = newForesightManagementGrpc.getCo2LevelsMethod) == null) {
      synchronized (newForesightManagementGrpc.class) {
        if ((getCo2LevelsMethod = newForesightManagementGrpc.getCo2LevelsMethod) == null) {
          newForesightManagementGrpc.getCo2LevelsMethod = getCo2LevelsMethod = 
              io.grpc.MethodDescriptor.<grpc.newForesightManagement.containsString, grpc.newForesightManagement.containsString>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "newForesightManagement", "Co2Levels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.newForesightManagement.containsString.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.newForesightManagement.containsString.getDefaultInstance()))
                  .setSchemaDescriptor(new newForesightManagementMethodDescriptorSupplier("Co2Levels"))
                  .build();
          }
        }
     }
     return getCo2LevelsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.newForesightManagement.containsString,
      grpc.newForesightManagement.containsString> getElecUsageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ElecUsage",
      requestType = grpc.newForesightManagement.containsString.class,
      responseType = grpc.newForesightManagement.containsString.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.newForesightManagement.containsString,
      grpc.newForesightManagement.containsString> getElecUsageMethod() {
    io.grpc.MethodDescriptor<grpc.newForesightManagement.containsString, grpc.newForesightManagement.containsString> getElecUsageMethod;
    if ((getElecUsageMethod = newForesightManagementGrpc.getElecUsageMethod) == null) {
      synchronized (newForesightManagementGrpc.class) {
        if ((getElecUsageMethod = newForesightManagementGrpc.getElecUsageMethod) == null) {
          newForesightManagementGrpc.getElecUsageMethod = getElecUsageMethod = 
              io.grpc.MethodDescriptor.<grpc.newForesightManagement.containsString, grpc.newForesightManagement.containsString>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "newForesightManagement", "ElecUsage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.newForesightManagement.containsString.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.newForesightManagement.containsString.getDefaultInstance()))
                  .setSchemaDescriptor(new newForesightManagementMethodDescriptorSupplier("ElecUsage"))
                  .build();
          }
        }
     }
     return getElecUsageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static newForesightManagementStub newStub(io.grpc.Channel channel) {
    return new newForesightManagementStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static newForesightManagementBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new newForesightManagementBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static newForesightManagementFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new newForesightManagementFutureStub(channel);
  }

  /**
   * <pre>
   * Service Foresight Management
   * </pre>
   */
  public static abstract class newForesightManagementImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *unary
     *rpc GetFirstString(containsString) returns (containsString){}
     *server streaming
     *rpc GetSecondString(containsString) returns (stream containsString){}
     *client Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.newForesightManagement.containsString> sendDecibelLevels(
        io.grpc.stub.StreamObserver<grpc.newForesightManagement.containsString> responseObserver) {
      return asyncUnimplementedStreamingCall(getSendDecibelLevelsMethod(), responseObserver);
    }

    /**
     * <pre>
     * bi-directional
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.newForesightManagement.containsString> co2Levels(
        io.grpc.stub.StreamObserver<grpc.newForesightManagement.containsString> responseObserver) {
      return asyncUnimplementedStreamingCall(getCo2LevelsMethod(), responseObserver);
    }

    /**
     * <pre>
     * bi-directional
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.newForesightManagement.containsString> elecUsage(
        io.grpc.stub.StreamObserver<grpc.newForesightManagement.containsString> responseObserver) {
      return asyncUnimplementedStreamingCall(getElecUsageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendDecibelLevelsMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                grpc.newForesightManagement.containsString,
                grpc.newForesightManagement.containsString>(
                  this, METHODID_SEND_DECIBEL_LEVELS)))
          .addMethod(
            getCo2LevelsMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                grpc.newForesightManagement.containsString,
                grpc.newForesightManagement.containsString>(
                  this, METHODID_CO2LEVELS)))
          .addMethod(
            getElecUsageMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                grpc.newForesightManagement.containsString,
                grpc.newForesightManagement.containsString>(
                  this, METHODID_ELEC_USAGE)))
          .build();
    }
  }

  /**
   * <pre>
   * Service Foresight Management
   * </pre>
   */
  public static final class newForesightManagementStub extends io.grpc.stub.AbstractStub<newForesightManagementStub> {
    private newForesightManagementStub(io.grpc.Channel channel) {
      super(channel);
    }

    private newForesightManagementStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected newForesightManagementStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new newForesightManagementStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     *rpc GetFirstString(containsString) returns (containsString){}
     *server streaming
     *rpc GetSecondString(containsString) returns (stream containsString){}
     *client Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.newForesightManagement.containsString> sendDecibelLevels(
        io.grpc.stub.StreamObserver<grpc.newForesightManagement.containsString> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getSendDecibelLevelsMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * bi-directional
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.newForesightManagement.containsString> co2Levels(
        io.grpc.stub.StreamObserver<grpc.newForesightManagement.containsString> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getCo2LevelsMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * bi-directional
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.newForesightManagement.containsString> elecUsage(
        io.grpc.stub.StreamObserver<grpc.newForesightManagement.containsString> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getElecUsageMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Service Foresight Management
   * </pre>
   */
  public static final class newForesightManagementBlockingStub extends io.grpc.stub.AbstractStub<newForesightManagementBlockingStub> {
    private newForesightManagementBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private newForesightManagementBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected newForesightManagementBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new newForesightManagementBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * Service Foresight Management
   * </pre>
   */
  public static final class newForesightManagementFutureStub extends io.grpc.stub.AbstractStub<newForesightManagementFutureStub> {
    private newForesightManagementFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private newForesightManagementFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected newForesightManagementFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new newForesightManagementFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SEND_DECIBEL_LEVELS = 0;
  private static final int METHODID_CO2LEVELS = 1;
  private static final int METHODID_ELEC_USAGE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final newForesightManagementImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(newForesightManagementImplBase serviceImpl, int methodId) {
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
        case METHODID_SEND_DECIBEL_LEVELS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendDecibelLevels(
              (io.grpc.stub.StreamObserver<grpc.newForesightManagement.containsString>) responseObserver);
        case METHODID_CO2LEVELS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.co2Levels(
              (io.grpc.stub.StreamObserver<grpc.newForesightManagement.containsString>) responseObserver);
        case METHODID_ELEC_USAGE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.elecUsage(
              (io.grpc.stub.StreamObserver<grpc.newForesightManagement.containsString>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class newForesightManagementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    newForesightManagementBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.newForesightManagement.NewForesightManagementImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("newForesightManagement");
    }
  }

  private static final class newForesightManagementFileDescriptorSupplier
      extends newForesightManagementBaseDescriptorSupplier {
    newForesightManagementFileDescriptorSupplier() {}
  }

  private static final class newForesightManagementMethodDescriptorSupplier
      extends newForesightManagementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    newForesightManagementMethodDescriptorSupplier(String methodName) {
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
      synchronized (newForesightManagementGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new newForesightManagementFileDescriptorSupplier())
              .addMethod(getSendDecibelLevelsMethod())
              .addMethod(getCo2LevelsMethod())
              .addMethod(getElecUsageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
