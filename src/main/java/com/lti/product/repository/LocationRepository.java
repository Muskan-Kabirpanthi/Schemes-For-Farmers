package com.lti.product.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.product.model.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
