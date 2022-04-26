package grpc.newForesightManagement;

import java.io.IOException;

import grpc.newForesightManagement.newForesightManagementGrpc.newForesightManagementImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class NewForesightManagementServer {
	
	private Server server;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		NewForesightManagementServer ourServer = new NewForesightManagementServer();
		ourServer.start();
	
	}
	private void start() throws IOException {
		System.out.println("Starting Foresight Management Server");
		int port = 50051;
		
		server = ServerBuilder.forPort(port).addService(new NewForesightManagementImpl()).build().start();
	
	}
	
	// Extend Abstract base class for our own implementation
	static class NewForesightManagementImpl extends newForesightManagementImplBase{
		
		
	}
}
