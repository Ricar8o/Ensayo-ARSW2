package edu.eci.arsw.airportsfinder.services.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.springframework.stereotype.Service;


/**
 * @author Ricardo Martinez
 */
@Service
public class HTTPConnectionServicesImpl {

    private static final String USER_AGENT = "Mozilla/5.0";
    private static final String GET_URL = "https://rapidapi.com/cometari/api/airportsfinder";

    
}