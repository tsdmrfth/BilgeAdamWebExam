/**
 * 
 */
package com.bilgeadam.webexam.model.dao.impl;

import org.springframework.stereotype.Repository;

import com.bilgeadam.webexam.model.dao.HibernateDAO;
import com.bilgeadam.webexam.model.dao.ProductCategoryDAO;
import com.bilgeadam.webexam.model.entity.impl.ProductCategory;

/**
 * @author Fatih Taşdemir Oct 29, 2017
 */

@Repository
public class ProductCategoryDAOImpl extends HibernateDAO<ProductCategory> implements ProductCategoryDAO{

}
