package grpc.newForesightManagement;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class NewForesightManagementClient {

	public static void main(String[] args) {
		
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
		containsString cString = containsString.newBuilder()
				.setFirstString("test")
				.build();
		
		// Create a stub, pass the channel to the stub
	}

}
