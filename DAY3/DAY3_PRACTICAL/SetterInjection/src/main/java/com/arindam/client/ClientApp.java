package com.arindam.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.arindam.bean.Employee;
import com.arindam.config.SpringConfig;

public class ClientApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(SpringConfig.class);	// TODO Auto-generated method stub
        Employee em=(Employee)ac.getBean("emp");
        System.out.println(em);
	}

}
