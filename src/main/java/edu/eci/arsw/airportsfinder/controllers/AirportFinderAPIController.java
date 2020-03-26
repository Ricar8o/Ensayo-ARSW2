
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.airportsfinder.controllers;

import edu.eci.arsw.airportsfinder.model.Airport;
import edu.eci.arsw.blueprints.persistence.BlueprintNotFoundException;
import edu.eci.arsw.blueprints.persistence.BlueprintPersistenceException;
import edu.eci.arsw.blueprints.services.BlueprintsServices;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hcadavid
 */
@RestController
@RequestMapping(value = "/blueprints")
public class AirportFinderAPIController {
    @Autowired
    AirporFinderServices afs = null;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> GetAllBlueprintFilter(){
        try {
            return new ResponseEntity<>(bps.getAllBlueprints(),HttpStatus.ACCEPTED);
        } catch (BlueprintNotFoundException e) {
            Logger.getLogger(AirportFinderAPIController.class.getName()).log(Level.SEVERE, null, e);
            return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }