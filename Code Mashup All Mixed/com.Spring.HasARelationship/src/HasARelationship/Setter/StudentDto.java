package HasARelationship.Setter;



//One-TO-One Mapping
public class StudentDto {

	private int sid;
	private String sname;
	private String sadd;
	private AddressDto ad;
	
	
	public AddressDto getAd() {
		return ad;
	}
	public void setAd(AddressDto ad) {
		this.ad = ad;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSadd() {
		return sadd;
	}
	public void setSadd(String sadd) {
		this.sadd = sadd;
	}
	@Override
	public String toString() {
		return "StudentDto [sid=" + sid + ", sname=" + sname + ", sadd=" + sadd + ", ad=" + ad + "]";
	}
	
	
	
}
