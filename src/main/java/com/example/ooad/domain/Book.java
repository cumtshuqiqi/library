package com.example.ooad.domain;

public class Book {
	private String Id;	
	private String ISBN;
	private String Title;
	private String Type;
	private String Author;
	private Member LoanTo;
	
	public Book(String Author, String Type,String ISBN,String Title ) {
		this.ISBN=ISBN;
		this.Title=Title;
		this.Author=Author;
		this.Type=Type;
	}
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public Member getLoanto() {
		return LoanTo;
	}
	public void setLoanto(Member loanto) {
		LoanTo = loanto;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}
	
	
}
