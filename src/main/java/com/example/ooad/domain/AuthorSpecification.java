package com.example.ooad.domain;

public  class AuthorSpecification implements Specification<Book> {

	private String author;
	public AuthorSpecification(String author) {
		this.setAuthor(author);
	}
	@Override
	public boolean isSatisfiedBy(Book book) {
		// TODO Auto-generated method stub
		return (book.getAuthor().equals(author));
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	

}
