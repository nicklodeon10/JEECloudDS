package com.cg.corejava.inheritandpoly;

public abstract class Item {
	
	private int Id;
	private String title;
	private int noCopy;
	
	public Item() {
		this.Id=0;
		this.title="";
		this.noCopy=0;
	}
	
	public Item(int Id, String title, int noCopy) {
		this.Id=Id;
		this.title=title;
		this.noCopy=noCopy;
	}

	public int getId() {
		return Id;
	}

	public void setId(int bookId) {
		this.Id = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNoCopies() {
		return noCopy;
	}

	public void setNoCopies(int noCopy) {
		this.noCopy = noCopy;
	}

	@Override
	public String toString() {
		return "Item [Id=" + Id + ", title=" + title + ", noCopy=" + noCopy + "]";
	}
	
	public void print() {
		System.out.println("Book Title: "+title+", Book Id: "+Id+", No. of Copies:"+noCopy);
	}
	
	public abstract void checkIn();
	
	public abstract void checkOut();
	
	public abstract void addItem(int n);
	
}
