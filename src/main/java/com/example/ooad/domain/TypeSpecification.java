package com.example.ooad.domain;

public class TypeSpecification implements Specification<Book>{

	private String Type;
	
	public TypeSpecification(String Type) {
		this.Type=Type;
	}
	@Override
	public boolean isSatisfiedBy(Book book) {
		// TODO Auto-generated method stub
		return (book.getType().equals(Type));
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

}
