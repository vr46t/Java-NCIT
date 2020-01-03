package com.ncit.inheritence.model;

public class NormalUser extends User{


	public NormalUser(int id, String name, String role) {
		super(id,name,role);
	}
	
	public void print() {
		System.out.println("Hello");
	}
}
