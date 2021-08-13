package com.lti.product.model;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="ProductsData")
public class AddProduct {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
	private int product_id;
	private int farmer_id;
	private String crop_name;
	private String crop_type;
	private int quantity;
	private int base_price;
	private int bidder_amount;
	private int bidder_id;
	public AddProduct() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AddProduct(int product_id, int farmer_id, String crop_name, String crop_type, int quantity, int base_price,
			int bidder_amount, int bidder_id) {
		super();
		this.product_id = product_id;
		this.farmer_id = farmer_id;
		this.crop_name = crop_name;
		this.crop_type = crop_type;
		this.quantity = quantity;
		this.base_price = base_price;
		this.bidder_amount = bidder_amount;
		this.bidder_id = bidder_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getFarmer_id() {
		return farmer_id;
	}
	public void setFarmer_id(int farmer_id) {
		this.farmer_id = farmer_id;
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
	public int getBase_price() {
		return base_price;
	}
	public void setBase_price(int base_price) {
		this.base_price = base_price;
	}
	public int getBidder_amount() {
		return bidder_amount;
	}
	public void setBidder_amount(int bidder_amount) {
		this.bidder_amount = bidder_amount;
	}
	public int getBidder_id() {
		return bidder_id;
	}
	public void setBidder_id(int bidder_id) {
		this.bidder_id = bidder_id;
	}
	
}
