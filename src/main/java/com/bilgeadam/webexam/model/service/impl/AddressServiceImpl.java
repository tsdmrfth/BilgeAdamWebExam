package com.bilgeadam.webexam.model.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bilgeadam.webexam.model.dao.AddressDAO;
import com.bilgeadam.webexam.model.entity.impl.Address;
import com.bilgeadam.webexam.model.service.AbstractService;
import com.bilgeadam.webexam.model.service.AddressService;

/**
 * @author Fatih Taşdemir Oct 29, 2017
 */

@Service
public class AddressServiceImpl extends AbstractService<Address> implements AddressService {

	@Autowired
	public AddressServiceImpl(AddressDAO addressDAO) {
		super(addressDAO);
	}

}
