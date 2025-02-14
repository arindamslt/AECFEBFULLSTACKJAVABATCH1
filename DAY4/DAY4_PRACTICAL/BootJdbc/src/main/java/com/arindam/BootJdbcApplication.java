package com.arindam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class BootJdbcApplication implements CommandLineRunner{
	@Autowired
private JdbcTemplate template;
	String insert_sql="insert into account values('200','RAKIB',10000.00)";
	String select_sql="select * from account order by cname";
	public static void main(String[] args) {
		SpringApplication.run(BootJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		int n=template.update(insert_sql);
		System.out.println("THE NUMBER OF ROWS INSERTED:"+n);
		List aclist=template.queryForList(select_sql);
		aclist.stream().forEach(System.out::println);
	}

}
