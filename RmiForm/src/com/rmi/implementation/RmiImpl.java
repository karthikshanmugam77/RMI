package com.rmi.implementation;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

import com.rmi.inter.RmiInterface;

public class RmiImpl extends UnicastRemoteObject implements RmiInterface {

	public RmiImpl() throws RemoteException {
		super();
	}

	@Override
	public boolean sayHelloWorld(String name, String mail, String dept) throws RemoteException {
		
		return true;
	}

}
