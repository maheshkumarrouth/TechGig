package de.cultuzz.techgig.startup;

import org.hibernate.SessionFactory;
import org.hibernate.jpa.HibernateEntityManagerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import de.cultuzz.techgig.test.TestDAOService;

@SpringBootApplication(scanBasePackages="de.cultuzz.techgig")
public class ApplicationStarter implements CommandLineRunner{

	@Autowired
	protected SessionFactory mySessionFactory;
	
	@Autowired
	private TestDAOService testDAOService;
	
	public static void main(String args[]) {
		SpringApplication.run(ApplicationStarter.class, args);
	}
	
	@Bean
	public SessionFactory sessionFactory(HibernateEntityManagerFactory hemf) {
		return hemf.getSessionFactory();
	}

	public void run(String... arg0) throws Exception {
		System.out.println("Mahesh");
		try{
		System.out.println("test data+"+testDAOService.findAllData());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
