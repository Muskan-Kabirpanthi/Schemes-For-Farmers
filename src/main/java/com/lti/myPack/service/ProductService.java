package com.lti.myPack.service;

import java.util.List;

import com.lti.myPack.model.AddProduct;
import com.lti.myPack.model.Bidder;

public interface ProductService {
	public List<AddProduct> getProducts();

	public boolean addingProduct(AddProduct addproduct);

	public List<Bidder> getBidders();

	public boolean addingBidders(Bidder bidders);

	public void updateProduct(AddProduct product);

}