package UserDefinedSet;

public class AddressDto2 {

	
	private int addid;
	private String city;
	
	
	public AddressDto2(int addid, String city) {
		super();
		this.addid = addid;
		this.city = city;
	}


	@Override
	public String toString() {
		return "AddressDto2 [addid=" + addid + ", city=" + city + "]";
	}

	
	
}
