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
		System.out.println("Starting gRPC Server");
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
			System.out.println("Our first request string is: " + firstString);
			
			//Now build up response
			responseId.Builder responseBuilder = responseId.newBuilder();
			
			responseBuilder.setFirstInt(25);
		
			responseObserver.onNext(responseBuilder.build());
			responseObserver.onCompleted();
		}
	}

}

