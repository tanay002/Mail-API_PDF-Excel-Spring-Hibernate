package MVCFlow_Layer_Service;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UserDto")

public class UserDto {
		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
		private int uid;
		private String fname;
		private String lname;
		private String add;
		
		private String uname;
		private String email;
		private String pass;
		private String cpass;
		
		
		public UserDto() { }


		public UserDto(int uid, String fname, String lname, String add, String uname, String email, String pass,
				String cpass) {
			super();
			this.uid = uid;
			this.fname = fname;
			this.lname = lname;
			this.add = add;
			this.uname = uname;
			this.email = email;
			this.pass = pass;
			this.cpass = cpass;
		}


		public int getUid() {
			return uid;
		}


		public void setUid(int uid) {
			this.uid = uid;
		}


		public String getFname() {
			return fname;
		}


		public void setFname(String fname) {
			this.fname = fname;
		}


		public String getLname() {
			return lname;
		}


		public void setLname(String lname) {
			this.lname = lname;
		}


		public String getAdd() {
			return add;
		}


		public void setAdd(String add) {
			this.add = add;
		}


		public String getUname() {
			return uname;
		}


		public void setUname(String uname) {
			this.uname = uname;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getPass() {
			return pass;
		}


		public void setPass(String pass) {
			this.pass = pass;
		}


		public String getCpass() {
			return cpass;
		}


		public void setCpass(String cpass) {
			this.cpass = cpass;
		}


		@Override
		public String toString() {
			return "UserDto [uid=" + uid + ", fname=" + fname + ", lname=" + lname + ", add=" + add + ", uname=" + uname
					+ ", email=" + email + ", pass=" + pass + ", cpass=" + cpass + "]";
		}
}

		
		
		
		
		
		
		
		
		
		
		
		