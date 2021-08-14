package com.lti.product.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.product.model.AddProduct;


@Repository
public interface ProductRepository extends JpaRepository <AddProduct,Integer>
{
		
}
