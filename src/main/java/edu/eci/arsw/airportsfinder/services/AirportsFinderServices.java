package edu.eci.arsw.airportsfinder.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import edu.eci.arsw.airportsfinder.persistence.AirportNotFoundException;
import edu.eci.arsw.airportsfinder.model.Airport;

/**
 * @author Ricardo Martinez
 */
public interface AirportsFinderServices {

    @Autowired
    HTTPConnectionService hcs = null;

	public ArrayList<Airport> getAllAirports() throws AirportNotFoundException;

}