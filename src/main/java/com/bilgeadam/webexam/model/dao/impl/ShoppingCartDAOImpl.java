/**
 * 
 */
package com.bilgeadam.webexam.model.dao.impl;

import org.springframework.stereotype.Repository;

import com.bilgeadam.webexam.model.dao.HibernateDAO;
import com.bilgeadam.webexam.model.dao.ShoppingCartDAO;
import com.bilgeadam.webexam.model.entity.impl.ShoppingCart;

/**
 * @author Fatih Taşdemir Oct 29, 2017
 */

@Repository
public class ShoppingCartDAOImpl extends HibernateDAO<ShoppingCart> implements ShoppingCartDAO {

}
