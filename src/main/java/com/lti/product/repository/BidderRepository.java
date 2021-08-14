package com.lti.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.product.model.Bidder;

@Repository
public interface BidderRepository extends JpaRepository<Bidder, Integer> {

}