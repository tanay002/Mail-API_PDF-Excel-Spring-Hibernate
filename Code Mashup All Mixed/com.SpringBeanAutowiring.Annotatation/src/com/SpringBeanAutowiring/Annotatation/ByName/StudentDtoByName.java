package com.SpringBeanAutowiring.Annotatation.ByName;

import org.springframework.beans.factory.annotation.Autowired;

public class StudentDtoByName {

	private AddressDtoByName ad;

	@Autowired
	public void setAd(AddressDtoByName ad) {
		this.ad = ad;
	}

	@Override
	public String toString() {
		return "StudentDtoByName [ad=" + ad + "]";
	}

}
