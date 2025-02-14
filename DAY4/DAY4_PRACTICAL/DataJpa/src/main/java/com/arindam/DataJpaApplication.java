package com.arindam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.arindam.model.Job;
import com.arindam.service.JobService;

@SpringBootApplication
public class DataJpaApplication implements CommandLineRunner {
	@Autowired
private JobService jservice;
	public static void main(String[] args) {
		SpringApplication.run(DataJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Job j=new Job("J2","DOT NET DEVELOPER", 1,"CAPGEMINI");
		//jservice.addData(j);
		System.out.println("ALL RECORDS======");
		List<Job> jlist=jservice.getData();
		jlist.stream().forEach(System.out::println);
		//FETCHING DATA BASED ON PRIMARY KEY
		System.out.println("BASED ON PRIMARY KEY=======");
		Job jb=jservice.getJidDetails("J1");
		System.out.println(jb);
		System.out.println("DELETE DATA FROM TABLE===========");
		//jservice.deleteData("J2");
		System.out.println("UPDATE DATA======");
		Job jbs=jservice.updateData("J1");
		System.out.println(jbs);
	}

}
