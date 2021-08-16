package com.lti.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.product.model.MarketPlace;

public interface MarketReposotiry extends JpaRepository<MarketPlace, Integer> {

}
