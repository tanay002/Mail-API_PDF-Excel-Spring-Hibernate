package com.SpringBeanAutowireing.Autowiring.ByType;

public class AddressDtoByType {
private String city;

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

@Override
public String toString() {
	return "AddressDtoByType [city=" + city + "]";
}



}
