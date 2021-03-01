package com.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.customer.model.Customer;
import com.customer.repository.customerRepository;

@Controller
public class CustomerController {

	@Autowired
	private customerRepository customerRepository;
	 @GetMapping("/customerdata")  
	  public ModelAndView checkoutForm()  {  
		 List<Customer> cus = customerRepository.findAll();
		 return new ModelAndView("customerdata", "data", cus);
	  }  
}	
