package com.omfgp.sockets;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Make an input and output
		Scanner in = new Scanner(System.in);
		PrintStream out = System.out;
		
		//Build what will be our chat 'interface'
		UserChat chat = new UserChat();
		
		//Ready some variables for our client and server
		SocketServer server = new SocketServer();
		SocketClient client = new SocketClient();
		
		//Store our useful input and output
		String name, address, msg;
		String cs = "";
		
		//Dialog with the user
		out.println("Please enter the following information...");
		
		//Let's make sure we don't get any goofy input
		while(!cs.equalsIgnoreCase("c") && !cs.equalsIgnoreCase("s")) {
			out.print("client or server [c/s]: ");
			cs = in.nextLine();
			
			if(cs.equalsIgnoreCase("c")) {
				out.print("username: ");
				name = in.nextLine();
				chat.setUserName(name);
				
				out.print("Connect to: ");
				address = in.nextLine();
				
				//The client should output something in the form of:
				//out.println("Client connecting to " + address);
				client.setAddress(address);
				client.Start();
				
			} else if(cs.equalsIgnoreCase("s")) {
				//The server should output something in the form of:
				//out.println("Server waiting for connections...");
				server.Start();
			} else {
				out.println("Please enter either 'c' or 's'");
			}
		}
		
		//Send and receive messages
		while(true) {
			msg = in.nextLine();
			//wait for messages here.
		}

	}

}
