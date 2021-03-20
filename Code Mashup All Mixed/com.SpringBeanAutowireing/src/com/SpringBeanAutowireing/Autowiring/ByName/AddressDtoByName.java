package com.SpringBeanAutowireing.Autowiring.ByName;

public class AddressDtoByName {
	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "AddressDtoByName [city=" + city + "]";
	}

}
