package com.lti.myPack.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.myPack.model.Location;



public interface LocationRepository extends JpaRepository<Location, Integer> {

}
