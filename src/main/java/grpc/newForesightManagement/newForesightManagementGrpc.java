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
      grpc.newForesightManagement.containsString> getGetFirstStringMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFirstString",
      requestType = grpc.newForesightManagement.containsString.class,
      responseType = grpc.newForesightManagement.containsString.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.newForesightManagement.containsString,
      grpc.newForesightManagement.containsString> getGetFirstStringMethod() {
    io.grpc.MethodDescriptor<grpc.newForesightManagement.containsString, grpc.newForesightManagement.containsString> getGetFirstStringMethod;
    if ((getGetFirstStringMethod = newForesightManagementGrpc.getGetFirstStringMethod) == null) {
      synchronized (newForesightManagementGrpc.class) {
        if ((getGetFirstStringMethod = newForesightManagementGrpc.getGetFirstStringMethod) == null) {
          newForesightManagementGrpc.getGetFirstStringMethod = getGetFirstStringMethod = 
              io.grpc.MethodDescriptor.<grpc.newForesightManagement.containsString, grpc.newForesightManagement.containsString>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "newForesightManagement", "GetFirstString"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.newForesightManagement.containsString.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.newForesightManagement.containsString.getDefaultInstance()))
                  .setSchemaDescriptor(new newForesightManagementMethodDescriptorSupplier("GetFirstString"))
                  .build();
          }
        }
     }
     return getGetFirstStringMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.newForesightManagement.containsString,
      grpc.newForesightManagement.newResponse> getGetFirstIntMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFirstInt",
      requestType = grpc.newForesightManagement.containsString.class,
      responseType = grpc.newForesightManagement.newResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.newForesightManagement.containsString,
      grpc.newForesightManagement.newResponse> getGetFirstIntMethod() {
    io.grpc.MethodDescriptor<grpc.newForesightManagement.containsString, grpc.newForesightManagement.newResponse> getGetFirstIntMethod;
    if ((getGetFirstIntMethod = newForesightManagementGrpc.getGetFirstIntMethod) == null) {
      synchronized (newForesightManagementGrpc.class) {
        if ((getGetFirstIntMethod = newForesightManagementGrpc.getGetFirstIntMethod) == null) {
          newForesightManagementGrpc.getGetFirstIntMethod = getGetFirstIntMethod = 
              io.grpc.MethodDescriptor.<grpc.newForesightManagement.containsString, grpc.newForesightManagement.newResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "newForesightManagement", "GetFirstInt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.newForesightManagement.containsString.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.newForesightManagement.newResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new newForesightManagementMethodDescriptorSupplier("GetFirstInt"))
                  .build();
          }
        }
     }
     return getGetFirstIntMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.newForesightManagement.requestDecibel,
      grpc.newForesightManagement.responseDecibel> getGetDecibelLevelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDecibelLevels",
      requestType = grpc.newForesightManagement.requestDecibel.class,
      responseType = grpc.newForesightManagement.responseDecibel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.newForesightManagement.requestDecibel,
      grpc.newForesightManagement.responseDecibel> getGetDecibelLevelsMethod() {
    io.grpc.MethodDescriptor<grpc.newForesightManagement.requestDecibel, grpc.newForesightManagement.responseDecibel> getGetDecibelLevelsMethod;
    if ((getGetDecibelLevelsMethod = newForesightManagementGrpc.getGetDecibelLevelsMethod) == null) {
      synchronized (newForesightManagementGrpc.class) {
        if ((getGetDecibelLevelsMethod = newForesightManagementGrpc.getGetDecibelLevelsMethod) == null) {
          newForesightManagementGrpc.getGetDecibelLevelsMethod = getGetDecibelLevelsMethod = 
              io.grpc.MethodDescriptor.<grpc.newForesightManagement.requestDecibel, grpc.newForesightManagement.responseDecibel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "newForesightManagement", "GetDecibelLevels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.newForesightManagement.requestDecibel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.newForesightManagement.responseDecibel.getDefaultInstance()))
                  .setSchemaDescriptor(new newForesightManagementMethodDescriptorSupplier("GetDecibelLevels"))
                  .build();
          }
        }
     }
     return getGetDecibelLevelsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.newForesightManagement.requestCo2Level,
      grpc.newForesightManagement.responseCo2Level> getGetCo2LevelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCo2Levels",
      requestType = grpc.newForesightManagement.requestCo2Level.class,
      responseType = grpc.newForesightManagement.responseCo2Level.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.newForesightManagement.requestCo2Level,
      grpc.newForesightManagement.responseCo2Level> getGetCo2LevelsMethod() {
    io.grpc.MethodDescriptor<grpc.newForesightManagement.requestCo2Level, grpc.newForesightManagement.responseCo2Level> getGetCo2LevelsMethod;
    if ((getGetCo2LevelsMethod = newForesightManagementGrpc.getGetCo2LevelsMethod) == null) {
      synchronized (newForesightManagementGrpc.class) {
        if ((getGetCo2LevelsMethod = newForesightManagementGrpc.getGetCo2LevelsMethod) == null) {
          newForesightManagementGrpc.getGetCo2LevelsMethod = getGetCo2LevelsMethod = 
              io.grpc.MethodDescriptor.<grpc.newForesightManagement.requestCo2Level, grpc.newForesightManagement.responseCo2Level>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "newForesightManagement", "GetCo2Levels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.newForesightManagement.requestCo2Level.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.newForesightManagement.responseCo2Level.getDefaultInstance()))
                  .setSchemaDescriptor(new newForesightManagementMethodDescriptorSupplier("GetCo2Levels"))
                  .build();
          }
        }
     }
     return getGetCo2LevelsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.newForesightManagement.requestElecUsage,
      grpc.newForesightManagement.responseElecUsage> getGetElecUsageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetElecUsage",
      requestType = grpc.newForesightManagement.requestElecUsage.class,
      responseType = grpc.newForesightManagement.responseElecUsage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.newForesightManagement.requestElecUsage,
      grpc.newForesightManagement.responseElecUsage> getGetElecUsageMethod() {
    io.grpc.MethodDescriptor<grpc.newForesightManagement.requestElecUsage, grpc.newForesightManagement.responseElecUsage> getGetElecUsageMethod;
    if ((getGetElecUsageMethod = newForesightManagementGrpc.getGetElecUsageMethod) == null) {
      synchronized (newForesightManagementGrpc.class) {
        if ((getGetElecUsageMethod = newForesightManagementGrpc.getGetElecUsageMethod) == null) {
          newForesightManagementGrpc.getGetElecUsageMethod = getGetElecUsageMethod = 
              io.grpc.MethodDescriptor.<grpc.newForesightManagement.requestElecUsage, grpc.newForesightManagement.responseElecUsage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "newForesightManagement", "GetElecUsage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.newForesightManagement.requestElecUsage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.newForesightManagement.responseElecUsage.getDefaultInstance()))
                  .setSchemaDescriptor(new newForesightManagementMethodDescriptorSupplier("GetElecUsage"))
                  .build();
          }
        }
     }
     return getGetElecUsageMethod;
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
     * </pre>
     */
    public void getFirstString(grpc.newForesightManagement.containsString request,
        io.grpc.stub.StreamObserver<grpc.newForesightManagement.containsString> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFirstStringMethod(), responseObserver);
    }

    /**
     */
    public void getFirstInt(grpc.newForesightManagement.containsString request,
        io.grpc.stub.StreamObserver<grpc.newForesightManagement.newResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFirstIntMethod(), responseObserver);
    }

    /**
     * <pre>
     *client Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.newForesightManagement.requestDecibel> getDecibelLevels(
        io.grpc.stub.StreamObserver<grpc.newForesightManagement.responseDecibel> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetDecibelLevelsMethod(), responseObserver);
    }

    /**
     * <pre>
     * bi-directional
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.newForesightManagement.requestCo2Level> getCo2Levels(
        io.grpc.stub.StreamObserver<grpc.newForesightManagement.responseCo2Level> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetCo2LevelsMethod(), responseObserver);
    }

    /**
     * <pre>
     * bi-directional
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.newForesightManagement.requestElecUsage> getElecUsage(
        io.grpc.stub.StreamObserver<grpc.newForesightManagement.responseElecUsage> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetElecUsageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetFirstStringMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.newForesightManagement.containsString,
                grpc.newForesightManagement.containsString>(
                  this, METHODID_GET_FIRST_STRING)))
          .addMethod(
            getGetFirstIntMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.newForesightManagement.containsString,
                grpc.newForesightManagement.newResponse>(
                  this, METHODID_GET_FIRST_INT)))
          .addMethod(
            getGetDecibelLevelsMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                grpc.newForesightManagement.requestDecibel,
                grpc.newForesightManagement.responseDecibel>(
                  this, METHODID_GET_DECIBEL_LEVELS)))
          .addMethod(
            getGetCo2LevelsMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                grpc.newForesightManagement.requestCo2Level,
                grpc.newForesightManagement.responseCo2Level>(
                  this, METHODID_GET_CO2LEVELS)))
          .addMethod(
            getGetElecUsageMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                grpc.newForesightManagement.requestElecUsage,
                grpc.newForesightManagement.responseElecUsage>(
                  this, METHODID_GET_ELEC_USAGE)))
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
     * </pre>
     */
    public void getFirstString(grpc.newForesightManagement.containsString request,
        io.grpc.stub.StreamObserver<grpc.newForesightManagement.containsString> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFirstStringMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFirstInt(grpc.newForesightManagement.containsString request,
        io.grpc.stub.StreamObserver<grpc.newForesightManagement.newResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFirstIntMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *client Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.newForesightManagement.requestDecibel> getDecibelLevels(
        io.grpc.stub.StreamObserver<grpc.newForesightManagement.responseDecibel> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getGetDecibelLevelsMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * bi-directional
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.newForesightManagement.requestCo2Level> getCo2Levels(
        io.grpc.stub.StreamObserver<grpc.newForesightManagement.responseCo2Level> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getGetCo2LevelsMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * bi-directional
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.newForesightManagement.requestElecUsage> getElecUsage(
        io.grpc.stub.StreamObserver<grpc.newForesightManagement.responseElecUsage> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getGetElecUsageMethod(), getCallOptions()), responseObserver);
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

    /**
     * <pre>
     *unary
     * </pre>
     */
    public grpc.newForesightManagement.containsString getFirstString(grpc.newForesightManagement.containsString request) {
      return blockingUnaryCall(
          getChannel(), getGetFirstStringMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.newForesightManagement.newResponse getFirstInt(grpc.newForesightManagement.containsString request) {
      return blockingUnaryCall(
          getChannel(), getGetFirstIntMethod(), getCallOptions(), request);
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

    /**
     * <pre>
     *unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.newForesightManagement.containsString> getFirstString(
        grpc.newForesightManagement.containsString request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFirstStringMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.newForesightManagement.newResponse> getFirstInt(
        grpc.newForesightManagement.containsString request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFirstIntMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FIRST_STRING = 0;
  private static final int METHODID_GET_FIRST_INT = 1;
  private static final int METHODID_GET_DECIBEL_LEVELS = 2;
  private static final int METHODID_GET_CO2LEVELS = 3;
  private static final int METHODID_GET_ELEC_USAGE = 4;

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
        case METHODID_GET_FIRST_STRING:
          serviceImpl.getFirstString((grpc.newForesightManagement.containsString) request,
              (io.grpc.stub.StreamObserver<grpc.newForesightManagement.containsString>) responseObserver);
          break;
        case METHODID_GET_FIRST_INT:
          serviceImpl.getFirstInt((grpc.newForesightManagement.containsString) request,
              (io.grpc.stub.StreamObserver<grpc.newForesightManagement.newResponse>) responseObserver);
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
        case METHODID_GET_DECIBEL_LEVELS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getDecibelLevels(
              (io.grpc.stub.StreamObserver<grpc.newForesightManagement.responseDecibel>) responseObserver);
        case METHODID_GET_CO2LEVELS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getCo2Levels(
              (io.grpc.stub.StreamObserver<grpc.newForesightManagement.responseCo2Level>) responseObserver);
        case METHODID_GET_ELEC_USAGE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getElecUsage(
              (io.grpc.stub.StreamObserver<grpc.newForesightManagement.responseElecUsage>) responseObserver);
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
              .addMethod(getGetFirstStringMethod())
              .addMethod(getGetFirstIntMethod())
              .addMethod(getGetDecibelLevelsMethod())
              .addMethod(getGetCo2LevelsMethod())
              .addMethod(getGetElecUsageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
