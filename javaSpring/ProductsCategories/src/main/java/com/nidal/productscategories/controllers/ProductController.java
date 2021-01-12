package com.nidal.productscategories.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.nidal.productscategories.models.ProductCategory;
import com.nidal.productscategories.models.Product;
import com.nidal.productscategories.services.ProductService;
import com.nidal.productscategories.services.CategoryService;
import com.nidal.productscategories.services.ProductCategoryService;

@Controller
public class ProductController {
	private final ProductService productService;
	private final CategoryService categoryService;
	
	public ProductController(ProductService productService,CategoryService categoryService,ProductCategoryService productCategoryService) {
		this.productService = productService;
		this.categoryService = categoryService;
	}
	
	@GetMapping("/products/new")
	public String newProduct(@ModelAttribute("product") Product product) {
		return "newproduct.jsp";
	}
	
	@PostMapping("/add-product")
	public String addProduct(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if(result.hasErrors()) {
			return "newproduct.jsp";
		}
		else {
			productService.addProduct(product);
			return "redirect:/products/new";
		}
	}
	@GetMapping("products/{id}")
	public String showProduct(@PathVariable("id") Long id, @ModelAttribute("productCategory") ProductCategory productCategry, Model model) {
		Product product = productService.viewProduct(id);
		model.addAttribute("product", product);
		model.addAttribute("categories", categoryService.categoriesForProduct(product));
		return "showproduct.jsp";
	}
	@PostMapping("/attach-category")
	public String attachCategory(@ModelAttribute("productCategory") ProductCategory productCategory) {
		System.out.println(productCategory.getCategory().getName());
		System.out.println(productCategory.getProduct().getName());
		productService.addCategoryToProduct(productCategory);
		return "redirect:/products/" + productCategory.getProduct().getId();
	}
}
