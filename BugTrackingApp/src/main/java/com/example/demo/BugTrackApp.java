package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entities.BugTrackingIssues;
import com.example.demo.repository.BugTrackingRepository;

@SpringBootApplication
public class BugTrackApp {

	public static void main(String[] args) {
		SpringApplication.run(BugTrackApp.class, args);
	}
	
	
	@Bean
	public CommandLineRunner runner() {
		return new CommandLineRunner() {
			
			@Autowired
			private BugTrackingRepository repo;
			
			@Override
			public void run(String... args) throws Exception {
				repo.save(new BugTrackingIssues(111,"Issue with imports","Unused Imports causing Errors","rest-jersey-client","Medium","Sourabh"));
				repo.save(new BugTrackingIssues(112,"Issue with Post Method","Post Method not implemented properly","first-maven","Major","Ayush"));
				repo.save(new BugTrackingIssues(113,"Connection Issue","Connection to DataBase Check","cab-driver-rest-api","Critical","Ramesh"));
				repo.save(new BugTrackingIssues(114,"Exception not handled","Unhandled Exceptions, add appropriate code to handle it","ArraysAndFlowControl","Medium","Akash"));
				repo.save(new BugTrackingIssues(115,"Configuration Server Issue","Check if the configuration Server is running","config-server","Critical","Pankaj"));

				
			}
			
		};
	}
	
	
}
