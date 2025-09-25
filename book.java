package com.Shalaka.LibrarySys;

public class book {
	private String Author;
	private int id;
	private String title;
	private boolean isIssued;
	
//this is a book constructor
	 public book(int id,String title,String Author) {
		 this.Author=Author;
		 this.id=id;
		 this.title=title;
		 this.isIssued=false;
 }
// making use of getters and setters so that they can be accessible outside the class
	 public int getId() {
		 return id;
	 }
	 
	 public String gettitile() {
		 return title;
	 }
	 
	 public String getAuthor() {
		 return Author;
	 }
	 
	 public boolean isIssued() {
		 return isIssued;
	 }
	 
	 public void setIssued(boolean issued) {
		 isIssued=issued;
	 }
	 
	 @Override
	 public String toString() {
		 return id+"-"+title+"-"+Author+(isIssued?"Issued":"Available");
	 }
 
 }
