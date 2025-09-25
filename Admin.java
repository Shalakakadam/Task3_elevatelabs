package com.Shalaka.LibrarySys;

import java.util.Scanner;

public class Admin extends user{
	public Admin(int id,String name) {
		super(id,name);
	}

	@Override
	void requestbook(Library library, Scanner sc) {
		System.out.println("Enter book id");
		int bookid = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter author of book");
		String Author=sc.nextLine();
		System.out.println("Enter title of book");
		String title=sc.nextLine();
		library.addbook(new book(id,title,Author));
		
	}

	@Override
	void returnbook(Library library, Scanner sc) {
		System.out.println("Enter book id to return");
		int bookid=sc.nextInt();
		library.removebook(id);
		
	}
}
