package de.cultuzz.techgig.test;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import de.cultuzz.techgig.model.HotelDetails;

public interface HotelDetailsRepository extends CrudRepository<HotelDetails,Integer> {
    List<HotelDetails> findById(Integer id);
}
