package com.lti.myPack.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lti.myPack.model.Sales;

@Repository
public interface SalesRepository extends JpaRepository<Sales, Integer> 
{
//	public List<Sales> findByCategory(String category);
//	
//	@Query("fROM Sales")
//	public List<Sales> getList();


}
