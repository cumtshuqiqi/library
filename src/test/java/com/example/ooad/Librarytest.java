package com.example.ooad;

import com.example.ooad.domain.Book;
import com.example.ooad.domain.BookShelf;
import com.example.ooad.domain.Loan;
import com.example.ooad.domain.Member;

public class Librarytest {
	public static void main(String[] args) throws InterruptedException{
		Book book1 = new Book("鲁迅", "文学", "111", "华盖集");
		Book book2 = new Book("鲁迅", "文学", "112", "且介亭杂文");
		Book book3 = new Book("鲁迅", "文学", "113", "热风");
		Book book4 = new Book("鲁迅", "文学", "114", "南腔北调集");
		
		com.example.ooad.domain.Member Member=new Member("测试");
		BookShelf shelf=new BookShelf("鲁迅","文学");
		shelf.addBook(book1);
		shelf.addBook(book2);
		shelf.addBook(book3);
		shelf.addBook(book4);
		
		//����
		for(Book book:shelf.getBooks()) {
			if(book!=null) {
				Loan Loan=Member.Loan(book);
				book.setLoanto(Member);
				if(Loan!=null) {
					System.out.println(("借书成功\n" + "书名" + Loan.getBook().getTitle()	+ "\n借书时间" + Loan.getLoanDate())); 

				}
				else {System.out.println("该书已被借走");}
				
			}
			else {System.out.println("该书不存在");}
						
		}
		//����
		Member.Return(book2);
		System.out.println("还书成功"+ "书名" + book2.getTitle()); 

	} 
}
