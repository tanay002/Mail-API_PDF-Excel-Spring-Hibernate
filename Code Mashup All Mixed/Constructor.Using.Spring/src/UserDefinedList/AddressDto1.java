package UserDefinedList;

import java.util.List;

public class AddressDto1 {

	public AddressDto1(int addid, String city) {
		super();
		this.addid = addid;
		this.city = city;
	}
	private int addid;
	private String city;
	@Override
	public String toString() {
		return "AddressDto1 [addid=" + addid + ", city=" + city + "]";
	}

	
	
	
}
