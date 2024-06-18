package com.alienators.SpringJDBCAPI;

import java.util.Iterator;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.alienators.SpringJDBCAPI.dao.Employee;
import com.alienators.SpringJDBCAPI.dao.EmployeeDaoImpl;


@SpringBootApplication
public class SpringJdbcapiApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringJdbcapiApplication.class, args);
		ConfigurableApplicationContext container = SpringApplication.run(SpringJdbcapiApplication.class, args);
		EmployeeDaoImpl dao=container.getBean(EmployeeDaoImpl.class);

		// List<Employee> employeesData=dao.getEmployeesData();
		// Iterator<Employee> itr=employeesData.iterator();
		// while(itr.hasNext()){
		// 	System.out.println(itr.next());
		// }
		dao.getEmployeesData().forEach(e->System.out.println(e));
	}

}
