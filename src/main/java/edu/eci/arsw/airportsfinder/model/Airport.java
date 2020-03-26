package edu.eci.arsw.airportsfinder.model;

import java.util.List;

/**
 * @author Ricardo Martinez
 */
public class Airport{
    private String id;
    private String code;
    private String name;
    private Location location;
    private String cityId;
    private String city;
    private String countryCode;
    private List<String> themes;
    private List<String> pointsOfSale;
    
    public Airport(String id, String code, String name,Location location,String cityId,String city, String countryCode){
        this.id = id;
        this.code = code;
        this.name = name;
        this.location = location;
        this.cityId = cityId;
        this.city =  city;
        this.countryCode = countryCode;
    }

    public Airport(){
    }

    public String  getId() {
        return this.id;
    }

    public String getCode() {
        return this.code;
    }
    public String getName() {
        return this.name;
    }
    public Location getLocation() {
        return this.location;
    }
    public String  getCityId() {
        return this.cityId;
    }
    public String getCity() {
        return this.city;
    }
    public String getCountryCode() {
        return this.countryCode;
    }

    public List<String> getThemes(){
		return this.themes;
	}
	
	public List<String> getPointsOfSale(){
		return this.pointsOfSale;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public void setName(String name) {
        this.name=name;
    }
    public void setLocation(Location location) {
        this.location=location;
    }
    public void setCityId(String cityId) {
        this.cityId= cityId;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode= countryCode;
    }
    
    public void setThemes(List<String> themes){
		this.themes=themes;
	}
	
	public void setPointsOfSale(List<String> pointsOfSale){
		this.pointsOfSale=pointsOfSale;
	}
}