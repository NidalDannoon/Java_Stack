package com.nidal.productscategories.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nidal.productscategories.models.ProductCategory;

@Repository
public interface ProductCategoryRepository extends CrudRepository <ProductCategory, Long> {
	
}