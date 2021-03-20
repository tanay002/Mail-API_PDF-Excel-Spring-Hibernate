package com.SpringBeanAutowiring.Annotatation.ByName;

public class AddressDtoByName {

	private int addid;

	
	public void setAddid(int addid) {
		this.addid = addid;
	}


	@Override
	public String toString() {
		return "AddressDtoByName [addid=" + addid + "]";
	}

}
