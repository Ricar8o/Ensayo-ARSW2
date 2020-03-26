/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.eci.arsw.airportsfinder.persistence;

/**
 * @author Ricardo Martinez
 */
public class AirportNotFoundException extends Exception{

    /**
     *
     */
    private static final long serialVersionUID = 3135806385913115480L;

    public AirportNotFoundException(String message) {
        super(message);
    }

    public AirportNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
    
}