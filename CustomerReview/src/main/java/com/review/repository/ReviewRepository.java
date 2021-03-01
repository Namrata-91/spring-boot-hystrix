package com.review.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.review.model.Shopping;
public interface ReviewRepository extends JpaRepository<Shopping, Integer>{

}
