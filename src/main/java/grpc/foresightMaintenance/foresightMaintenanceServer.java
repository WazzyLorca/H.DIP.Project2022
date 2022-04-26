package grpc.foresightMaintenance;

import java.io.IOException;

import grpc.foresightMaintenance.foresightMaintenanceGrpc.foresightMaintenanceImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class foresightMaintenanceServer {

	private Server server;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		foresightMaintenanceServer ourServer = new foresightMaintenanceServer();
		ourServer.start();
	}
	private void start() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Start gRPC Server");
		// the grpc conventional port is 
		int port = 50051;
		// make use of the variable server. Create a server object with builder
		// the service is the functionality we deliver to client
		server = ServerBuilder.forPort(port).addService(new foresightMaintenanceServerImpl()).build().start();
	}
	// class contains service we are adding in
	// Extend the abstract base class for our own implementation
	static class foresightMaintenanceServerImpl extends foresightMaintenanceImplBase{
		
	}
}
