package com.alienators.SpringDataJDBC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.alienators.SpringDataJDBC.dao.SpringJdbc;

@SpringBootApplication
public class SpringDataJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJdbcApplication.class, args);
		// ApplicationContext context=SpringApplication.run(SpringDataJdbcApplication.class, args);
		// SpringJdbc jdbc=context.getBean(SpringJdbc.class);

		// jdbc.insert();
	}

}
