package com.lti.myPack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.myPack.model.Bidder;



public interface BidderRepository extends JpaRepository<Bidder, Integer> {

}
