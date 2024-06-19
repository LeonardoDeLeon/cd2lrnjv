package com.alienators.SpringDataJpa2;

import java.util.ArrayList;
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

		// Vaccine vaccineInfo1=new Vaccine("Covaxin", "BharatBio", 945);

		// service.searchByGivenVaccineInfo(vaccineInfo1, true,"vaccineName")
		// .forEach(c->System.out.println(c));

		// Vaccine v=service.searchVaccineById(1);
		// System.out.println(v);

		// Vaccine vaccineInfo1=new Vaccine("Covaxin", "BharatBio", 945);
		// service.searchVaccineByObj(vaccineInfo1).forEach(v-> System.out.println(v));

		List<Integer> ids = new ArrayList<>();
		ids.add(11);
		ids.add(3);
		String status=service.removeVaccineInfoByIds(ids);
		System.out.println(status);
	}

}
