package com.omfgp.sockets;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {

	ServerSocket theSocket;
	Socket theConnection;
	InputStream in;
	OutputStream out;
	
	public SocketServer() { }
	
	public void Start() {
		try {
			//Created a new ServerSocket
			//listening on port 1337 & backlog of 10
			this.theSocket = new ServerSocket(1337);
			
			//Accepts connections
			this.theConnection = this.theSocket.accept();
			
			//Tell us that the connection has been accepted
			System.out.println(this.theConnection.getInetAddress().getHostName() + " has connected.");
		} catch (IOException e) {
			//If there's some sort of IOException, let us know!
			System.out.println(e.toString());
			e.printStackTrace();
		}	
	}
	
	public String getMessages() {
		try {
			//Create input and output streams
			in = this.theConnection.getInputStream();
			out = this.theConnection.getOutputStream();
			
			//Make sure we flush it
			out.flush();
			
		} catch (IOException e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		return in.toString();
	}
	
}
