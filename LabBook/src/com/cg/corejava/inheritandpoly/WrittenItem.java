package com.cg.corejava.inheritandpoly;

public abstract class WrittenItem extends Item {
	
	private int authorId;
	private String authorName;
	
	public WrittenItem() {
		super();
		this.authorId=0;
		this.authorName="";
	}
	
	public WrittenItem(int Id, String title, int noCopy, int authorId, String authorName) {
		super(Id, title, noCopy);
		this.authorId=authorId;
		this.authorName=authorName;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	@Override
	public String toString() {
		return "WrittenItem [authorId=" + authorId + ", authorName=" + authorName + "]";
	}
	
	public void print() {
		super.print();
		System.out.println("Author Id: "+authorId+", Author Name: "+authorName);
	}
	
}
