package OneToOneMapping;


//list using preDefined datatype
import java.util.List;

public class StudentDto1 {
 private int sid;
 private String sname;
 private List<String> language;
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
public List<String> getLanguage() {
	return language;
}
public void setLanguage(List<String> language) {
	this.language = language;
}
@Override
public String toString() {
	return "StudentDto1 [sid=" + sid + ", sname=" + sname + ", language=" + language + "]";
}
 
 
 
}
