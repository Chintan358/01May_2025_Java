package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.BlogcategoryDto;
import com.example.demo.exception.APIResponse;
import com.example.demo.service.BlogCategoryService;

@RestController
@RequestMapping("/blogcategories")
public class BlogCatController {

    @Autowired
    BlogCategoryService service;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping
    public ResponseEntity<BlogcategoryDto> addBlogCategory(@RequestBody BlogcategoryDto dto) {
        BlogcategoryDto createdDto = service.addBlgCategory(dto);
        return new ResponseEntity<>(createdDto, HttpStatus.CREATED);
    }

    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    @GetMapping
    public ResponseEntity<List<BlogcategoryDto>> allBlogcategory() {
        List<BlogcategoryDto> allDtos = service.allBlogcategory();
        return new ResponseEntity<>(allDtos, HttpStatus.OK);
    }

    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    @GetMapping("/{id}")
    public ResponseEntity<BlogcategoryDto> blogCatById(@PathVariable("id") int id) {
        BlogcategoryDto dto = service.blogcategoryById(id);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/{id}")
    public ResponseEntity<BlogcategoryDto> update(@RequestBody BlogcategoryDto dto, @PathVariable("id") int id) {
        BlogcategoryDto updatedDto = service.update(dto, id);
        return new ResponseEntity<>(updatedDto, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/{id}")
    public ResponseEntity<APIResponse> deleteBlogCategory(@PathVariable("id") int id) {
        service.delete(id);

        APIResponse api = new APIResponse();
        api.setMessage("BlogCategory Deleted");
        api.setSuccess("success");

        return new ResponseEntity<>(api, HttpStatus.OK);
    }
}
