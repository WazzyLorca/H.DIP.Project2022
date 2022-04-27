package grpc.newCapacityManagement;

import java.io.IOException;

import grpc.newCapacityManagement.newCapacityManagementGrpc.newCapacityManagementImplBase;
import grpc.newForesightManagement.containsString;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class NewCapacityManagementServer {

	private Server server;
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		NewCapacityManagementServer ourServer = new NewCapacityManagementServer();
		ourServer.start();

	}

	private void start() throws IOException, InterruptedException {
		System.out.println("Starting gRPC Capacity Management Server");
		int port = 50051;
		
		server = ServerBuilder.forPort(port).addService(new NewCapacityManagementImpl()).build().start();
		System.out.println("Server running on port: " + port );
		
		
		server.awaitTermination();
		
	}
	
	//Extend abstract base class for our own implementation
	static class NewCapacityManagementImpl extends newCapacityManagementImplBase{
		
		@Override // unary ID Access
		public void getIdAccess(requestId request, StreamObserver<responseId> responseObserver) {
			//Find out what was the content of the message sent by the client
			String firstString = request.getFirstString();
			System.out.println("Our Id request access is: " + firstString);
			
			//Now build up response
			responseId.Builder responseBuilder = responseId.newBuilder();
			
			responseBuilder.setFirstInt(25);
		
			responseObserver.onNext(responseBuilder.build());
			responseObserver.onCompleted();
		}
		
		// method for client Streaming Count People
		// implement a StreamObserver and pass it back to gRPC library
		// specify message type
		public StreamObserver<requestCount> sendCountPeople(StreamObserver<responseCount> responseObserver) {
			System.out.println("On Server, inside streaming. Our Count is: ");
			return new StreamObserver<requestCount>() {

				@Override
				public void onNext(requestCount value) {
					System.out.println("On Server, message from Client Count is: " + value.getFirstString());
					
				}

				@Override
				public void onError(Throwable t) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void onCompleted() {
					//Now build up response
					responseCount.Builder responseBuilder = responseCount.newBuilder();
					
					responseBuilder.setFirstInt(25);
					//responseBuilder.setFirstString("Server says it has got your completed message, thanks");
				
					responseObserver.onNext(responseBuilder.build());
					responseObserver.onCompleted();
					
				}};
		}
	}

}

