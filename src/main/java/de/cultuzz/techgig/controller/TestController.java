package de.cultuzz.techgig.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.cultuzz.techgig.test.TestDAOService;

@RestController
@RequestMapping("/test")
public class TestController {

	@Autowired
	private TestDAOService testDAOService;
	
	@RequestMapping("/hello")
	public String sayHai(){
		try {
			System.out.println(testDAOService.findAllData2().size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Hai";
	}
}
