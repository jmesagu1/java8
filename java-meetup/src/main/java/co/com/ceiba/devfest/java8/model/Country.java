package co.com.ceiba.devfest.java8.model;

import java.util.Optional;

public class Country {

	private City city;

	public City getCity() {
		return city;
	}
	
	public Optional<City> getCityOp() {
		return Optional.ofNullable(city);
	}

	public void setCity(City city) {
		this.city = city;
	}
	
}
