package com.spring.security.repository;

import com.spring.security.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	public Customer findByEmail(String email);

}
