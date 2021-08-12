package com.lti.myPack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.myPack.model.Land;



@Repository
public interface LandRepo extends JpaRepository<Land, Integer>{

}
