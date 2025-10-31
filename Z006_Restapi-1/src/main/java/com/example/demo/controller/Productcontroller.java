package com.example.demo.controller;
import com.example.demo.repo.ProductRepo;
import com.example.demo.service.CategoryService;
import com.example.demo.service.ProductService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ProductDto;
import com.example.demo.model.Category;
import com.example.demo.model.Product;

@RestController
public class Productcontroller {

	@Autowired
	ProductService productService;

	@Autowired
	CategoryService categoryService;
   
	
	@PostMapping("/products")
	public ResponseEntity<ProductDto> addProduct(@RequestBody Product p,@RequestParam("cat") int catid)
	{
			Category c  =categoryService.catByid(catid);
			p.setCategory(c);
			Product createdProduct =  productService.addProduct(p);
			
			ProductDto dto = productToDto(createdProduct);
			return new ResponseEntity<>(dto,HttpStatus.CREATED);
	}
	
	@GetMapping("/products")
	public ResponseEntity<List<ProductDto>> viewProducts()
	{
		List<Product> allproducts = productService.viewProducts();
		
		List<ProductDto> dtos = new ArrayList<>();
		for(Product p : allproducts)
		{
			dtos.add(productToDto(p));
		}
		
		return new ResponseEntity<>(dtos,HttpStatus.OK);
	}
	
	
	public ProductDto productToDto(Product p)
	{
		ProductDto dto = new ProductDto();
		dto.setId(p.getId());
		dto.setName(p.getName());
		dto.setPrice(p.getPrice());
		dto.setQty(p.getQty());
		dto.setDto(CategoryController.categoryToDto(p.getCategory()));
		
		return dto;
	}
	
}
