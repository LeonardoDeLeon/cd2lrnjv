package com.alienators.SpringDataJpaMongoDb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.alienators.SpringDataJpaMongoDb.dto.CustomerDto;
import com.alienators.SpringDataJpaMongoDb.idgenerator.IdGenerator;
import com.alienators.SpringDataJpaMongoDb.service.CustomerServiceImpl;

@SpringBootApplication
public class SpringDataJpaMongoDbApplication {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext container=SpringApplication.run(SpringDataJpaMongoDbApplication.class, args);

		CustomerServiceImpl service=container.getBean(CustomerServiceImpl.class);

		// CustomerDto dto = new CustomerDto(2,"Ramesh","Pune");
		CustomerDto dto=new CustomerDto();
		dto.setId(IdGenerator.generateId());
		dto.setCxNo(45);
		dto.setName("Sap");
		dto.setCity("BLR");
		String status=service.registerCustomerInfo(dto);
		System.out.println(status);

		service.fetchAllCx().forEach(c->System.out.println(c));

		// String status=service.deleteDocument("665904f7d5e1b4156ff51d63");
		// System.out.println(status);
		container.close();
	}

}
