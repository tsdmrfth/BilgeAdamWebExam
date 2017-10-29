package com.bilgeadam.webexam.model.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bilgeadam.webexam.model.dao.ShoppingCartItemDAO;
import com.bilgeadam.webexam.model.entity.impl.ShoppingCartItem;
import com.bilgeadam.webexam.model.service.AbstractService;
import com.bilgeadam.webexam.model.service.ShoppingCartItemService;

/**
 * @author Fatih Taşdemir Oct 29, 2017
 */

@Service
public class ShoppingCartItemServiceImpl extends AbstractService<ShoppingCartItem> implements ShoppingCartItemService {

	@Autowired
	public ShoppingCartItemServiceImpl(ShoppingCartItemDAO shoppingCartItemDAO) {
		super(shoppingCartItemDAO);
	}

}
