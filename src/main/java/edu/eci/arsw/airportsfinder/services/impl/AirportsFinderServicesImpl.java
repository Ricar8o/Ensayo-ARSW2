package edu.eci.arsw.airportsfinder.services.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.eci.arsw.airportsfinder.persistence.AirportNotFoundException;
import edu.eci.arsw.airportsfinder.persistence.AirportsFinderCache;
import edu.eci.arsw.airportsfinder.services.AirportsFinderServices;
import edu.eci.arsw.airportsfinder.services.HTTPConnectionService;
import edu.eci.arsw.airportsfinder.model.Airport;

/**
 * @author Ricardo Martinez
 */
@Service
public class AirportsFinderServicesImpl implements AirportsFinderServices{

    @Autowired
    HTTPConnectionService hcs;

    @Autowired
    AirportsFinderCache afc;

	public ArrayList<Airport> getAllAirports() throws AirportNotFoundException{

        return null;
    }

}