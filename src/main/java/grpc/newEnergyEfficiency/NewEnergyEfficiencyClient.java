package grpc.newEnergyEfficiency;

import java.util.Iterator;
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
				.setFirstString("Activated")
				.build();
		
		// Create a stub, pass the channel to the stub
		// stub is specific to service. Channel is specific to the server
		// the stub is a local representation of the remote object
		newEnergyEfficiencyBlockingStub bstub = newEnergyEfficiencyGrpc.newBlockingStub(newChannel);
		
		// Now we can call server and get a response back
		// the service has methods which we can call
		responsePres response = bstub.getPresRoom(rPres);
		// print the result we get
		System.out.println(response.getFirstInt());
		
		// now handle server streaming
		// we will use the blocking stub
		requestLights rLights = requestLights.newBuilder()
				.setFirstString("Turned On")
				.build();
		
		Iterator<responseLights> responses = bstub.getLights(rLights);
		
		while (responses.hasNext()) {
			responseLights individualResponse = responses.next();
			System.out.println(individualResponse.getFirstInt());
		}
		
		// Clean up: shutdown the channel
		newChannel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	
	}

}
