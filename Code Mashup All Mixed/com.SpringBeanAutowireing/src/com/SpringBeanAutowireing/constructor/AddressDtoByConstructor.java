package com.SpringBeanAutowireing.constructor;

public class AddressDtoByConstructor {
	private int addId;

	
	public AddressDtoByConstructor(int addId) {
		super();
		this.addId = addId;
	}


	@Override
	public String toString() {
		return "AddressDtoByConstructor [addId=" + addId + "]";
	}

	
}
