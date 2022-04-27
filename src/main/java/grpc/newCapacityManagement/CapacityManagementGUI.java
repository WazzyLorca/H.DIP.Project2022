package grpc.newCapacityManagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

import grpc.newCapacityManagement.newCapacityManagementGrpc.newCapacityManagementBlockingStub;
import grpc.newCapacityManagement.newCapacityManagementGrpc.newCapacityManagementStub;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;


import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;

public class CapacityManagementGUI {

	private static newCapacityManagementBlockingStub blockingStub;
	private static newCapacityManagementStub blockingstub;
	
	private JFrame frame;
	private JTextField textName1;
	private JTextField textName2;
	private JTextArea textResponse ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			//overide the run method of runnable
			public void run() {
				try {
					CapacityManagementGUI window = new CapacityManagementGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CapacityManagementGUI() {
		

		int port = 50051;
		String host = "localhost";
		
		ManagedChannel channel = ManagedChannelBuilder
				.forAddress(host, port)
				.usePlaintext()
				.build();

		requestId rId = requestId.newBuilder()
				.setFirstString("ID Access Granted")
				.build();
		
		// Create a stub, pass the channel to the stub
		// stub is specific to service. Channel is specific to the server
		// the stub is a local representation of the remote object


		initialize();
		/*
		try {
			channel.shutdown().awaitTermination(50, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		//Jframe is a window with a title bar
		frame.setTitle("Client - Service Controller");
		//set bounds can be done for frames panels and buttons
		frame.setBounds(100, 100, 500, 300);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Box layout determines how components are laid out in the panel
		//Layout vertically in a col - box layout doesn't wrap
		//See: https://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html
		BoxLayout bl = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);
		
		frame.getContentPane().setLayout(bl);
		
		//Create JPanel 1
		JPanel panel_service_1 = new JPanel();
		frame.getContentPane().add(panel_service_1);
		//Flow layout - items retain their size, are laid out horizontally and wrap

		panel_service_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		//Create new label and add it to the panel
		JLabel lblNewLabel_1 = new JLabel(" Co2 Levels 1 ");
		panel_service_1.add(lblNewLabel_1);
		
		//Input textbox
		textName1 = new JTextField();
		// add it to the panel
		panel_service_1.add(textName1);
		//How wide should input box be? - doesn't effect number that can be entered
		textName1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel(" Name 2 ");
		panel_service_1.add(lblNewLabel_2);
		
		textName2 = new JTextField();
		panel_service_1.add(textName2);
		textName2.setColumns(10);
		
		String[] ops = new String[] {"Response Type 1", "SUBTRACTION", "MULTIPLICATION", "DIVISION"};
		//Create combobox and add to panel
		JComboBox comboOperation = new JComboBox();
		comboOperation.setModel(new DefaultComboBoxModel(ops));
		panel_service_1.add(comboOperation);
	
		//Set Up Button ....
		JButton btnSend = new JButton("Send our message to Server");
		
		//Add an action listener to our button
		btnSend.addActionListener(new ActionListener() {
			
			//implement action performed method
			//This will happen when the button is clicked
			public void actionPerformed(ActionEvent e) {

				//Retrieve data from GUI
				String name1 = textName1.getText();
				String name2 = textName2.getText();

				int index = comboOperation.getSelectedIndex();
				//Do some logic with our index or send it over
				
				String data = name1 + " and " + name2;
				
				
				//* This is the only gRPC in this method*/
				// we need to call the server from inside the button code

				//String name = "Joe and Ann";

				containsString request = containsString.newBuilder().setFirstString(data).build();

				containsString response = newCapacityManagementBlockingStub.getFirstString(request);

				System.out.println("Response: " + response.getFirstString());
				
				//populate the JTextArea in the panel
				textResponse.append("reply:"+ response.getFirstString());
				
				System.out.println("res: " + response.getFirstString());		
				

			}
		}); //End of setup button
		
		//Add button to the panel
		panel_service_1.add(btnSend);
		
		
		textResponse = new JTextArea(3, 20);
		textResponse .setLineWrap(true);
		textResponse.setWrapStyleWord(true);
		
		JScrollPane scrollPane = new JScrollPane(textResponse);
		
		//textResponse.setSize(new Dimension(15, 30));
		panel_service_1.add(scrollPane);
		
		/*
		JPanel panel_service_2 = new JPanel();
		frame.getContentPane().add(panel_service_2);
		
		JPanel panel_service_3 = new JPanel();
		frame.getContentPane().add(panel_service_3);
			*/
		
	}
	
}
