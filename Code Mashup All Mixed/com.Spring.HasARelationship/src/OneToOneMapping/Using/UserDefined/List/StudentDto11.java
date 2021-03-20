package OneToOneMapping.Using.UserDefined.List;

import java.util.List;

public class StudentDto11 {
	
	private int sid;
	private String sname;
	private List<AddressDto11> ad;
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
	public List<AddressDto11> getAd() {
		return ad;
	}
	public void setAd(List<AddressDto11> ad) {
		this.ad = ad;
	}
	@Override
	public String toString() {
		return "StudentDto11 [sid=" + sid + ", sname=" + sname + ", ad=" + ad + "]";
	}
	
	

}
