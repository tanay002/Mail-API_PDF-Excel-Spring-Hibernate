package StudentDetail;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StudrntRegistration")
public class StudentRegistrationDto {

	public StudentRegistrationDto() {
		}
	
	private String sname;
	private long mobile;
	@Id
	private String email;
	private String password;
	
	public StudentRegistrationDto( String sname, long mobile, String email, String password) {
		super();
		this.sname = sname;
		this.mobile = mobile;
		this.email = email;
		this.password = password;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

/*	@Override
	public String toString() {
		return "StudentRegistrationDto [id=" + id + ", sname=" + sname + ", mobile=" + mobile + ", email=" + email
				+ ", password=" + password + "]";
	}
	
*/	
	
	

}
