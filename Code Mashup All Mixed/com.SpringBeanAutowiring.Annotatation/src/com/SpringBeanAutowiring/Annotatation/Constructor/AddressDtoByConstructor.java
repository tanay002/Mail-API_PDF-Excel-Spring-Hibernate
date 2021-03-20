package com.SpringBeanAutowiring.Annotatation.Constructor;

public class AddressDtoByConstructor {
	private int addid;

	public AddressDtoByConstructor(int addid) {
		super();
		this.addid = addid;
	}

	@Override
	public String toString() {
		return "AddressDtoByConstructor [addid=" + addid + "]";
	}
	
	

}
