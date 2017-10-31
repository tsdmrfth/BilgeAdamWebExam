/**
 * 
 */
package com.bilgeadam.webexam.model.dao.impl;

import org.springframework.stereotype.Repository;

import com.bilgeadam.webexam.model.dao.HibernateDAO;
import com.bilgeadam.webexam.model.dao.ProductDetailDAO;
import com.bilgeadam.webexam.model.entity.impl.ProductDetail;

/**
 * @author Fatih Taşdemir
 *
 *         Oct 29, 2017
 */

@Repository
public class ProductDetailDAOImpl extends HibernateDAO<ProductDetail> implements ProductDetailDAO {

}
