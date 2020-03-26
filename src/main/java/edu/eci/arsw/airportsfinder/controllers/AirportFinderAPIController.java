
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.airportsfinder.controllers;

import edu.eci.arsw.airportsfinder.persistence.AirportNotFoundException;
import edu.eci.arsw.airportsfinder.services.AirportsFinderServices;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ricardo Martinez
 */
@RestController
@RequestMapping(value = "/Airports")
public class AirportFinderAPIController {

    @Autowired
    AirportsFinderServices afs = null;
    
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> GetAllAirports(){
        try {
            return new ResponseEntity<>(afs.getAllAirports(),HttpStatus.ACCEPTED);
        } catch (AirportNotFoundException e) {
            Logger.getLogger(AirportFinderAPIController.class.getName()).log(Level.SEVERE, null, e);
            return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }
}