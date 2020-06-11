package com.spring.webflux;

//import com.spring4all.mongodb.EnableMongoPlus;
import com.spring.webflux.reactive.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableWebFlux
//@EnableMongoPlus
public class HighwayApplication implements CommandLineRunner {

    @Autowired
    private VehicleRepository vehicleRepository;

    public static void main( String[] args )
    {
        SpringApplication.run(HighwayApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        vehicleRepository.deleteAll();
    }
}
