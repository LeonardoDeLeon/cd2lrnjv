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

		service.fetchByCostLessThan(2500,ResultView3.class).forEach(v->System.out.println(v.getVaccineName()+" : "+v.getCost()));
		service.fetchByCostLessThan(2500,ResultView2.class).forEach(v->System.out.println(v.getVaccineName()+" : "+v.getId()));
	}

}
