package com.arindam.client;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.arindam.entity.Product;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityTransaction tx=null;
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("AppDB");
		EntityManager em=emf.createEntityManager();//for create update delete
		tx=em.getTransaction();//TRANSACTION CREATED
		tx.begin();//start the transaction
		//CREATION OF TABLE AND INSERT DATA
		Product pr1=new Product("P1","TV",5,25000.00);//row of table
		Product pr2=new Product("P2","TAB",15,22000.00);//row of table
		//em.persist(pr1);
		//em.persist(pr2);
		//DELETE DATA
		/*Product ps=em.find(Product.class,"P2");
		if(ps!=null)
		{
			em.remove(ps);
		}*/
		//UPDATE DATA
		/*Product ps=em.find(Product.class,"P1");
		if(ps!=null)
		{
			ps.setPname("REFRIGERATOR");
			ps.setPqty(15);
			ps.setPrice(27000.00);
			em.merge(ps);
		}*/
		//FETNCHING    DATA
		//String jpql="select p from Product p";
		String hql="from Product";
		//Query query=em.createQuery(jpql);
		Query query=em.createQuery(hql);
		List<Product> plist=query.getResultList();
		plist.stream().forEach(System.out::println);
		
		tx.commit();
		emf.close();
	}

}
