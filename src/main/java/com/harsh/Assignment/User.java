package com.harsh.Assignment;

import java.util.List;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class User {
	
	@Id
	private int user_id;
	private String user_name;
	
	@OneToOne
	private Book book;
	
	@OneToMany
	private List<Book> bookList = new ArrayList<Book>();
	
	@ManyToMany
	private List<Book> bookListNew = new ArrayList<Book>();
	
	public List<Book> getBookListNew() {
		return bookListNew;
	}
	public void setBookListNew(List<Book> bookListNew) {
		this.bookListNew = bookListNew;
	}
	public List<Book> getBookList() {
		return bookList;
	}
	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	


}
