package SetUsingPredefined;

import java.util.Set;

public class StudentDto12 {

	private int sid;
	private String sname;
	private Set<String> languages;
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
	public Set<String> getLanguages() {
		return languages;
	}
	public void setLanguages(Set<String> languages) {
		languages = languages;
	}
	@Override
	public String toString() {
		return "StudentDto12 [sid=" + sid + ", sname=" + sname + ", Languages=" + languages + "]";
	}
	
	
}
