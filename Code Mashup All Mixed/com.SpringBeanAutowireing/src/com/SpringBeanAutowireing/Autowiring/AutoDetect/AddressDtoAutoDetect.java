package com.SpringBeanAutowireing.Autowiring.AutoDetect;

public class AddressDtoAutoDetect {
	private String city;

	
	public AddressDtoAutoDetect(String city) {
		super();
		this.city = city;
	}


	@Override
	public String toString() {
		return "AddressDtoAutoDetect [city=" + city + "]";
	}
	

}
