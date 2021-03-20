package OneToOneUserDefined.Map;

import java.util.Map;

public class MarksDto {
	private int Maths;
	private Map<AddressDto14,StudentDto14> ad;
	public int getMaths() {
		return Maths;
	}
	public void setMaths(int maths) {
		Maths = maths;
	}
	public Map<AddressDto14, StudentDto14> getAd() {
		return ad;
	}
	public void setAd(Map<AddressDto14, StudentDto14> ad) {
		this.ad = ad;
	}
	@Override
	public String toString() {
		return "MarksDto [Maths=" + Maths + ", ad=" + ad + "]";
	}
	

}
