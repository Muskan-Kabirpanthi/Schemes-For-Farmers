package com.lti.myPack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.myPack.model.Farmer;



@Repository
public interface FarmerRepo extends JpaRepository<Farmer, Integer>{

}
