/**
 * 
 */
package com.bilgeadam.webexam.model.dao.impl;

import org.springframework.stereotype.Repository;

import com.bilgeadam.webexam.model.dao.HibernateDAO;
import com.bilgeadam.webexam.model.dao.ProductDAO;
import com.bilgeadam.webexam.model.entity.impl.Product;

/**
 * @author Fatih Taşdemir Oct 29, 2017
 */

@Repository
public class ProductDAOImpl extends HibernateDAO<Product> implements ProductDAO {

}
