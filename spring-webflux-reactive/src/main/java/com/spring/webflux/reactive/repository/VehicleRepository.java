package com.spring.webflux.reactive.repository;

import com.spring.webflux.reactive.model.Vehicle;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface VehicleRepository extends MongoRepository<Vehicle, Integer> {
    List<Vehicle> findByCarPlateNumber(String num);
}