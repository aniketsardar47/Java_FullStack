package com.mmcoe.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.mmcoe.entity.Book;
import com.mmcoe.entity.Customer;

public class BookDao {
	private  static EntityManagerFactory emf ;
	

	static {
		emf = Persistence.createEntityManagerFactory("MyJPA");
	}
	
	public Book save(Book b) {
		EntityManager mgr = emf.createEntityManager();
		EntityTransaction txn = mgr.getTransaction();
		
		try {
			txn.begin();
			mgr.persist(b);
			txn.commit();
			return b;
		}catch(Exception e) {
			e.printStackTrace();
			txn.rollback();
			return null;
		}finally {
			mgr.close();
		}
	}
	
	public Book find(int isbn) {
		EntityManager mgr = emf.createEntityManager();
		try {
		return mgr.find(Book.class, isbn);
		}finally {
			mgr.close();
		}
	}
	
	public List<Book> list(){
		EntityManager mgr = emf.createEntityManager();
		try {
			Query query = mgr.createQuery("FROM books");
			return query.getResultList();
		}finally {
			mgr.close();
		}
	}
	
	public boolean delete(int isbn) {
		EntityManager mgr = emf.createEntityManager();
		EntityTransaction txn = mgr.getTransaction();
		try {
			txn.begin();
			Book b = mgr.find(Book.class, isbn);
			mgr.remove(b);
			txn.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			txn.rollback();
			return false;
		} finally {
			mgr.close();
		}
	}
	
}
