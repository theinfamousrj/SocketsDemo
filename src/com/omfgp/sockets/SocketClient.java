package com.omfgp.sockets;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient {

	Socket theConnection;
	String address;
	
	public SocketClient() { }
	
	public void setAddress(String addr) {
		this.address = addr;
	}
	
	public void Start() {
		try {
			this.theConnection = new Socket(this.address, 1337);
		} catch (UnknownHostException e) {
			System.out.println(e.toString());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
	}
	
	public String getMessage() {
		return null;
	}
	
	public void sendMessage(String msg) {
		
	}
	
}
