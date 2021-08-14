package com.lti.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.product.model.Bidding;
@Repository
public interface BiddingRepository extends JpaRepository<Bidding, Integer> {

}
