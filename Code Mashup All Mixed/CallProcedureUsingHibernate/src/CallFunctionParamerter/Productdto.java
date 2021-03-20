 package CallFunctionParamerter;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.GeneratedValue;

@Entity    



@NamedNativeQueries({@NamedNativeQuery(name="Query_Ka_naam_kuch_b", query="CALL Prodemo1()",
resultClass = Productdto.class)})

public class Productdto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int productId;
	private String proName;
	private double price;
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ProductDto [productId=" + productId + ", proName=" + proName + ", price=" + price + "]";
	}


}
