package com.cg.corejava.inheritandpoly;

public class JournalPaper extends WrittenItem {
	
	private int yearPublished;
	
	public JournalPaper() {
		super();
		this.yearPublished=0;
	}
	
	public JournalPaper(int Id, String title, int noCopy, int authorId, String authorName, int yearPublished) {
		super(Id, title, noCopy, authorId, authorName);
		this.yearPublished=yearPublished;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	@Override
	public void checkIn() {
		System.out.println("\nChecked In.");
		super.print();
		System.out.println("Year Published: "+yearPublished);
	}

	@Override
	public void checkOut() {
		System.out.println("\nChecked Out.");
		super.print();
		System.out.println("Year Published: "+yearPublished);
	}

	@Override
	public void addItem(int n) {
		setNoCopies(getNoCopies()+n);
		System.out.println("\nUpdated No of Copies.");
	}
	
	@Override
	public String toString() {
		return "JournalPaper [yearPublished=" + yearPublished + "]";
	}

}
