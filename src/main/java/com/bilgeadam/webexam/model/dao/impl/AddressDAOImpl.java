package com.bilgeadam.webexam.model.dao.impl;

import org.springframework.stereotype.Repository;

import com.bilgeadam.webexam.model.dao.AddressDAO;
import com.bilgeadam.webexam.model.dao.HibernateDAO;
import com.bilgeadam.webexam.model.entity.impl.Address;

/**
 * @author Fatih Taşdemir Oct 28, 2017
 */

@Repository
public class AddressDAOImpl extends HibernateDAO<Address> implements AddressDAO{

}
