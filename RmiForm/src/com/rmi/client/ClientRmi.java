package com.rmi.client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.rmi.inter.RmiInterface;

public class ClientRmi {
	public static void main(String[] args) {
		try {
			Registry registry = LocateRegistry.getRegistry(1099);

			RmiInterface stub = (RmiInterface) registry.lookup("hello");

			System.out.println("Remote method invoked");
		} catch (Exception e) {
			System.err.println("Client exception: " + e.toString());
			e.printStackTrace();
		}
	}

}
