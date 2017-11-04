package com.bilgeadam.webexam.model.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bilgeadam.webexam.model.dao.CustomerDAO;
import com.bilgeadam.webexam.model.entity.impl.Customer;
import com.bilgeadam.webexam.model.service.AbstractService;
import com.bilgeadam.webexam.model.service.CustomerService;

/**
 * @author Fatih Taşdemir Oct 29, 2017
 */

@Service
public class CustomerServiceImpl extends AbstractService<Customer> implements CustomerService {

	@Autowired
	public CustomerServiceImpl(CustomerDAO customerDAO) {
		super(customerDAO);
	}

}
