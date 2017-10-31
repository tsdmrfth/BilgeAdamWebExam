package com.bilgeadam.webexam.model.dao.impl;

import org.springframework.stereotype.Repository;

import com.bilgeadam.webexam.model.dao.CustomerDAO;
import com.bilgeadam.webexam.model.dao.HibernateDAO;
import com.bilgeadam.webexam.model.entity.impl.Customer;

/***
 * @author Fatih Taşdemir Oct 28, 2017
 */

@Repository
public class CustomerDAOImpl extends HibernateDAO<Customer> implements CustomerDAO {

}
