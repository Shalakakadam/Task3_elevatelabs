package com.Shalaka.LibrarySys;

import java.util.Scanner;

public class Student extends user{
	public Student(int id,String name) {
	super(id,name);
 }

	@Override
	void requestbook(Library library, Scanner sc) {
		System.out.println("Enter book id to issue");
		int bookid=sc.nextInt();
		library.issuebook(bookid,this);
		
	}

	@Override
	void returnbook(Library library, Scanner sc) {
		System.out.println("Enter book id to issue");
		int bookid=sc.nextInt();
		library.returnbook(bookid,this);
		
	}
}
