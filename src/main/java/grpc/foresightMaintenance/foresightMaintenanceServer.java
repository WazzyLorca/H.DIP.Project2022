package grpc.foresightMaintenance;

import java.io.IOException;

import grpc.foresightMaintenance.foresightMaintenanceGrpc.foresightMaintenanceImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class foresightMaintenanceServer {

	private Server server;
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		foresightMaintenanceServer ourServer = new foresightMaintenanceServer();
		ourServer.start();
	}
	private void start() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Start gRPC ForesightMaintenanceServer");
		// the grpc conventional port is 
		int port = 50051;
		// make use of the variable server. Create a server object with builder
		// the service is the functionality we deliver to client
		server = ServerBuilder.forPort(port).addService(new foresightMaintenanceServerImpl()).build().start();
		System.out.println("Server running on port 50051 gRPC ForesightMaintenanceServer: " + port);
		
		server.awaitTermination();
	}
	// class contains service we are adding in
	// Extend the abstract base class for our own implementation
	static class foresightMaintenanceServerImpl extends foresightMaintenanceImplBase{
		
		@Override
		public void checkCo2Levels(CheckCo2LevelsRequest request, StreamObserver<CheckCo2LevelsRequest> responseObserver) {
			//Find out what was the content of the message sent by the client
			int Co2Levels = request.getCo2LevelRoom1();
			System.out.println("Co2 Request Room 1 is:" + Co2Levels);
			int Co2Levels2 = request.getCo2LevelRoom2();
			System.out.println("Co2 Request Room 2 is:" + Co2Levels2);
			int Co2Levels3 = request.getCo2LevelRoom3();
			System.out.println("Co2 Request Room 3 is:" + Co2Levels3);
			
			// Now build up our response
			CheckCo2LevelsRequest.Builder responseBuilder = CheckCo2LevelsRequest.newBuilder();
			
			responseBuilder.setCo2LevelRoom1(" Room 1 is:" + Co2Levels);
			responseBuilder.setCo2LevelRoom2(" Room 2 is:" + Co2Levels2);
			responseBuilder.setCo2LevelRoom3(" Room 3 is:" + Co2Levels3);

			responseObserver.onNext(responseBuilder.build());
			responseObserver.onCompleted();
		}
	}
}
