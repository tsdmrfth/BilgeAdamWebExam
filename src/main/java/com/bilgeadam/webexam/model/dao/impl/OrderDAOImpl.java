/**
 * 
 */
package com.bilgeadam.webexam.model.dao.impl;

import org.springframework.stereotype.Repository;

import com.bilgeadam.webexam.model.dao.HibernateDAO;
import com.bilgeadam.webexam.model.dao.OrderDAO;
import com.bilgeadam.webexam.model.entity.impl.Order;

/*
 * @author Fatih Taşdemir
 * Oct 29, 2017
 */

@Repository
public class OrderDAOImpl extends HibernateDAO<Order> implements OrderDAO{

}
