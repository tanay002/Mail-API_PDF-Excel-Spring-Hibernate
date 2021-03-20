package DifferenceCheck;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity

public class CheckDto {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

		private int cid;
	     private String cname;
		public int getCid() {
			return cid;
		}
		public void setCid(int cid) {
			this.cid = cid;
		}
		public String getCname() {
			return cname;
		}
		public void setCname(String cname) {
			this.cname = cname;
		}
		@Override
		public String toString() {
			return "CheckDto [cid=" + cid + ", cname=" + cname + "]";
		}

	     
}
