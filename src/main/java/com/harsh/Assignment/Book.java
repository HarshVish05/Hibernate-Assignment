package com.harsh.Assignment;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Book {
	
	@Id
	private int bookId;
	
	private String bookName;
	private String authorName;
	private int pages;
	
	@ManyToMany
	private List<User> userListNew = new ArrayList<User>();
	
	public List<User> getUserListNew() {
		return userListNew;
	}
	public void setUserListNew(List<User> userListNew) {
		this.userListNew = userListNew;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	

}
