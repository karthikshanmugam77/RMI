package com.rmi.server;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.rmi.implementation.RmiImpl;
public class ServerRmi  {

	public static void main(String[] args) {
		try {
			Registry reg = LocateRegistry.createRegistry(1099);
			RmiImpl ri = new RmiImpl();
			reg.rebind("hello", ri);
			System.out.println("Server ready...");
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
