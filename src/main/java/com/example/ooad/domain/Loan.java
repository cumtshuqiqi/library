package com.example.ooad.domain;

import java.time.LocalDateTime;

public class Loan {
	private String Id;
	private LocalDateTime LoanDate;
	private LocalDateTime DateForReturn;
	private LocalDateTime ReturnDate;
	private Book Book;
	private Member Member;
	
	/**
	 *  是否已被归还
	 * @return
	 */
	public boolean HasNotBeenReturned() {
		return ReturnDate==null;
	}
	
	/**
	 *设置归还时间
	 *
	 * */
	public void MarkAsReturned() {
		ReturnDate=LocalDateTime.now();
	}
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public LocalDateTime getLoanDate() {
		return LoanDate;
	}
	public void setLoanDate(LocalDateTime loanDate) {
		LoanDate = loanDate;
	}
	public LocalDateTime getDateForReturn() {
		return DateForReturn;
	}
	public void setDateForReturn(LocalDateTime dateForReturn) {
		DateForReturn = dateForReturn;
	}
	public LocalDateTime getReturnDate() {
		return ReturnDate;
	}
	public void setReturnDate(LocalDateTime returnDate) {
		ReturnDate = returnDate;
	}
	public Book getBook() {
		return Book;
	}
	public void setBook(Book book) {
		Book = book;
	}
	public Member getMember() {
		return Member;
	}
	public void setMember(Member member) {
		Member = member;
	}



}
