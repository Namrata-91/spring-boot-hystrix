package com.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customer.model.Customer;

public interface customerRepository  extends JpaRepository<Customer, Integer>{

}
