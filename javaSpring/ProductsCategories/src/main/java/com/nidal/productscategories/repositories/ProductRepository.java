package com.nidal.productscategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nidal.productscategories.models.Category;
import com.nidal.productscategories.models.Product;

@Repository
public interface ProductRepository extends CrudRepository <Product, Long> {
	List<Product> findAll();
	List<Product> findByCategoriesNotContains(Category category);
}
