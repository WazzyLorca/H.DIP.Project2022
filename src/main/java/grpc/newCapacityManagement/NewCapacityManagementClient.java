package grpc.newCapacityManagement;

import java.util.concurrent.TimeUnit;

import grpc.newCapacityManagement.newCapacityManagementGrpc.newCapacityManagementBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class NewCapacityManagementClient {

	public static void main(String[] args) throws InterruptedException {
		
		//Build a channel - a channel connects client to server
		int port = 50051;
		String host = "localhost";
		
		
		ManagedChannel newChannel = ManagedChannelBuilder
				.forAddress(host, port)
				.usePlaintext()
				.build();
		
		// code above is completely generic
		
		// now build our message
		// Note that contains string is in the same package so we dont need to import
		requestId rId = requestId.newBuilder()
				.setFirstString("ID Access Granted")
				.build();
		
		// Create a stub, pass the channel to the stub
		// stub is specific to service. Channel is specific to the server
		// the stub is a local representation of the remote object
		newCapacityManagementBlockingStub bstub = newCapacityManagementGrpc.newBlockingStub(newChannel);
		
		responseId response = bstub.getIdAccess(rId);
		
		System.out.println(response.getFirstInt());
		
		newChannel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	
	}

}
