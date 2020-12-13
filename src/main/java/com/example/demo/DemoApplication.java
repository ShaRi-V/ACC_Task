package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import java.sql.Connection;
//import java.sql.DriverManager;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
//		try {
//		       Class.forName("com.mysql.jdbc.Driver");
//		       Connection conn = DriverManager.getConnection ("jdbc:mysql://localhost/test","root","");
//		       System.out.println("Connection successful");
//		 } catch (Exception e) {
//		       System.err.println(e);
//		 }
	}

}
