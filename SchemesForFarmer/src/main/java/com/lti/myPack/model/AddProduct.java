package com.lti.myPack.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="ProductsData")
public class AddProduct {

	@Id
	private int product_id;
	private String crop_name;
	private String crop_type;
	private int quantity;
	private String fertilizer_type;
	
	private int ph_level;
	
	
	public int getPh_level() {
		return ph_level;
	}
	public void setPh_level(int ph_level) {
		this.ph_level = ph_level;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getCrop_name() {
		return crop_name;
	}
	public void setCrop_name(String crop_name) {
		this.crop_name = crop_name;
	}
	public String getCrop_type() {
		return crop_type;
	}
	public void setCrop_type(String crop_type) {
		this.crop_type = crop_type;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getFertilizer_type() {
		return fertilizer_type;
	}
	public void setFertilizer_type(String fertilizer_type) {
		this.fertilizer_type = fertilizer_type;
	}
	
	public AddProduct() {
		super();
		// TODO Auto-generated nstructor stub
	}
	
	
	

}
