package Annotation2Cache;

import javax.annotation.Generated;
import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy; 

@Entity  
@Cacheable  
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)  

public class Product1 {
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
		return "Product1 [productId=" + productId + ", proName=" + proName + ", price=" + price + "]";
	}
	
	
	
}
