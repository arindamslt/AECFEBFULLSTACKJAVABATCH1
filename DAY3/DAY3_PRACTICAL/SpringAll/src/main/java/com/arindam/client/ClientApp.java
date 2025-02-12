package com.arindam.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.arindam.bean.Category;
//import com.arindam.bean.Customer;
import com.arindam.config.SpringConfig;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(SpringConfig.class);
           //Customer c=(Customer)ac.getBean("cst");
Category cg=(Category) ac.getBean("cgs");          
//System.out.println(c);
System.out.println(cg);
	}

}
