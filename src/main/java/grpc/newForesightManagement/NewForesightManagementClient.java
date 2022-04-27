package grpc.newForesightManagement;

import java.util.concurrent.TimeUnit;

import grpc.newCapacityManagement.newCapacityManagementGrpc;
import grpc.newCapacityManagement.requestCount;
import grpc.newCapacityManagement.responseCount;
import grpc.newCapacityManagement.newCapacityManagementGrpc.newCapacityManagementStub;
import grpc.newForesightManagement.newForesightManagementGrpc.newForesightManagementStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class NewForesightManagementClient {

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
		containsString cString = containsString.newBuilder()
				.setFirstString("test")
				.build();
		
		// Create a stub, pass the channel to the stub
		// async stub for client streaming
		newForesightManagementStub asyncstub = newForesightManagementGrpc.newStub(newChannel);

		// Client streaming code Decibel Levels People
		// for incoming messages we need to implement a StreamObserver
		// then we pass the StreamObserver to gRPC library
		
		StreamObserver<responseDecibel> responseObserver = new StreamObserver<responseDecibel>() {

			@Override
			public void onNext(responseDecibel value) {
				System.out.println("Final Response from server " + value.getFirstInt());
				
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		// gRPC library returns a StreamObserver to us: requestObserver
		// we use this to send outgoing messages
		
		StreamObserver<requestDecibel> requestObserver = asyncstub.getDecibelLevels(responseObserver);
		
		requestObserver.onNext(requestDecibel.newBuilder().setFirstString("First msg in Decibel stream").build());
		requestObserver.onNext(requestDecibel.newBuilder().setFirstString("Second msg in Decibel stream").build());
		requestObserver.onNext(requestDecibel.newBuilder().setFirstString("Third msg in Decibel stream").build());
		// for strings requestObserver.onNext(requestId.newBuilder().setFirstString("First Count People").build();

		System.out.println("Client has now sent its messages");
		
		requestObserver.onCompleted();
		// vital, thread must sleep while waiting complete. in milliseconds
		Thread.sleep(5000);
		
		
		// Bi-Directional streaming code Co2Levels Levels People
		// for incoming messages we need to implement a StreamObserver
		// then we pass the StreamObserver to gRPC library
		
		StreamObserver<responseCo2Level> responseObserverCo2 = new StreamObserver<responseCo2Level>() {

			@Override
			public void onNext(responseCo2Level value) {
				System.out.println("Final Response from server " + value.getFirst32());
				
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		// gRPC library returns a StreamObserver to us: requestObserver
		// we use this to send outgoing messages
		
		StreamObserver<requestCo2Level> requestObserverCo2 = asyncstub.getCo2Levels(responseObserverCo2);
		
		requestObserverCo2.onNext(requestCo2Level.newBuilder().setFirstString("First msg in Decibel stream").build());
		requestObserverCo2.onNext(requestCo2Level.newBuilder().setFirstString("Second msg in Decibel stream").build());
		requestObserverCo2.onNext(requestCo2Level.newBuilder().setFirstString("Third msg in Decibel stream").build());
		// for strings requestObserver.onNext(requestId.newBuilder().setFirstString("First Count People").build();

		System.out.println("Client has now sent its messages");
		
		requestObserver.onCompleted();
		// vital, thread must sleep while waiting complete. in milliseconds
		Thread.sleep(5000);		
		
		// Bi-Directional streaming code Electricity Usage Levels People
		// for incoming messages we need to implement a StreamObserver
		// then we pass the StreamObserver to gRPC library
		
		StreamObserver<responseElecUsage> responseObserverEU = new StreamObserver<responseElecUsage>() {

			@Override
			public void onNext(responseElecUsage value) {
				System.out.println("Final Response from server " + value.getFirst32());
				
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		// gRPC library returns a StreamObserver to us: requestObserver
		// we use this to send outgoing messages
		
		StreamObserver<requestElecUsage> requestObserverEU = asyncstub.getElecUsage(responseObserverEU);
		
		requestObserverEU.onNext(requestElecUsage.newBuilder().setFirstString("First msg in Decibel stream").build());
		requestObserverEU.onNext(requestElecUsage.newBuilder().setFirstString("Second msg in Decibel stream").build());
		requestObserverEU.onNext(requestElecUsage.newBuilder().setFirstString("Third msg in Decibel stream").build());
		// for strings requestObserver.onNext(requestId.newBuilder().setFirstString("First Count People").build();

		System.out.println("Client has now sent its messages");
		
		requestObserver.onCompleted();
		// vital, thread must sleep while waiting complete. in milliseconds
		Thread.sleep(5000);	
		
		
		// Clean up: shutdown the channel
		newChannel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	}

}
