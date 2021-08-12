package com.lti.myPackage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.myPackage.model.Claim;
import com.lti.myPackage.model.Sales;

@Repository
public interface ClaimRepository  extends JpaRepository<Claim, Integer> 
{

	

}
