package edu.eci.arsw.airportsfinderAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"edu.eci.arsw.airportsfinder"})
public class AirportsFinderAPIApplication {

    public static void main(String[] args) {
        SpringApplication.run(AirportsFinderAPIApplication.class, args);
	}
}