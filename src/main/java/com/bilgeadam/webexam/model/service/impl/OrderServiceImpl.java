package com.bilgeadam.webexam.model.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bilgeadam.webexam.model.dao.OrderDAO;
import com.bilgeadam.webexam.model.entity.impl.Order;
import com.bilgeadam.webexam.model.service.AbstractService;
import com.bilgeadam.webexam.model.service.OrderService;

/**
 * @author Fatih Taşdemir Oct 29, 2017
 */

@Service
public class OrderServiceImpl extends AbstractService<Order> implements OrderService {
	
	@Autowired
	public OrderServiceImpl(OrderDAO orderDAO) {
		super(orderDAO);
	}

}
