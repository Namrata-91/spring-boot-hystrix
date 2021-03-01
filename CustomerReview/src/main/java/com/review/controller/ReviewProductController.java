package com.review.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.review.model.Shopping;
import com.review.repository.ReviewRepository;

@RestController
@RequestMapping("/productReview")
public class ReviewProductController {
	
	@Autowired
	private ReviewRepository reviewRepository;
	
	  @GetMapping 
	  public ModelAndView review()   {  
		  List<Shopping> review=reviewRepository.findAll();
	      return new ModelAndView("Productlist", "shopping", review);
	  }  
}
