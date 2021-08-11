package com.lti.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.product.model.Bidder;

public interface BidderRepository extends JpaRepository<Bidder, Integer> {

}
