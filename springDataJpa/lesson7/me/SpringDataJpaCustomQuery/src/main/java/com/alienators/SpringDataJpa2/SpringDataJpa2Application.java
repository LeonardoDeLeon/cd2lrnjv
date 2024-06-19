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
import com.alienators.SpringDataJpa2.view.ResultView2;
import com.alienators.SpringDataJpa2.view.ResultView3;

@SpringBootApplication
public class SpringDataJpa2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container=SpringApplication.run(SpringDataJpa2Application.class, args);
		VaccineServiceImpl service=container.getBean(VaccineServiceImpl.class);


		// service.fetchByVaccineCompanyName("Astrazenca").forEach(v->System.out.println(v));
		// System.out.println("*********************************************************");
		// service.fetchByVaccineCompanyName("Astrazenca","BharatBio").forEach(v->System.out.println(v));
		// System.out.println("*********************************************************");
		// List<String> list=service.fetchByVaccinePriceRange(500,2500);
		// System.out.println(list);

		// List<Object[]> vaccineInfo=service.fetchVaccineInfoByVaccineName("CovidShield", "Covaxin");
		// for (Object[] objects:vaccineInfo)
		// {		
		// 	for(Object vaccine:objects)
		// 	{
		// 		System.out.println(vaccine+" ");
		// 	}

		// 	System.out.println();
		// }

		// int rowsAffected=service.updateThePriceOfByVaccineName(4545, "Covaxin");
		// System.out.println("Num of records updated: "+rowsAffected);
	
		// int rowsAffected=service.deleteTheByVaccinePriceRange(500,1500 );
		// System.out.println("Num of records DELETED: "+rowsAffected);

		//int rowsInserted=service.insertVaccineInfo(44,"Covaxin","BharatBio",45454);
		// int rowsInserted=service.insertVaccineInfo(45,"Sputnik","Russiam",35454);
		// int rowsInserted=service.insertVaccineInfo(46,"Phizer","USA",9994);
		int rowsInserted=service.insertVaccineInfo(47,"CovicShield","Astrazenca",999);
		System.out.println("Number of rows inserted: "+rowsInserted);
	
	}

}
