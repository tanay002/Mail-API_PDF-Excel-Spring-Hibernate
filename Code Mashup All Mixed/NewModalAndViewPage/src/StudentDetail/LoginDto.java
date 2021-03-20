package StudentDetail;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;

@Entity
public class LoginDto {

	//@Id
   // @GeneratedValue(strategy = GenerationType.AUTO)

	private int id;
	@Id	
	private String email;
	@Column(name = "password", unique = true, nullable = false)
	
private String password;

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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



	
	public LoginDto() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "LoginDto [id=" + id + ", email=" + email + ", password=" + password + "]";
	}


	public LoginDto(int id, String email, String password) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
	}

	
	
}
