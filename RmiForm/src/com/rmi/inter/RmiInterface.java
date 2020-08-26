package com.rmi.inter;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RmiInterface extends Remote{
	
	boolean sayHelloWorld(String name, String mail, String dept)  throws RemoteException;
}
