 package callParameterProcedure;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;


import javax.persistence.GeneratedValue;

@Entity    

@NamedStoredProcedureQuery(name = "call", procedureName = "productdto2")


public class Productdto1 {
	
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
