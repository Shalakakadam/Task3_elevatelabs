package com.Shalaka.LibrarySys;

import java.util.*;

public class Library {
	
	private ArrayList<book>books=new ArrayList<>();
	
	public void addbook(book book) {
		books.add(book);
		System.out.println("Book Added" +book);	
	}
	
	public void removebook(int id) {
		books.removeIf(b->b.getId()==id);
		System.out.println("Book removed"+id);
	}

	public void issuebook(int bookid, user user) {
		for(book b:books) {
			if(b.getId()==bookid && !b.isIssued()) {
				b.setIssued(true);
				System.out.println("Book issued"+b.gettitile()+"to"+user.name);
				return;
			}
		}
		System.out.println("Book not Available");
	}

	public void returnbook(int bookid, Student student) {
		for(book b:books) {
			if(b.getId()==bookid && b.isIssued()) {
				b.setIssued(false);
				System.out.println("Book returned"+b.gettitile());
				return;
			}
		}
		System.out.println("Invalid return request");
	}
	
	public void displaybook() {
		 System.out.println("Books in Library:");
	        for (book b : books) {
	            System.out.println(b);
	}
}
}
