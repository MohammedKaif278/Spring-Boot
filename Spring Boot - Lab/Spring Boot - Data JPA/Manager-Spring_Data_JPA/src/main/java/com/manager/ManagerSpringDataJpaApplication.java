package com.manager;

import java.util.Iterator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.manager.dao.ManagerRepository;
import com.manager.model.Manager;

@SpringBootApplication
public class ManagerSpringDataJpaApplication {

   

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(ManagerSpringDataJpaApplication.class, args);
		ManagerRepository managerRepository = run.getBean(ManagerRepository.class);
		System.err.println(managerRepository.getClass().getName());
		Manager m=new Manager();
		
		//Insert Manager
		m.setMId(101);
		m.setMName("kaif");
		m.setMSalary(50000);
		m.setMDept("information Technology");
		managerRepository.save(m);
		
		
		//Update Manager
//		m.setMId(101);
//		m.setMName("Mohammed Kaif");
//		m.setMSalary(100000);
//		m.setMDept("IT");
//		managerRepository.save(m);
		
		
		//Fetch All
//		Iterable<Manager> all = managerRepository.findAll();
//		for (Manager manager : all) {
//			System.out.println(manager);
//		}
		
		//Fetch All by using Lambda Expression
//		Iterable<Manager> all = managerRepository.findAll();
//		all.forEach(manager -> System.out.println(manager));
		
		
		//Fetch All by using Method Reference
//		Iterable<Manager> all = managerRepository.findAll();
//		all.forEach(System.out::println);
		
		//Delete By Id
//		managerRepository.deleteById(101);
	}

}
