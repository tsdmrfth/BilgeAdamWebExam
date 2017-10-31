package com.bilgeadam.webexam.model.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bilgeadam.webexam.model.dao.ShoppingCartDAO;
import com.bilgeadam.webexam.model.entity.impl.ShoppingCart;
import com.bilgeadam.webexam.model.service.AbstractService;
import com.bilgeadam.webexam.model.service.ShoppingCartService;

/**
 * @author Fatih Taşdemir Oct 29, 2017
 */

@Service
public class ShoppingCartServiceImpl extends AbstractService<ShoppingCart> implements ShoppingCartService {

	@Autowired
	public ShoppingCartServiceImpl(ShoppingCartDAO shoppingCartDAO) {
		super(shoppingCartDAO);
	}

}
