package com.cg.corejava.inheritandpoly;

public class CD extends MediaItem{

	private String artist;
	private String genre;
	
	public CD() {
		this.artist="";
		this.genre="";
	}
	
	public CD(String artist, String genre) {
		this.artist=artist;
		this.genre=genre;
	}
	
	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public void checkIn() {
		System.out.println("\nChecked In.");
		System.out.println("Artist: "+artist+", Genre: "+genre);
		System.out.println("Runtime: "+getRuntime()+", Id: "+getId()+", Title: "+getTitle()+", No of Copies: "+getNoCopies());
	}

	@Override
	public void checkOut() {
		System.out.println("\nChecked Out.");
		System.out.println("Artist: "+artist+", Genre: "+genre);
		System.out.println("Runtime: "+getRuntime()+", Id: "+getId()+", Title: "+getTitle()+", No of Copies: "+getNoCopies());
	}

	@Override
	public void addItem(int n) {
		setNoCopies(getNoCopies()+n);
		System.out.println("\nUpdated No of Copies.");
	}

}
