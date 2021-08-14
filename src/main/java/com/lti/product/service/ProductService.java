package com.lti.product.service;


import java.util.List;

import com.lti.product.model.AddProduct;

import com.lti.product.model.Bidder;
import com.lti.product.model.Bidding;


public interface ProductService {
	public List<AddProduct> getProducts();
	
	public boolean addingProduct(AddProduct addproduct);
	
	public List<Bidder> getBidders();
	
	public boolean addingBidders(Bidder bidders);

	//public String updateProduct(AddProduct product);

	boolean addingBidder(Bidding bidding);

	public List<Bidding> getBidding();

	
	
	
}
