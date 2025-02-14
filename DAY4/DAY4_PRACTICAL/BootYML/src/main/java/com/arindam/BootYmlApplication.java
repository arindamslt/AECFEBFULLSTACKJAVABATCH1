package com.arindam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.arindam.bean.DbConn;

@SpringBootApplication
public class BootYmlApplication implements CommandLineRunner{
	@Autowired
private DbConn db;
	public static void main(String[] args) {
		SpringApplication.run(BootYmlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(db);
	}

}
