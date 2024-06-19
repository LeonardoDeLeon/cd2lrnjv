package com.alienators.SpringDataJpa2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.alienators.SpringDataJpa2.dao.Vaccine;
import com.alienators.SpringDataJpa2.service.VaccineServiceImpl;

@SpringBootApplication
public class SpringDataJpa2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container=SpringApplication.run(SpringDataJpa2Application.class, args);
		VaccineServiceImpl service=container.getBean(VaccineServiceImpl.class);

		// service.fetchByCost(945).forEach(c->System.out.println(c));
	
		// service.fetchByVaccineCompany("Astrazenca").forEach(v->System.out.println(v));

		// service.fetchByCostLessThan(1000).forEach(v->System.out.println(v));

		// service.fetchByCostBetween(500,1500).forEach(v->System.out.println(v));

		Collection<String> vaccines = new HashSet<>();
		vaccines.add("CovidShield");
		vaccines.add("Sputnik");
		vaccines.add("Covaxin");
		service.fetchByVaccineNameInAndCostBetween(vaccines,500,1500).forEach(v->System.out.println(v));

	}

}
