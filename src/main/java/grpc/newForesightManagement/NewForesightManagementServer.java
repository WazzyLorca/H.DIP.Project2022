package grpc.newForesightManagement;

import java.io.IOException;

import grpc.newForesightManagement.newForesightManagementGrpc.newForesightManagementImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class NewForesightManagementServer {
	
	private Server server;
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		NewForesightManagementServer ourServer = new NewForesightManagementServer();
		ourServer.start();
	
	}
	private void start() throws IOException, InterruptedException {
		System.out.println("Starting Foresight Management Server");
		
		int port = 50051;
		String service_type = "_grpc._tcp.local.";
		String service_name = "GrpcServer";
		ForesightManagementServiceRegistration ssr = new ForesightManagementServiceRegistration();
		ssr.run(port, service_type, service_name);
		
		server = ServerBuilder.forPort(port).addService(new NewForesightManagementImpl()).build().start();
		System.out.println("Server running on port: " + port );
		
		
		server.awaitTermination();
		
		
	}
	
	// Extend Abstract base class for our own implementation
	static class NewForesightManagementImpl extends newForesightManagementImplBase{
		// we are implementing the service proto
		
		@Override // unary
		public void getFirstString(containsString request, StreamObserver<containsString> responseObserver) {
			//Find out what was the content of the message sent by the client
			String firstString = request.getFirstString();
			System.out.println("Our first request string is: " + firstString);
			
			//Now build up response
			containsString.Builder responseBuilder = containsString.newBuilder();
			
			responseBuilder.setFirstString("Our first Response String: " + firstString);
			
			responseObserver.onNext(responseBuilder.build());
			responseObserver.onCompleted();
			
		}
		
		@Override // unary
		public void getFirstInt(containsString request, StreamObserver<newResponse> responseObserver) {
			//Find out what was the content of the message sent by the client
			String firstString = request.getFirstString();
			System.out.println("Our first request string is: " + firstString);
			
			//Now build up response
			newResponse.Builder responseBuilder = newResponse.newBuilder();
			
			responseBuilder.setFirstInt(25);
			
			responseObserver.onNext(responseBuilder.build());
			responseObserver.onCompleted();
			
		}
	}
}
