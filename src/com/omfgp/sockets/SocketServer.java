package com.omfgp.sockets;

import java.io.IOException;
import java.net.ServerSocket;

public class SocketServer {

	ServerSocket theSocket;
	
	public SocketServer() { }
	
	public void Start() {
		try {
			//Created a new ServerSocket
			//listening on port 1337 & backlog of 10
			theSocket = new ServerSocket(1337, 10);
		} catch (IOException e) {
			//If there's some sort of IOException, let us know!
			System.out.println(e.toString());
			e.printStackTrace();
		}
	}
	
}
