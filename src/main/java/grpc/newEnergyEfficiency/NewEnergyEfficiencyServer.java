package grpc.newEnergyEfficiency;

import java.io.IOException;

import grpc.newEnergyEfficiency.newEnergyEfficiencyGrpc.newEnergyEfficiencyImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
	
	public class NewEnergyEfficiencyServer {
		
		private Server server;
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			
			NewEnergyEfficiencyServer ourServer = new NewEnergyEfficiencyServer();
			ourServer.start();

		}

		private void start() throws IOException {
			System.out.println("Starting gRPC Server");
			int port = 50051;
			
			server = ServerBuilder.forPort(port).addService(new NewEnergyEfficiencyImpl()).build().start();
		
		}
		
		static class NewEnergyEfficiencyImpl extends newEnergyEfficiencyImplBase{
			
		}
	}
