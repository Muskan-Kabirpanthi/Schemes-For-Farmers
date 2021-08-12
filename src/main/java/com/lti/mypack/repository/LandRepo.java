package com.lti.mypack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.mypack.farmerreg.Land;

@Repository
public interface LandRepo extends JpaRepository<Land, Integer>{

}
