package com.example.ooad.domain;

import java.util.ArrayList;

public class Member {
	private String Id;
	private String Name;
	private ArrayList<Loan> Loans;
	
	public Member(String Name) {
		this.Name=Name;
		Loans=new ArrayList<>();
	}
	
	/**
	 * 检查用户是否已借此书，如果已借，则归还，并将书标识未借
	 * @param book
	 * */
	
	public final void Return(Book book) {
		Loan Loan=FindCurrentLoanFor(book);
		if(Loan != null) {
			Loan.MarkAsReturned();
			book.setLoanto(null);
		}
	}
	
	/**
	 * 查找用户租书记录
	 * @param book
	 * @return
	 * */
	
	private final Loan FindCurrentLoanFor(Book book) {
		// TODO Auto-generated method stub
		Loan LoanHistory=null;
		for(Loan Loan:Loans) {
			if(Loan.getBook()==book) {
				LoanHistory=Loan;
			}
		}
		return LoanHistory;
	}

	/**
	 * 检查该书是否被其他人借出（未借出则返回true）
	 * @param book
	 * @return
	 *  */
	public final boolean CanLoan(Book book) {
		return book.getLoanto()==null;
	}
	
	/**
	 * 借书
	 * @param book
	 * @return 
	 * @return
	 * */
	public final Loan Loan(Book book) {
		Loan Loan=null;
		if(CanLoan(book)) {
			Loan=LoanFactory.CreateLoan(book,this);
			Loans.add(Loan);
		}
		return Loan;
	}
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public ArrayList<Loan> getLoans() {
		return Loans;
	}
	public void setLoans(ArrayList<Loan> loans) {
		Loans = loans;
	}
	
	
}
