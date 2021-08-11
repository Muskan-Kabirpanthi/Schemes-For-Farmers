package com.lti.product.service;


import java.util.List;

import com.lti.product.model.AddProduct;

public interface ProductService {
	public List<AddProduct> getProducts();
	public boolean addingProduct(AddProduct addproduct);
}
