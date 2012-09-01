package com.omfgp.sockets;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {

	ServerSocket theSocket;
	Socket theConnection;
	
	public SocketServer() { }
	
	public void Start() {
		try {
			//Created a new ServerSocket
			//listening on port 1337 & backlog of 10
			this.theSocket = new ServerSocket(1337, 10);
			
			//Accepts connections
			this.theConnection = this.theSocket.accept();
		} catch (IOException e) {
			//If there's some sort of IOException, let us know!
			System.out.println(e.toString());
			e.printStackTrace();
		}
	}
	
}
