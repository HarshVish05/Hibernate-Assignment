package com.harsh.Assignment;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Book book = new Book();
    	book.setBookId(101);
    	book.setBookName("The Murder of roger Ackroyd");
    	book.setAuthorName("Agatha Christie");
    	book.setPages(238);
    	
    	Book book2 = new Book();
    	book2.setBookId(102);
    	book2.setBookName("The 48 laws of power");
    	book2.setAuthorName("Robert Greene");
    	book2.setPages(508);
    	
    	Book book3 = new Book();
    	book3.setBookId(103);
    	book3.setBookName("Dumb Witness");
    	book3.setAuthorName("Agatha Christie");
    	book3.setPages(256);
    	
    	
    	List<Book> bookList = Arrays.asList(book,book2,book3);
    
    	
    	User user = new User();
    	user.setUser_id(1);
    	user.setUser_name("Devnash");
//    	user.setBookList(bookList);
    	
    	User user1 = new User();
    	user1.setUser_id(2);
    	user1.setUser_name("Rohit");
    	
    	List<User> userList = Arrays.asList(user,user1);
    	
    	book3.setUserListNew(userList);
    	user1.setBookListNew(bookList);
    	
    	
    	Configuration config = new Configuration().configure().addAnnotatedClass(Book.class).addAnnotatedClass(User.class);
        SessionFactory fact = config.buildSessionFactory();
        
        Session session = fact.openSession();
        Transaction tx = session.beginTransaction();
        
        session.save(book);
        session.save(book2);
        session.save(book3);
        session.save(user);
        session.save(user1);

        tx.commit();
    }
}
