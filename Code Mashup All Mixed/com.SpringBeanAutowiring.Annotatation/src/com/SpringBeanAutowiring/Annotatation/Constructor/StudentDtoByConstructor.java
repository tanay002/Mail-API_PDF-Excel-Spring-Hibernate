package com.SpringBeanAutowiring.Annotatation.Constructor;

import org.springframework.beans.factory.annotation.Autowired;

public class StudentDtoByConstructor {

	@Autowired
	private AddressDtoByConstructor ad;

	
	@Autowired
	public StudentDtoByConstructor(AddressDtoByConstructor ad) {
		super();
		this.ad = ad;
	}


	@Override
	public String toString() {
		return "StudentDtoByConstructor [ad=" + ad + "]";
	}

	
	
}
