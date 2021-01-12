package com.nidal.productscategories.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nidal.productscategories.models.Category;
import com.nidal.productscategories.models.Product;
import com.nidal.productscategories.models.ProductCategory;
import com.nidal.productscategories.repositories.ProductRepository;
import com.nidal.productscategories.repositories.ProductCategoryRepository;

@Service
public class ProductService {
	private final ProductRepository productRepository;
	private final ProductCategoryRepository productCategoryRepository;
	
	public ProductService(ProductRepository productRepository,ProductCategoryRepository productCategoryRepository) {
		this.productRepository = productRepository;
		this.productCategoryRepository = productCategoryRepository;
	}
	public void addProduct(Product product) {
		productRepository.save(product);
	}
	
	public void addCategoryToProduct(ProductCategory productCategory) {
		productCategoryRepository.save(productCategory);
	}
	public Iterable<Product> productsForCategory(Category category) {
		return productRepository.findByCategoriesNotContains(category);
	}
	
	public Product viewProduct(Long id) {
		Optional<Product> product = productRepository.findById(id);
		if(product.isPresent()) {
			return product.get();
		}
		else {
			return null;
		}
	}
}
