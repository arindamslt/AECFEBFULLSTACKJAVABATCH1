package com.arindam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.arindam.bean.Project;

@SpringBootApplication
public class BootScopeApplication implements CommandLineRunner {
@Autowired
private Project pr1;
@Autowired
private Project pr2;
	public static void main(String[] args) {
		SpringApplication.run(BootScopeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		pr1.setProjectid("PROJ1");
		pr1.setProjectname("JEE");
		pr1.setDuration(2);
		pr2.setProjectid("PROJ2");
		pr2.setProjectname("FULLSTACK JAVA");
		pr2.setDuration(4);
		System.out.println(pr1);
		System.out.println(pr2);
	}

}
