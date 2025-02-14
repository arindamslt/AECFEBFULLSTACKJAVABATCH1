package com.arindam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.arindam.bean.Customer;

@SpringBootApplication
public class BootDemoApplication implements CommandLineRunner {
	@Autowired
private Customer cs;
	public static void main(String[] args) {
		SpringApplication.run(BootDemoApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(cs);
	}

}
