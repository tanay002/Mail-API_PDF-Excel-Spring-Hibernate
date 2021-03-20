package HasARelationship.Setter;
//One-TO-One Mapping
public class AddressDto {

	private int addId;
	private String city;
	
	
	
	public int getAddId() {
		return addId;
	}
	public void setAddId(int addId) {
		this.addId = addId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "AddressDto [addId=" + addId + ", city=" + city + "]";
	}
	
}
