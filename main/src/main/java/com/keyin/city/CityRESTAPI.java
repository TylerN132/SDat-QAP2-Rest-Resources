package com.keyin.city;

import com.keyin.airport.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "com/keyin/city", path = "com/keyin/city")
public interface CityRESTAPI extends JpaRepository<com.keyin.city.City, Long> {
}