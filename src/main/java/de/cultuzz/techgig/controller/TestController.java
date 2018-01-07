package de.cultuzz.techgig.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.cultuzz.techgig.test.TestDAOService;
import de.cultuzz.techgig.test.HotelDetailsRepository;

@RestController
@RequestMapping("/test")
public class TestController {

	@Autowired
	private TestDAOService testDAOService;
	
    @Autowired
    private HotelDetailsRepository hotelDetailsRepository;


	
	@RequestMapping("/hello")
	public String sayHai(){
		try {
			hotelDetailsRepository.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Hai";
	}
}
