package edu.eci.arsw.airportsfinder.model;

public class Airport{
    private String id;
    private String code;
    private String name;
    private Location location;
    private String cityId;
    private String city;
    private String countryCode;
    
    public Airport(String id, String code, String name,Location location,String cityId,String city, String countryCode){
        this.id = id;
        this.code = code;
        this.name = name;
        this.location = location;
        this.cityId = cityId;
        this.city =  city;
        this.countryCode = countryCode;
    }

}