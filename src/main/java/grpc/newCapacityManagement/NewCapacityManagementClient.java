package grpc.newCapacityManagement;

import java.util.concurrent.TimeUnit;

import grpc.newCapacityManagement.newCapacityManagementGrpc.newCapacityManagementBlockingStub;
import grpc.newCapacityManagement.newCapacityManagementGrpc.newCapacityManagementStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

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
		// async stub for client streaming
		newCapacityManagementStub asyncstub = newCapacityManagementGrpc.newStub(newChannel);

		// Now we can call the server and get a response
		responseId response = bstub.getIdAccess(rId);
		System.out.println(response.getFirstInt());
		
		// Client streaming code Count People
		// for incoming messages we need to implement a StreamObserver
		// then we pass the StreamObserver to gRPC library
		
		StreamObserver<responseCount> responseObserver = new StreamObserver<responseCount>() {

			@Override
			public void onNext(responseCount value) {
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
		
		StreamObserver<requestCount> requestObserver = asyncstub.sendCountPeople(responseObserver);
		
		requestObserver.onNext(requestCount.newBuilder().setFirstString("First msg in Countstream").build());
		requestObserver.onNext(requestCount.newBuilder().setFirstString("Second msg in Countstream").build());
		requestObserver.onNext(requestCount.newBuilder().setFirstString("Third msg in Countstream").build());
		// for strings requestObserver.onNext(requestId.newBuilder().setFirstString("First Count People").build();

		System.out.println("Client has now sent its messages");
		
		requestObserver.onCompleted();
		// vital, thread must sleep while waiting complete. in milliseconds
		Thread.sleep(5000);
		
		
		// Client streaming code Terminal Occupied
		// for incoming messages we need to implement a StreamObserver
		// then we pass the StreamObserver to gRPC library
		
		StreamObserver<responseOccupied> responseObserverTerminal = new StreamObserver<responseOccupied>() {

			@Override
			public void onNext(responseOccupied value) {
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
		
		StreamObserver<requestOccupied> requestObserverTerminal = asyncstub.sendTerminalOccupied(responseObserverTerminal);
		
		requestObserver.onNext(requestCount.newBuilder().setFirstString("First msg in streamTerminal").build());
		requestObserver.onNext(requestCount.newBuilder().setFirstString("Second msg in streamTerminal").build());
		requestObserver.onNext(requestCount.newBuilder().setFirstString("Third msg in streamTerminal").build());
		// for strings requestObserver.onNext(requestId.newBuilder().setFirstString("First Count People").build();

		System.out.println("Client has now sent its messages");
		
		requestObserverTerminal.onCompleted();
		// vital, thread must sleep while waiting complete. in milliseconds
		Thread.sleep(5000);		
		
		
		
		// Clean up: shutdown the channel
		newChannel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	
	}


}
