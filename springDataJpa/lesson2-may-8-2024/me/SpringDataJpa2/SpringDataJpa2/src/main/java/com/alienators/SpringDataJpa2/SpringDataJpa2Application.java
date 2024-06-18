package com.alienators.SpringDataJpa2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

		// Vaccine vaccineInfo = new Vaccine("CovidShield","Astrazenca",999);
		// String status=service.registerVaccineInfo(vaccineInfo);
		// System.out.println(status);

		// Vaccine vaccineInfo1 = new Vaccine("Covaxin","BharatBio",945);
		// Vaccine vaccineInfo2 = new Vaccine("Phizer","USA",9994);
		// Vaccine vaccineInfo3 = new Vaccine("Sputnik","Russiam",45454);

		// List<Vaccine> vacList = new ArrayList<>();
		// vacList.add(vaccineInfo1);
		// vacList.add(vaccineInfo2);
		// vacList.add(vaccineInfo3);

		// service.registerMultipleVaccines(vacList).forEach(v->System.out.println(v));

		// System.out.println("No of vaccines registered: "+service.getVaccineCount());

		// Boolean status = service.checkAvailability(2);
		// if (status)
		// 	System.out.println("Vaccine available");
		// else
		// 	System.out.println("Vaccine unavailable");

		// service.getAllVaccinesInfo().forEach(v->System.out.println(v));

		// List<Integer> ids = new ArrayList<>();
		// ids.add(1);
		// ids.add(4);
		// ids.add(3);
		// service.getAllVaccinesSpecific(ids).forEach(v->System.out.println(v));

		// Integer id=6;
		// Optional<Vaccine> optional=service.getVaccineById(id);
		// Vaccine v;
		// if(optional.isPresent())
		// 	System.out.println(optional.get());
		// else {
		// 	// optional.orElseThrow(()->new IllegalArgumentException("Record not found!"));
		// 	System.out.println(optional.orElse(new Vaccine()));
		// }
		// System.out.println(service.removeVaccineById(id));

		// List<Integer> ids = new ArrayList<>();
		// ids.add(11);
		// ids.add(21);
		// ids.add(5);

		// String msg = service.removeVaccinesByIds(ids);
		// System.out.println(msg);

		//Vaccine vaccineInfo3 = new Vaccine("Cvdprtk","NewGenLab",1999);
		Vaccine vaccineInfo3 = new Vaccine("Sputnik","Russiam",45454);
		vaccineInfo3.setId(4);

		String msg=service.removeVaccineUsingVaccineObj(vaccineInfo3);
		System.out.println(msg);

	}

}
