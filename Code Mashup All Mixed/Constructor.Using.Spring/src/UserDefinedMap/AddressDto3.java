package UserDefinedMap;

public class AddressDto3 {

	private int addid;
	private String city;
	public AddressDto3(int addid, String city) {
		super();
		this.addid = addid;
		this.city = city;
	}
	@Override
	public String toString() {
		return "AddressDto3 [addid=" + addid + ", city=" + city + "]";
	}

	
}
