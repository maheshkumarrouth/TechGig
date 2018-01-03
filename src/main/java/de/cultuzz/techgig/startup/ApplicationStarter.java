package de.cultuzz.techgig.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "de.cultuzz.techgig")
@EntityScan( basePackages = {"de.cultuzz.techgig.model"} )
// public class ApplicationStarter implements CommandLineRunner{
public class ApplicationStarter {


	public static void main(String args[]) {
		SpringApplication.run(ApplicationStarter.class, args);
	}

//	@Bean
//	public SessionFactory sessionFactory(HibernateEntityManagerFactory hemf) {
//		return hemf.getSessionFactory();
//	}

	// public void run(String... arg0) throws Exception {
	// System.out.println("Mahesh");
	// try{
	// System.out.println("test data+"+testDAOService.findAllData());
	// }catch(Exception e){
	// e.printStackTrace();
	// }
	// }

}
