package com.cg.corejava.inheritandpoly;

public class Book extends WrittenItem {

	public Book(int Id, String title, int noCopy, int authorId, String authorName) {
		super(Id, title, noCopy, authorId, authorName);
	}
	
	@Override
	public void checkIn() {
		System.out.println("\nChecked In.");
		super.print();
	}

	@Override
	public void checkOut() {
		System.out.println("\nChecked Out");
		super.print();
	}

	@Override
	public void addItem(int n) {
		setNoCopies(getNoCopies()+n);
		System.out.println("\nUpdated No of Copies.");
	}
	
}
