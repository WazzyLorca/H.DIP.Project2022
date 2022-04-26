package grpc.newCapacityManagement;

import java.io.IOException;

import grpc.newCapacityManagement.newCapacityManagementGrpc.newCapacityManagementImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class NewCapacityManagementServer {

	private Server server;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		NewCapacityManagementServer ourServer = new NewCapacityManagementServer();
		ourServer.start();

	}

	private void start() throws IOException {
		System.out.println("Starting gRPC Server");
		int port = 50051;
		
		server = ServerBuilder.forPort(port).addService(new NewCapacityManagementImpl()).build().start();
	
	}
	
	//Extend abstract base class for our own implementation
	static class NewCapacityManagementImpl extends newCapacityManagementImplBase{
		
	}

}

