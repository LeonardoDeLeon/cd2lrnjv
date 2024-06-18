package com.alienators.SpringDataJpa1;

import java.util.Iterator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.alienators.SpringDataJpa1.dao.IStudentRepo;
import com.alienators.SpringDataJpa1.dao.Student;

@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container=SpringApplication.run(SpringDataJpa1Application.class, args);
		IStudentRepo repo=container.getBean(IStudentRepo.class);

		System.out.println(("implemention class of Repo "+ repo.getClass().getName()));
		// Student st=new Student(12,18,"Rajat");
		Student st=new Student(14,16,"Eastwood");
		Student st2=repo.save(st);
		System.out.println(st2);

		System.out.println("repo.count(): "+repo.count()); // of records in the table

		// repo.deleteById(2);
		
		// Iterable<Student> records=repo.findAll();
		
		// Iterator<Student> iter=records.iterator();
		// while(iter.hasNext()){
		// 	Student s=iter.next();
		// 	System.out.println(s);
		// }
		repo.findAll().forEach(s->System.out.println(s));
		Integer id = 13;
		Boolean status=repo.existsById(id);
		System.out.println("Record id = "+id+" existed? "+status);

	}

}
