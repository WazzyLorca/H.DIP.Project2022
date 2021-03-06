package grpc.newEnergyEfficiency;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: newEnergyEfficiency.proto")
public final class newEnergyEfficiencyGrpc {

  private newEnergyEfficiencyGrpc() {}

  public static final String SERVICE_NAME = "newEnergyEfficiency";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.newEnergyEfficiency.containsString,
      grpc.newEnergyEfficiency.containsString> getGetFirstStringMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFirstString",
      requestType = grpc.newEnergyEfficiency.containsString.class,
      responseType = grpc.newEnergyEfficiency.containsString.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.newEnergyEfficiency.containsString,
      grpc.newEnergyEfficiency.containsString> getGetFirstStringMethod() {
    io.grpc.MethodDescriptor<grpc.newEnergyEfficiency.containsString, grpc.newEnergyEfficiency.containsString> getGetFirstStringMethod;
    if ((getGetFirstStringMethod = newEnergyEfficiencyGrpc.getGetFirstStringMethod) == null) {
      synchronized (newEnergyEfficiencyGrpc.class) {
        if ((getGetFirstStringMethod = newEnergyEfficiencyGrpc.getGetFirstStringMethod) == null) {
          newEnergyEfficiencyGrpc.getGetFirstStringMethod = getGetFirstStringMethod = 
              io.grpc.MethodDescriptor.<grpc.newEnergyEfficiency.containsString, grpc.newEnergyEfficiency.containsString>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "newEnergyEfficiency", "GetFirstString"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.newEnergyEfficiency.containsString.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.newEnergyEfficiency.containsString.getDefaultInstance()))
                  .setSchemaDescriptor(new newEnergyEfficiencyMethodDescriptorSupplier("GetFirstString"))
                  .build();
          }
        }
     }
     return getGetFirstStringMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.newEnergyEfficiency.requestPres,
      grpc.newEnergyEfficiency.responsePres> getGetPresRoomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPresRoom",
      requestType = grpc.newEnergyEfficiency.requestPres.class,
      responseType = grpc.newEnergyEfficiency.responsePres.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.newEnergyEfficiency.requestPres,
      grpc.newEnergyEfficiency.responsePres> getGetPresRoomMethod() {
    io.grpc.MethodDescriptor<grpc.newEnergyEfficiency.requestPres, grpc.newEnergyEfficiency.responsePres> getGetPresRoomMethod;
    if ((getGetPresRoomMethod = newEnergyEfficiencyGrpc.getGetPresRoomMethod) == null) {
      synchronized (newEnergyEfficiencyGrpc.class) {
        if ((getGetPresRoomMethod = newEnergyEfficiencyGrpc.getGetPresRoomMethod) == null) {
          newEnergyEfficiencyGrpc.getGetPresRoomMethod = getGetPresRoomMethod = 
              io.grpc.MethodDescriptor.<grpc.newEnergyEfficiency.requestPres, grpc.newEnergyEfficiency.responsePres>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "newEnergyEfficiency", "GetPresRoom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.newEnergyEfficiency.requestPres.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.newEnergyEfficiency.responsePres.getDefaultInstance()))
                  .setSchemaDescriptor(new newEnergyEfficiencyMethodDescriptorSupplier("GetPresRoom"))
                  .build();
          }
        }
     }
     return getGetPresRoomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.newEnergyEfficiency.requestLights,
      grpc.newEnergyEfficiency.responseLights> getGetLightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLights",
      requestType = grpc.newEnergyEfficiency.requestLights.class,
      responseType = grpc.newEnergyEfficiency.responseLights.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.newEnergyEfficiency.requestLights,
      grpc.newEnergyEfficiency.responseLights> getGetLightsMethod() {
    io.grpc.MethodDescriptor<grpc.newEnergyEfficiency.requestLights, grpc.newEnergyEfficiency.responseLights> getGetLightsMethod;
    if ((getGetLightsMethod = newEnergyEfficiencyGrpc.getGetLightsMethod) == null) {
      synchronized (newEnergyEfficiencyGrpc.class) {
        if ((getGetLightsMethod = newEnergyEfficiencyGrpc.getGetLightsMethod) == null) {
          newEnergyEfficiencyGrpc.getGetLightsMethod = getGetLightsMethod = 
              io.grpc.MethodDescriptor.<grpc.newEnergyEfficiency.requestLights, grpc.newEnergyEfficiency.responseLights>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "newEnergyEfficiency", "GetLights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.newEnergyEfficiency.requestLights.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.newEnergyEfficiency.responseLights.getDefaultInstance()))
                  .setSchemaDescriptor(new newEnergyEfficiencyMethodDescriptorSupplier("GetLights"))
                  .build();
          }
        }
     }
     return getGetLightsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.newEnergyEfficiency.requestHeat,
      grpc.newEnergyEfficiency.responseHeat> getGetHeatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHeat",
      requestType = grpc.newEnergyEfficiency.requestHeat.class,
      responseType = grpc.newEnergyEfficiency.responseHeat.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.newEnergyEfficiency.requestHeat,
      grpc.newEnergyEfficiency.responseHeat> getGetHeatMethod() {
    io.grpc.MethodDescriptor<grpc.newEnergyEfficiency.requestHeat, grpc.newEnergyEfficiency.responseHeat> getGetHeatMethod;
    if ((getGetHeatMethod = newEnergyEfficiencyGrpc.getGetHeatMethod) == null) {
      synchronized (newEnergyEfficiencyGrpc.class) {
        if ((getGetHeatMethod = newEnergyEfficiencyGrpc.getGetHeatMethod) == null) {
          newEnergyEfficiencyGrpc.getGetHeatMethod = getGetHeatMethod = 
              io.grpc.MethodDescriptor.<grpc.newEnergyEfficiency.requestHeat, grpc.newEnergyEfficiency.responseHeat>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "newEnergyEfficiency", "GetHeat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.newEnergyEfficiency.requestHeat.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.newEnergyEfficiency.responseHeat.getDefaultInstance()))
                  .setSchemaDescriptor(new newEnergyEfficiencyMethodDescriptorSupplier("GetHeat"))
                  .build();
          }
        }
     }
     return getGetHeatMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static newEnergyEfficiencyStub newStub(io.grpc.Channel channel) {
    return new newEnergyEfficiencyStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static newEnergyEfficiencyBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new newEnergyEfficiencyBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static newEnergyEfficiencyFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new newEnergyEfficiencyFutureStub(channel);
  }

  /**
   */
  public static abstract class newEnergyEfficiencyImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void getFirstString(grpc.newEnergyEfficiency.containsString request,
        io.grpc.stub.StreamObserver<grpc.newEnergyEfficiency.containsString> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFirstStringMethod(), responseObserver);
    }

    /**
     * <pre>
     *unary - presentation room
     * </pre>
     */
    public void getPresRoom(grpc.newEnergyEfficiency.requestPres request,
        io.grpc.stub.StreamObserver<grpc.newEnergyEfficiency.responsePres> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPresRoomMethod(), responseObserver);
    }

    /**
     * <pre>
     *server streaming Lights
     * </pre>
     */
    public void getLights(grpc.newEnergyEfficiency.requestLights request,
        io.grpc.stub.StreamObserver<grpc.newEnergyEfficiency.responseLights> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLightsMethod(), responseObserver);
    }

    /**
     * <pre>
     *server streaming Heat
     * </pre>
     */
    public void getHeat(grpc.newEnergyEfficiency.requestHeat request,
        io.grpc.stub.StreamObserver<grpc.newEnergyEfficiency.responseHeat> responseObserver) {
      asyncUnimplementedUnaryCall(getGetHeatMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetFirstStringMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.newEnergyEfficiency.containsString,
                grpc.newEnergyEfficiency.containsString>(
                  this, METHODID_GET_FIRST_STRING)))
          .addMethod(
            getGetPresRoomMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.newEnergyEfficiency.requestPres,
                grpc.newEnergyEfficiency.responsePres>(
                  this, METHODID_GET_PRES_ROOM)))
          .addMethod(
            getGetLightsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                grpc.newEnergyEfficiency.requestLights,
                grpc.newEnergyEfficiency.responseLights>(
                  this, METHODID_GET_LIGHTS)))
          .addMethod(
            getGetHeatMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                grpc.newEnergyEfficiency.requestHeat,
                grpc.newEnergyEfficiency.responseHeat>(
                  this, METHODID_GET_HEAT)))
          .build();
    }
  }

  /**
   */
  public static final class newEnergyEfficiencyStub extends io.grpc.stub.AbstractStub<newEnergyEfficiencyStub> {
    private newEnergyEfficiencyStub(io.grpc.Channel channel) {
      super(channel);
    }

    private newEnergyEfficiencyStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected newEnergyEfficiencyStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new newEnergyEfficiencyStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void getFirstString(grpc.newEnergyEfficiency.containsString request,
        io.grpc.stub.StreamObserver<grpc.newEnergyEfficiency.containsString> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFirstStringMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *unary - presentation room
     * </pre>
     */
    public void getPresRoom(grpc.newEnergyEfficiency.requestPres request,
        io.grpc.stub.StreamObserver<grpc.newEnergyEfficiency.responsePres> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPresRoomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *server streaming Lights
     * </pre>
     */
    public void getLights(grpc.newEnergyEfficiency.requestLights request,
        io.grpc.stub.StreamObserver<grpc.newEnergyEfficiency.responseLights> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetLightsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *server streaming Heat
     * </pre>
     */
    public void getHeat(grpc.newEnergyEfficiency.requestHeat request,
        io.grpc.stub.StreamObserver<grpc.newEnergyEfficiency.responseHeat> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetHeatMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class newEnergyEfficiencyBlockingStub extends io.grpc.stub.AbstractStub<newEnergyEfficiencyBlockingStub> {
    private newEnergyEfficiencyBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private newEnergyEfficiencyBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected newEnergyEfficiencyBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new newEnergyEfficiencyBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public grpc.newEnergyEfficiency.containsString getFirstString(grpc.newEnergyEfficiency.containsString request) {
      return blockingUnaryCall(
          getChannel(), getGetFirstStringMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *unary - presentation room
     * </pre>
     */
    public grpc.newEnergyEfficiency.responsePres getPresRoom(grpc.newEnergyEfficiency.requestPres request) {
      return blockingUnaryCall(
          getChannel(), getGetPresRoomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *server streaming Lights
     * </pre>
     */
    public java.util.Iterator<grpc.newEnergyEfficiency.responseLights> getLights(
        grpc.newEnergyEfficiency.requestLights request) {
      return blockingServerStreamingCall(
          getChannel(), getGetLightsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *server streaming Heat
     * </pre>
     */
    public java.util.Iterator<grpc.newEnergyEfficiency.responseHeat> getHeat(
        grpc.newEnergyEfficiency.requestHeat request) {
      return blockingServerStreamingCall(
          getChannel(), getGetHeatMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class newEnergyEfficiencyFutureStub extends io.grpc.stub.AbstractStub<newEnergyEfficiencyFutureStub> {
    private newEnergyEfficiencyFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private newEnergyEfficiencyFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected newEnergyEfficiencyFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new newEnergyEfficiencyFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.newEnergyEfficiency.containsString> getFirstString(
        grpc.newEnergyEfficiency.containsString request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFirstStringMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *unary - presentation room
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.newEnergyEfficiency.responsePres> getPresRoom(
        grpc.newEnergyEfficiency.requestPres request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPresRoomMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FIRST_STRING = 0;
  private static final int METHODID_GET_PRES_ROOM = 1;
  private static final int METHODID_GET_LIGHTS = 2;
  private static final int METHODID_GET_HEAT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final newEnergyEfficiencyImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(newEnergyEfficiencyImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_FIRST_STRING:
          serviceImpl.getFirstString((grpc.newEnergyEfficiency.containsString) request,
              (io.grpc.stub.StreamObserver<grpc.newEnergyEfficiency.containsString>) responseObserver);
          break;
        case METHODID_GET_PRES_ROOM:
          serviceImpl.getPresRoom((grpc.newEnergyEfficiency.requestPres) request,
              (io.grpc.stub.StreamObserver<grpc.newEnergyEfficiency.responsePres>) responseObserver);
          break;
        case METHODID_GET_LIGHTS:
          serviceImpl.getLights((grpc.newEnergyEfficiency.requestLights) request,
              (io.grpc.stub.StreamObserver<grpc.newEnergyEfficiency.responseLights>) responseObserver);
          break;
        case METHODID_GET_HEAT:
          serviceImpl.getHeat((grpc.newEnergyEfficiency.requestHeat) request,
              (io.grpc.stub.StreamObserver<grpc.newEnergyEfficiency.responseHeat>) responseObserver);
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

  private static abstract class newEnergyEfficiencyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    newEnergyEfficiencyBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.newEnergyEfficiency.NewnEnergyEfficiencyImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("newEnergyEfficiency");
    }
  }

  private static final class newEnergyEfficiencyFileDescriptorSupplier
      extends newEnergyEfficiencyBaseDescriptorSupplier {
    newEnergyEfficiencyFileDescriptorSupplier() {}
  }

  private static final class newEnergyEfficiencyMethodDescriptorSupplier
      extends newEnergyEfficiencyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    newEnergyEfficiencyMethodDescriptorSupplier(String methodName) {
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
      synchronized (newEnergyEfficiencyGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new newEnergyEfficiencyFileDescriptorSupplier())
              .addMethod(getGetFirstStringMethod())
              .addMethod(getGetPresRoomMethod())
              .addMethod(getGetLightsMethod())
              .addMethod(getGetHeatMethod())
              .build();
        }
      }
    }
    return result;
  }
}
