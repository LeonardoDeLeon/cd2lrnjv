package com.alienators.SpringDataJpa2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.alienators.SpringDataJpa2.service.VaccineServiceImpl;

@SpringBootApplication
public class SpringDataJpa2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container=SpringApplication.run(SpringDataJpa2Application.class, args);
		VaccineServiceImpl service=container.getBean(VaccineServiceImpl.class);

		// service.fetchDetails(true, "VaccineName").
		// forEach(c->System.out.println(c.getVaccineName()+" -> "+c.getVaccineCompany()));
	
		// service.fetchDetails(0, 4, true, "vaccineName").
		// forEach(c->System.out.println(c.getVaccineName()+" -> "+c.getVaccineCompany()));

		service.fetchDetailsPagination(1);
	}

}
