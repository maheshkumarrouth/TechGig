package de.cultuzz.techgig.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.Scheduled;


@SpringBootApplication
public class ApplicationStarter {

	public static void main(String args[]) {
		SpringApplication.run(ApplicationStarter.class, args);
	}
	
}