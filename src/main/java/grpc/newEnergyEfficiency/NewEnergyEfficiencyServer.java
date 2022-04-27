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
			System.out.println("Starting gRPC Server");
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
				System.out.println("Our first request string is: " + firstString);
				
				//Now build up response
				responsePres.Builder responseBuilder = responsePres.newBuilder();
				
				responseBuilder.setFirstInt(25);
			
				responseObserver.onNext(responseBuilder.build());
				responseObserver.onCompleted();
			}
		}
	}
