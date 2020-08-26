package com.soapexample;

public class User {

	String name;
	String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void saveDetails() {
		print(name,password);
	}

	public void print(String name, String pass) {
		System.out.println("NAme is : " + name + "\n Password is : " + pass);

	}

}
