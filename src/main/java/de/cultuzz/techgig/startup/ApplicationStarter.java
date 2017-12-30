package de.cultuzz.techgig.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="de.cultuzz.techgig")
public class ApplicationStarter {

	public static void main(String args[]) {
		SpringApplication.run(ApplicationStarter.class, args);
	}
	
}
