package grpc.newEnergyEfficiency;

import java.io.IOException;

import grpc.newEnergyEfficiency.newEnergyEfficiencyGrpc.newEnergyEfficiencyImplBase;
import grpc.newForesightManagement.containsString;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
	
	public class NewEnergyEfficiencyServer {
		
		private Server server;
		public static void main(String[] args) throws IOException, InterruptedException {
			// TODO Auto-generated method stub
			
			NewEnergyEfficiencyServer ourServer = new NewEnergyEfficiencyServer();
			ourServer.start();

		}

		private void start() throws IOException, InterruptedException {
			System.out.println("Starting gRPC Energy Efficiency Server");
			int port = 50051;
			
			server = ServerBuilder.forPort(port).addService(new NewEnergyEfficiencyImpl()).build().start();
			System.out.println("Server running on port: " + port );
			
			
			server.awaitTermination();
		}
		//Extend abstract base class for our own implementation
		static class NewEnergyEfficiencyImpl extends newEnergyEfficiencyImplBase{
			
			@Override // unary Presentation Room
			public void getPresRoom(requestPres request, StreamObserver<responsePres> responseObserver) {
				//Find out what was the content of the message sent by the client
				String firstString = request.getFirstString();
				System.out.println("Presentation Room request is: " + firstString);
				
				//Now build up response
				responsePres.Builder responseBuilder = responsePres.newBuilder();
				
				responseBuilder.setFirstInt(25);
				//responseBuilder.setFirstString("Unary response");
			
				responseObserver.onNext(responseBuilder.build());
				responseObserver.onCompleted();
			}
			@Override // server streaming Lights
			public void getLights(requestLights request, StreamObserver<responseLights> responseObserver) {
				//Find out what was the content of the message sent by the client
				String firstString = request.getFirstString();
				System.out.println("Lights request is: " + firstString);
				
				//Now build up response
				responseLights.Builder responseBuilder = responseLights.newBuilder();
				
				// first message
				responseBuilder.setFirstInt(25);
				responseObserver.onNext(responseBuilder.build());
				// later messages
				responseObserver.onNext(responseBuilder.build());
				responseObserver.onNext(responseBuilder.build());
				responseObserver.onCompleted();
			}
			@Override // server streaming Heat
			public void getHeat(requestHeat request, StreamObserver<responseHeat> responseObserver) {
				//Find out what was the content of the message sent by the client
				String firstString = request.getFirstString();
				System.out.println("Heat request string is: " + firstString);
				
				//Now build up response
				responseHeat.Builder responseBuilder = responseHeat.newBuilder();
				
				// add in room numbers..proto file
				// first message - room1
				responseBuilder.setFirstInt(15);
				responseObserver.onNext(responseBuilder.build());
				// second message - room2
				responseBuilder.setFirstInt(20);
				responseObserver.onNext(responseBuilder.build());
				// third message - room3
				responseBuilder.setFirstInt(25);
				responseObserver.onNext(responseBuilder.build());
				
				responseObserver.onCompleted();
			}
		}
	}
