package com.example.ooad.domain;

import java.time.LocalDateTime;

public class LoanFactory {

	

	public static Loan CreateLoan(Book book, Member member) {
		// TODO Auto-generated method stub
		
		Loan Loan=new Loan();
		Loan.setBook(book);
		Loan.setMember(member);
		LocalDateTime now=LocalDateTime.now();
		Loan.setLoanDate(now);
		Loan.setReturnDate(now.plusDays(10));
		return Loan;
	}

	
}
