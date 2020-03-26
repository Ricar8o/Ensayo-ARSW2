package edu.eci.arsw.airportsfinder.model;
/**
 * @ Ricardo Martinez
 */
public class Location {
    private String longitude;
    private String latitude;

    public Location(String longitude, String latitude){
        this.longitude=longitude;
        this.latitude=latitude;
    }

    public Location(){}

    public String getLongitude(){
        return this.longitude;
    }
    public String getLatitude(){
        return this.latitude;
    }

    public void setLongitude(String longitude){
        this.longitude = longitude;
    }
    public void setLatitude(String latitude){
        this.latitude = latitude;
    }
}
