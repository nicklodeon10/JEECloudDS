package com.cg.corejava.inheritandpoly;

public class Client {

	public static void main(String[] args) {
		Book b1=new Book(123, "JavaBook", 6, 3212312, "Developer");
		b1.checkIn();
		b1.checkOut();
		b1.addItem(3);
		System.out.println("No of Copies: "+b1.getNoCopies());
		
		JournalPaper j1=new JournalPaper(223, "Java Journal", 2, 231235, "AnotherDeveloper", 2013);
		j1.checkIn();
		j1.checkOut();
		j1.addItem(5);
		System.out.println("No of Copies: "+j1.getNoCopies());
		
		Video v1=new Video("GoodDirector","Action", 2017);
		v1.setRuntime(132);
		v1.setId(420);
		v1.setTitle("Die Hard");
		v1.setNoCopies(10);
		v1.checkIn();
		v1.checkOut();
		v1.addItem(0);
		System.out.println("No of Copies: "+v1.getNoCopies());
		
		CD c1=new CD("BestArtist","Rock");
		c1.setRuntime(120);
		c1.setId(1331);
		c1.setTitle("Best of Best Artist");
		c1.setNoCopies(33);
		c1.checkIn();
		c1.checkOut();
		c1.addItem(6);
		System.out.println("No of Copies: "+c1.getNoCopies());
	}

}