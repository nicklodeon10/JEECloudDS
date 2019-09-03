package com.cg.corejava.inheritandpoly;

public class Video extends MediaItem{
	
	private String director;
	private String genre;
	private int yearReleased;
	
	public Video() {
		this.director="";
		this.genre="";
		this.yearReleased=0;
	}
	
	public Video(String director, String genre, int yearReleased) {
		this.director=director;
		this.genre=genre;
		this.yearReleased=yearReleased;
	}
	
	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getYearReleased() {
		return yearReleased;
	}

	public void setYearReleased(int yearReleased) {
		this.yearReleased = yearReleased;
	}

	@Override
	public void checkIn() {
		System.out.println("\nChecked In.");
		System.out.println("Director: "+director+", Genre: "+genre+", Year Released: "+yearReleased);
		System.out.println("Runtime: "+getRuntime()+", Id: "+getId()+", Title: "+getTitle()+", No of Copies: "+getNoCopies());
	}

	@Override
	public void checkOut() {
		System.out.println("\nChecked Out.");
		System.out.println("Director: "+director+", Genre: "+genre+", Year Released: "+yearReleased);
		System.out.println("Runtime: "+getRuntime()+", Id: "+getId()+", Title: "+getTitle()+", No of Copies: "+getNoCopies());
	}

	@Override
	public void addItem(int n) {
		setNoCopies(getNoCopies()+n);
		System.out.println("\nUpdated No of Copies.");
	}

}
