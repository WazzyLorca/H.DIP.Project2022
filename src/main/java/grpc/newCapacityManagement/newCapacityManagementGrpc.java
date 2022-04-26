package grpc.newCapacityManagement;

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
    comments = "Source: newCapacityManagement.proto")
public final class newCapacityManagementGrpc {

  private newCapacityManagementGrpc() {}

  public static final String SERVICE_NAME = "newCapacityManagement";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.newCapacityManagement.containsString,
      grpc.newCapacityManagement.containsString> getGetIdAccessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetIdAccess",
      requestType = grpc.newCapacityManagement.containsString.class,
      responseType = grpc.newCapacityManagement.containsString.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.newCapacityManagement.containsString,
      grpc.newCapacityManagement.containsString> getGetIdAccessMethod() {
    io.grpc.MethodDescriptor<grpc.newCapacityManagement.containsString, grpc.newCapacityManagement.containsString> getGetIdAccessMethod;
    if ((getGetIdAccessMethod = newCapacityManagementGrpc.getGetIdAccessMethod) == null) {
      synchronized (newCapacityManagementGrpc.class) {
        if ((getGetIdAccessMethod = newCapacityManagementGrpc.getGetIdAccessMethod) == null) {
          newCapacityManagementGrpc.getGetIdAccessMethod = getGetIdAccessMethod = 
              io.grpc.MethodDescriptor.<grpc.newCapacityManagement.containsString, grpc.newCapacityManagement.containsString>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "newCapacityManagement", "GetIdAccess"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.newCapacityManagement.containsString.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.newCapacityManagement.containsString.getDefaultInstance()))
                  .setSchemaDescriptor(new newCapacityManagementMethodDescriptorSupplier("GetIdAccess"))
                  .build();
          }
        }
     }
     return getGetIdAccessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.newCapacityManagement.containsString,
      grpc.newCapacityManagement.containsString> getSendCountPeopleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendCountPeople",
      requestType = grpc.newCapacityManagement.containsString.class,
      responseType = grpc.newCapacityManagement.containsString.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.newCapacityManagement.containsString,
      grpc.newCapacityManagement.containsString> getSendCountPeopleMethod() {
    io.grpc.MethodDescriptor<grpc.newCapacityManagement.containsString, grpc.newCapacityManagement.containsString> getSendCountPeopleMethod;
    if ((getSendCountPeopleMethod = newCapacityManagementGrpc.getSendCountPeopleMethod) == null) {
      synchronized (newCapacityManagementGrpc.class) {
        if ((getSendCountPeopleMethod = newCapacityManagementGrpc.getSendCountPeopleMethod) == null) {
          newCapacityManagementGrpc.getSendCountPeopleMethod = getSendCountPeopleMethod = 
              io.grpc.MethodDescriptor.<grpc.newCapacityManagement.containsString, grpc.newCapacityManagement.containsString>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "newCapacityManagement", "SendCountPeople"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.newCapacityManagement.containsString.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.newCapacityManagement.containsString.getDefaultInstance()))
                  .setSchemaDescriptor(new newCapacityManagementMethodDescriptorSupplier("SendCountPeople"))
                  .build();
          }
        }
     }
     return getSendCountPeopleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.newCapacityManagement.containsString,
      grpc.newCapacityManagement.containsString> getSendTerminalOccupiedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendTerminalOccupied",
      requestType = grpc.newCapacityManagement.containsString.class,
      responseType = grpc.newCapacityManagement.containsString.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.newCapacityManagement.containsString,
      grpc.newCapacityManagement.containsString> getSendTerminalOccupiedMethod() {
    io.grpc.MethodDescriptor<grpc.newCapacityManagement.containsString, grpc.newCapacityManagement.containsString> getSendTerminalOccupiedMethod;
    if ((getSendTerminalOccupiedMethod = newCapacityManagementGrpc.getSendTerminalOccupiedMethod) == null) {
      synchronized (newCapacityManagementGrpc.class) {
        if ((getSendTerminalOccupiedMethod = newCapacityManagementGrpc.getSendTerminalOccupiedMethod) == null) {
          newCapacityManagementGrpc.getSendTerminalOccupiedMethod = getSendTerminalOccupiedMethod = 
              io.grpc.MethodDescriptor.<grpc.newCapacityManagement.containsString, grpc.newCapacityManagement.containsString>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "newCapacityManagement", "SendTerminalOccupied"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.newCapacityManagement.containsString.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.newCapacityManagement.containsString.getDefaultInstance()))
                  .setSchemaDescriptor(new newCapacityManagementMethodDescriptorSupplier("SendTerminalOccupied"))
                  .build();
          }
        }
     }
     return getSendTerminalOccupiedMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static newCapacityManagementStub newStub(io.grpc.Channel channel) {
    return new newCapacityManagementStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static newCapacityManagementBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new newCapacityManagementBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static newCapacityManagementFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new newCapacityManagementFutureStub(channel);
  }

  /**
   */
  public static abstract class newCapacityManagementImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void getIdAccess(grpc.newCapacityManagement.containsString request,
        io.grpc.stub.StreamObserver<grpc.newCapacityManagement.containsString> responseObserver) {
      asyncUnimplementedUnaryCall(getGetIdAccessMethod(), responseObserver);
    }

    /**
     * <pre>
     *server streaming
     *rpc GetSecondString(containsString) returns (stream containsString){}
     *client Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.newCapacityManagement.containsString> sendCountPeople(
        io.grpc.stub.StreamObserver<grpc.newCapacityManagement.containsString> responseObserver) {
      return asyncUnimplementedStreamingCall(getSendCountPeopleMethod(), responseObserver);
    }

    /**
     * <pre>
     *client Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.newCapacityManagement.containsString> sendTerminalOccupied(
        io.grpc.stub.StreamObserver<grpc.newCapacityManagement.containsString> responseObserver) {
      return asyncUnimplementedStreamingCall(getSendTerminalOccupiedMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetIdAccessMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.newCapacityManagement.containsString,
                grpc.newCapacityManagement.containsString>(
                  this, METHODID_GET_ID_ACCESS)))
          .addMethod(
            getSendCountPeopleMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                grpc.newCapacityManagement.containsString,
                grpc.newCapacityManagement.containsString>(
                  this, METHODID_SEND_COUNT_PEOPLE)))
          .addMethod(
            getSendTerminalOccupiedMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                grpc.newCapacityManagement.containsString,
                grpc.newCapacityManagement.containsString>(
                  this, METHODID_SEND_TERMINAL_OCCUPIED)))
          .build();
    }
  }

  /**
   */
  public static final class newCapacityManagementStub extends io.grpc.stub.AbstractStub<newCapacityManagementStub> {
    private newCapacityManagementStub(io.grpc.Channel channel) {
      super(channel);
    }

    private newCapacityManagementStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected newCapacityManagementStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new newCapacityManagementStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void getIdAccess(grpc.newCapacityManagement.containsString request,
        io.grpc.stub.StreamObserver<grpc.newCapacityManagement.containsString> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetIdAccessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *server streaming
     *rpc GetSecondString(containsString) returns (stream containsString){}
     *client Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.newCapacityManagement.containsString> sendCountPeople(
        io.grpc.stub.StreamObserver<grpc.newCapacityManagement.containsString> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getSendCountPeopleMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *client Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.newCapacityManagement.containsString> sendTerminalOccupied(
        io.grpc.stub.StreamObserver<grpc.newCapacityManagement.containsString> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getSendTerminalOccupiedMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class newCapacityManagementBlockingStub extends io.grpc.stub.AbstractStub<newCapacityManagementBlockingStub> {
    private newCapacityManagementBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private newCapacityManagementBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected newCapacityManagementBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new newCapacityManagementBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public grpc.newCapacityManagement.containsString getIdAccess(grpc.newCapacityManagement.containsString request) {
      return blockingUnaryCall(
          getChannel(), getGetIdAccessMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class newCapacityManagementFutureStub extends io.grpc.stub.AbstractStub<newCapacityManagementFutureStub> {
    private newCapacityManagementFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private newCapacityManagementFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected newCapacityManagementFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new newCapacityManagementFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.newCapacityManagement.containsString> getIdAccess(
        grpc.newCapacityManagement.containsString request) {
      return futureUnaryCall(
          getChannel().newCall(getGetIdAccessMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ID_ACCESS = 0;
  private static final int METHODID_SEND_COUNT_PEOPLE = 1;
  private static final int METHODID_SEND_TERMINAL_OCCUPIED = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final newCapacityManagementImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(newCapacityManagementImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ID_ACCESS:
          serviceImpl.getIdAccess((grpc.newCapacityManagement.containsString) request,
              (io.grpc.stub.StreamObserver<grpc.newCapacityManagement.containsString>) responseObserver);
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
        case METHODID_SEND_COUNT_PEOPLE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendCountPeople(
              (io.grpc.stub.StreamObserver<grpc.newCapacityManagement.containsString>) responseObserver);
        case METHODID_SEND_TERMINAL_OCCUPIED:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendTerminalOccupied(
              (io.grpc.stub.StreamObserver<grpc.newCapacityManagement.containsString>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class newCapacityManagementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    newCapacityManagementBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.newCapacityManagement.NewCapacityManagementImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("newCapacityManagement");
    }
  }

  private static final class newCapacityManagementFileDescriptorSupplier
      extends newCapacityManagementBaseDescriptorSupplier {
    newCapacityManagementFileDescriptorSupplier() {}
  }

  private static final class newCapacityManagementMethodDescriptorSupplier
      extends newCapacityManagementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    newCapacityManagementMethodDescriptorSupplier(String methodName) {
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
      synchronized (newCapacityManagementGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new newCapacityManagementFileDescriptorSupplier())
              .addMethod(getGetIdAccessMethod())
              .addMethod(getSendCountPeopleMethod())
              .addMethod(getSendTerminalOccupiedMethod())
              .build();
        }
      }
    }
    return result;
  }
}
