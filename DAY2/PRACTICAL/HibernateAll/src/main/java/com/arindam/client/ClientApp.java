package com.arindam.client;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.arindam.entity.Adhar;
import com.arindam.entity.Customer;
import com.arindam.entity.Emp;
import com.arindam.entity.Employee;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EntityTransaction tx=null;
EntityManagerFactory emf=Persistence.createEntityManagerFactory("AppDB");
EntityManager em=emf.createEntityManager();//for create update delete
tx=em.getTransaction();//TRANSACTION CREATED
tx.begin();//start the transaction
//Customer cs1=new Customer("C1","AJOY","445545");
//em.persist(cs1);//SAVE THE DATA
/*Employee emp1=new Employee();
Employee emp2=new Employee();
emp1.setEname("ALOKE");
emp1.setEdesig("MANAGER");
emp1.setSal(54000.00);
emp1.setJoindt(new Date());
emp1.setWorkhr(new Date());
emp1.setEmail("al@gmail.com");
emp2.setEname("AYAN");
emp2.setEdesig("ANALYST");
emp2.setSal(45000.00);
emp2.setJoindt(new Date());
emp2.setWorkhr(new Date());
emp2.setEmail("ay@gmail.com");
em.persist(emp1);
em.persist(emp2);*/
Adhar ah1=new Adhar("Agrrt123","KOLKATA");
Adhar ah2=new Adhar("Areetete","CHENNAI");
Emp emp1=new Emp("E1","ALOKE",ah1);
Emp emp2=new Emp("E2","RUPAM",ah2);
em.persist(ah1);
em.persist(ah2);
em.persist(emp1);
em.persist(emp2);
tx.commit();
emf.close();

	}

}
