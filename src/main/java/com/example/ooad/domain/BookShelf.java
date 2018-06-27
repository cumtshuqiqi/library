package com.example.ooad.domain;

import java.util.ArrayList;
import java.util.List;

public class BookShelf {
	private String Author;
	private String Type;
	private List<Book> books;
	public BookShelf(String Author,String Type) {
		this.Author=Author;
		this.Type=Type;
		books=new ArrayList<>();
	}
	
	/**
	 * 向书架中增加书
	 * @param book
	 * */
	
	public void addBook(Book book) {
		if(validate(book)) {
			books.add(book);
		}
		
	}

	/**判断书的类型和作者与书架匹不匹配
	 * @param book
	 * @return
	 * */
	
	private boolean validate(Book book) {
		// TODO Auto-generated method stub
		AuthorSpecification authors = new AuthorSpecification(Author); 
		TypeSpecification types = new TypeSpecification(Type); 
		return (authors.isSatisfiedBy(book) && types.isSatisfiedBy(book));
	}
	
	/**
	 * 获取书架上所有的书
	 * @return
	 * */
	public List<Book> getBooks(){
		return books;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}
}
