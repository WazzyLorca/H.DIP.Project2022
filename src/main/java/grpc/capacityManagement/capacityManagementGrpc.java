package grpc.capacityManagement;

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
 * the capacityManagement service definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: capacityManagement.proto")
public final class capacityManagementGrpc {

  private capacityManagementGrpc() {}

  public static final String SERVICE_NAME = "capacityManagement.capacityManagement";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.capacityManagement.IdAccessRequest,
      grpc.capacityManagement.IdAccessResponse> getCreateIdAccessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateIdAccess",
      requestType = grpc.capacityManagement.IdAccessRequest.class,
      responseType = grpc.capacityManagement.IdAccessResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.capacityManagement.IdAccessRequest,
      grpc.capacityManagement.IdAccessResponse> getCreateIdAccessMethod() {
    io.grpc.MethodDescriptor<grpc.capacityManagement.IdAccessRequest, grpc.capacityManagement.IdAccessResponse> getCreateIdAccessMethod;
    if ((getCreateIdAccessMethod = capacityManagementGrpc.getCreateIdAccessMethod) == null) {
      synchronized (capacityManagementGrpc.class) {
        if ((getCreateIdAccessMethod = capacityManagementGrpc.getCreateIdAccessMethod) == null) {
          capacityManagementGrpc.getCreateIdAccessMethod = getCreateIdAccessMethod = 
              io.grpc.MethodDescriptor.<grpc.capacityManagement.IdAccessRequest, grpc.capacityManagement.IdAccessResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "capacityManagement.capacityManagement", "CreateIdAccess"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.capacityManagement.IdAccessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.capacityManagement.IdAccessResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new capacityManagementMethodDescriptorSupplier("CreateIdAccess"))
                  .build();
          }
        }
     }
     return getCreateIdAccessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.capacityManagement.UpdateCountPeopleRequest,
      grpc.capacityManagement.UpdateCountPeopleResponse> getCSCountPeopleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CSCountPeople",
      requestType = grpc.capacityManagement.UpdateCountPeopleRequest.class,
      responseType = grpc.capacityManagement.UpdateCountPeopleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.capacityManagement.UpdateCountPeopleRequest,
      grpc.capacityManagement.UpdateCountPeopleResponse> getCSCountPeopleMethod() {
    io.grpc.MethodDescriptor<grpc.capacityManagement.UpdateCountPeopleRequest, grpc.capacityManagement.UpdateCountPeopleResponse> getCSCountPeopleMethod;
    if ((getCSCountPeopleMethod = capacityManagementGrpc.getCSCountPeopleMethod) == null) {
      synchronized (capacityManagementGrpc.class) {
        if ((getCSCountPeopleMethod = capacityManagementGrpc.getCSCountPeopleMethod) == null) {
          capacityManagementGrpc.getCSCountPeopleMethod = getCSCountPeopleMethod = 
              io.grpc.MethodDescriptor.<grpc.capacityManagement.UpdateCountPeopleRequest, grpc.capacityManagement.UpdateCountPeopleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "capacityManagement.capacityManagement", "CSCountPeople"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.capacityManagement.UpdateCountPeopleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.capacityManagement.UpdateCountPeopleResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new capacityManagementMethodDescriptorSupplier("CSCountPeople"))
                  .build();
          }
        }
     }
     return getCSCountPeopleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.capacityManagement.TerminalOccupiedRequest,
      grpc.capacityManagement.TerminalOccupiedResponse> getCSTerminalOccupiedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CSTerminalOccupied",
      requestType = grpc.capacityManagement.TerminalOccupiedRequest.class,
      responseType = grpc.capacityManagement.TerminalOccupiedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.capacityManagement.TerminalOccupiedRequest,
      grpc.capacityManagement.TerminalOccupiedResponse> getCSTerminalOccupiedMethod() {
    io.grpc.MethodDescriptor<grpc.capacityManagement.TerminalOccupiedRequest, grpc.capacityManagement.TerminalOccupiedResponse> getCSTerminalOccupiedMethod;
    if ((getCSTerminalOccupiedMethod = capacityManagementGrpc.getCSTerminalOccupiedMethod) == null) {
      synchronized (capacityManagementGrpc.class) {
        if ((getCSTerminalOccupiedMethod = capacityManagementGrpc.getCSTerminalOccupiedMethod) == null) {
          capacityManagementGrpc.getCSTerminalOccupiedMethod = getCSTerminalOccupiedMethod = 
              io.grpc.MethodDescriptor.<grpc.capacityManagement.TerminalOccupiedRequest, grpc.capacityManagement.TerminalOccupiedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "capacityManagement.capacityManagement", "CSTerminalOccupied"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.capacityManagement.TerminalOccupiedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.capacityManagement.TerminalOccupiedResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new capacityManagementMethodDescriptorSupplier("CSTerminalOccupied"))
                  .build();
          }
        }
     }
     return getCSTerminalOccupiedMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static capacityManagementStub newStub(io.grpc.Channel channel) {
    return new capacityManagementStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static capacityManagementBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new capacityManagementBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static capacityManagementFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new capacityManagementFutureStub(channel);
  }

  /**
   * <pre>
   * the capacityManagement service definition
   * </pre>
   */
  public static abstract class capacityManagementImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Access to building granted with ID
     * unary service method
     * </pre>
     */
    public void createIdAccess(grpc.capacityManagement.IdAccessRequest request,
        io.grpc.stub.StreamObserver<grpc.capacityManagement.IdAccessResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateIdAccessMethod(), responseObserver);
    }

    /**
     * <pre>
     * Head count of people within the building
     * client streaming server method
     * </pre>
     */
    public void cSCountPeople(grpc.capacityManagement.UpdateCountPeopleRequest request,
        io.grpc.stub.StreamObserver<grpc.capacityManagement.UpdateCountPeopleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCSCountPeopleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Check to see if a terminal is occupied
     * client streaming server method
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.capacityManagement.TerminalOccupiedRequest> cSTerminalOccupied(
        io.grpc.stub.StreamObserver<grpc.capacityManagement.TerminalOccupiedResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getCSTerminalOccupiedMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateIdAccessMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.capacityManagement.IdAccessRequest,
                grpc.capacityManagement.IdAccessResponse>(
                  this, METHODID_CREATE_ID_ACCESS)))
          .addMethod(
            getCSCountPeopleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.capacityManagement.UpdateCountPeopleRequest,
                grpc.capacityManagement.UpdateCountPeopleResponse>(
                  this, METHODID_CSCOUNT_PEOPLE)))
          .addMethod(
            getCSTerminalOccupiedMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                grpc.capacityManagement.TerminalOccupiedRequest,
                grpc.capacityManagement.TerminalOccupiedResponse>(
                  this, METHODID_CSTERMINAL_OCCUPIED)))
          .build();
    }
  }

  /**
   * <pre>
   * the capacityManagement service definition
   * </pre>
   */
  public static final class capacityManagementStub extends io.grpc.stub.AbstractStub<capacityManagementStub> {
    private capacityManagementStub(io.grpc.Channel channel) {
      super(channel);
    }

    private capacityManagementStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected capacityManagementStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new capacityManagementStub(channel, callOptions);
    }

    /**
     * <pre>
     * Access to building granted with ID
     * unary service method
     * </pre>
     */
    public void createIdAccess(grpc.capacityManagement.IdAccessRequest request,
        io.grpc.stub.StreamObserver<grpc.capacityManagement.IdAccessResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateIdAccessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Head count of people within the building
     * client streaming server method
     * </pre>
     */
    public void cSCountPeople(grpc.capacityManagement.UpdateCountPeopleRequest request,
        io.grpc.stub.StreamObserver<grpc.capacityManagement.UpdateCountPeopleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCSCountPeopleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Check to see if a terminal is occupied
     * client streaming server method
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.capacityManagement.TerminalOccupiedRequest> cSTerminalOccupied(
        io.grpc.stub.StreamObserver<grpc.capacityManagement.TerminalOccupiedResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getCSTerminalOccupiedMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * the capacityManagement service definition
   * </pre>
   */
  public static final class capacityManagementBlockingStub extends io.grpc.stub.AbstractStub<capacityManagementBlockingStub> {
    private capacityManagementBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private capacityManagementBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected capacityManagementBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new capacityManagementBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Access to building granted with ID
     * unary service method
     * </pre>
     */
    public grpc.capacityManagement.IdAccessResponse createIdAccess(grpc.capacityManagement.IdAccessRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateIdAccessMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Head count of people within the building
     * client streaming server method
     * </pre>
     */
    public grpc.capacityManagement.UpdateCountPeopleResponse cSCountPeople(grpc.capacityManagement.UpdateCountPeopleRequest request) {
      return blockingUnaryCall(
          getChannel(), getCSCountPeopleMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * the capacityManagement service definition
   * </pre>
   */
  public static final class capacityManagementFutureStub extends io.grpc.stub.AbstractStub<capacityManagementFutureStub> {
    private capacityManagementFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private capacityManagementFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected capacityManagementFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new capacityManagementFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Access to building granted with ID
     * unary service method
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.capacityManagement.IdAccessResponse> createIdAccess(
        grpc.capacityManagement.IdAccessRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateIdAccessMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Head count of people within the building
     * client streaming server method
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.capacityManagement.UpdateCountPeopleResponse> cSCountPeople(
        grpc.capacityManagement.UpdateCountPeopleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCSCountPeopleMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ID_ACCESS = 0;
  private static final int METHODID_CSCOUNT_PEOPLE = 1;
  private static final int METHODID_CSTERMINAL_OCCUPIED = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final capacityManagementImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(capacityManagementImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_ID_ACCESS:
          serviceImpl.createIdAccess((grpc.capacityManagement.IdAccessRequest) request,
              (io.grpc.stub.StreamObserver<grpc.capacityManagement.IdAccessResponse>) responseObserver);
          break;
        case METHODID_CSCOUNT_PEOPLE:
          serviceImpl.cSCountPeople((grpc.capacityManagement.UpdateCountPeopleRequest) request,
              (io.grpc.stub.StreamObserver<grpc.capacityManagement.UpdateCountPeopleResponse>) responseObserver);
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
        case METHODID_CSTERMINAL_OCCUPIED:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.cSTerminalOccupied(
              (io.grpc.stub.StreamObserver<grpc.capacityManagement.TerminalOccupiedResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class capacityManagementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    capacityManagementBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.capacityManagement.capacityManagementImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("capacityManagement");
    }
  }

  private static final class capacityManagementFileDescriptorSupplier
      extends capacityManagementBaseDescriptorSupplier {
    capacityManagementFileDescriptorSupplier() {}
  }

  private static final class capacityManagementMethodDescriptorSupplier
      extends capacityManagementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    capacityManagementMethodDescriptorSupplier(String methodName) {
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
      synchronized (capacityManagementGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new capacityManagementFileDescriptorSupplier())
              .addMethod(getCreateIdAccessMethod())
              .addMethod(getCSCountPeopleMethod())
              .addMethod(getCSTerminalOccupiedMethod())
              .build();
        }
      }
    }
    return result;
  }
}
