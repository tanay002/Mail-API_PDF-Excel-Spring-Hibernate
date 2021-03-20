package MapUsingPredefined;

import java.util.Map;

public class StudentDto13 {
private int sid;
private String sname;
private Map< Integer ,String> languages;


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
public Map<Integer, String> getLanguages() {
	return languages;
}
public void setLanguages(Map<Integer, String> languages) {
	this.languages = languages;
}

}
