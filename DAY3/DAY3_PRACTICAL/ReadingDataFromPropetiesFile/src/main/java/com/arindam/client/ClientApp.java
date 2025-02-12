package com.arindam.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.arindam.bean.Emp;
import com.arindam.config.SpringConfig;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(SpringConfig.class);
        Emp e=(Emp)ac.getBean("empl");
        System.out.println(e);
	}

}
