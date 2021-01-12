package com.nidal.productscategories.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nidal.productscategories.models.Product;
import com.nidal.productscategories.models.Category;
import com.nidal.productscategories.models.ProductCategory;
import com.nidal.productscategories.repositories.CategoryRepository;
import com.nidal.productscategories.repositories.ProductCategoryRepository;

@Service
public class CategoryService {
	private final CategoryRepository categoryRepository;
	private final ProductCategoryRepository productCategoryRepository;
	
	public CategoryService(CategoryRepository categoryRepository,ProductCategoryRepository productCategoryRepository) {
		this.categoryRepository = categoryRepository;
		this.productCategoryRepository = productCategoryRepository;
	}

	public void setCategory(Category category) {
		
	}
	public void addCategory(Category category) {
		categoryRepository.save(category);
	}
	
	public List<Category> getCategoriesAll() {
		return categoryRepository.findAll();
	}
	
    public List<Category> categoriesForProduct(Product product) {
        return categoryRepository.findByProductsNotContains(product);  
    }   
	public void addProductToCategory(ProductCategory productCategory) {
		productCategoryRepository.save(productCategory);
	}
    
	public Category viewCategory(Long id) {
		Optional<Category> category = categoryRepository.findById(id);
		if(category.isPresent()) {
			return category.get();
		}
		else {
			return null;
		}
	}
}
