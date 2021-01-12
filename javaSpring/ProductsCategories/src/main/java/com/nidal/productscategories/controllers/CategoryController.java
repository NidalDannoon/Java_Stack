package com.nidal.productscategories.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.nidal.productscategories.models.Category;
import com.nidal.productscategories.models.ProductCategory;
import com.nidal.productscategories.services.CategoryService;
import com.nidal.productscategories.services.ProductService;

@Controller
public class CategoryController {
	private final CategoryService categoryService;
	private final ProductService productService;
	
	public CategoryController(CategoryService categoryService, ProductService productService) {
		this.categoryService = categoryService;
		this.productService = productService;
	}
	
	@GetMapping("/categories/new")
	public String newCatPage(@ModelAttribute("category") Category category) {
		return "newcategory.jsp";
	}
	
	@PostMapping("/add-category")
	public String addCategory(@Valid @ModelAttribute("category") Category category, BindingResult result) {
		if(result.hasErrors()) {
			return "newcategory.jsp";
		}
		else {
			categoryService.addCategory(category);
			return "redirect:/categories/new";
		}
	}
	@GetMapping("categories/{id}")
	public String showCategory(@PathVariable("id") Long id, @ModelAttribute("productCategory") ProductCategory productCategory, Model model) {
		Category category = categoryService.viewCategory(id);
		model.addAttribute("category", category);
		model.addAttribute("products", productService.productsForCategory(category));
		return "showcategory.jsp";
	}
	@PostMapping("/attach-product")
	public String attachProduct(@ModelAttribute("productCategory") ProductCategory productCategory) {
		System.out.println(productCategory.getCategory().getName());
		System.out.println(productCategory.getProduct().getName());
		categoryService.addProductToCategory(productCategory);
		return "redirect:/categories/" + productCategory.getCategory().getId();
	}
}
