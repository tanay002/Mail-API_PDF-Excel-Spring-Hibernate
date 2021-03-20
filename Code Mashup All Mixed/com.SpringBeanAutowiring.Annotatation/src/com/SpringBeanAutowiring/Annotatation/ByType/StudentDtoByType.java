package com.SpringBeanAutowiring.Annotatation.ByType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class StudentDtoByType {
	@Autowired
	private AddressDtoByType ad;

	
	@Autowired
	@Qualifier("ad1")
	public AddressDtoByType getAd() {
		return ad;
	}


	@Override
	public String toString() {
		return "StudentDtoByType [ad=" + ad + "]";
	}
	
	

}
