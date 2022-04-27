package grpc.newEnergyEfficiency;

import java.util.concurrent.TimeUnit;

import grpc.newCapacityManagement.newCapacityManagementGrpc;
import grpc.newCapacityManagement.requestId;
import grpc.newEnergyEfficiency.newEnergyEfficiencyGrpc.newEnergyEfficiencyBlockingStub;
import grpc.newCapacityManagement.newCapacityManagementGrpc.newCapacityManagementBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class NewEnergyEfficiencyClient {

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
		requestPres rPres = requestPres.newBuilder()
				.setFirstString("test")
				.build();
		
		// Create a stub, pass the channel to the stub
		// stub is specific to service. Channel is specific to the server
		// the stub is a local representation of the remote object
		newEnergyEfficiencyBlockingStub bstub = newEnergyEfficiencyGrpc.newBlockingStub(newChannel);
		
		responsePres response = bstub.getPresRoom(rPres);
		
		// print the result we get
		System.out.println(response.getFirstInt());
		
		newChannel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	
	}

}
