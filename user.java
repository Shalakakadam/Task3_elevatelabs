package com.Shalaka.LibrarySys;

import java.util.Scanner;

//we make use of abstract class because this is base of admin and student
public abstract class user {
	protected int id;
	protected String name;
	
	
	public user(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	abstract void requestbook(Library library,Scanner sc);
	abstract void returnbook(Library library,Scanner sc);
}
