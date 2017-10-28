/**
 * 
 */
package com.bilgeadam.webexam.model.dao.impl;

import org.springframework.stereotype.Repository;

import com.bilgeadam.webexam.model.dao.HibernateDAO;
import com.bilgeadam.webexam.model.dao.ShoppingCartItemDAO;
import com.bilgeadam.webexam.model.entity.impl.ShoppingCartItem;

/**
 * @author Fatih Taşdemir Oct 29, 2017
 */

@Repository
public class ShoppingCartItemDAOImpl extends HibernateDAO<ShoppingCartItem> implements ShoppingCartItemDAO {

}
