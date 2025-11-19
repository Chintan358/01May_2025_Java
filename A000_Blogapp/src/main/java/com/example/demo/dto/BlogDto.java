package com.example.demo.dto;



import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class BlogDto {

  
    private int id;

   
    private String title;

    
    private String content;

   
    private String image;

   
    private BlogcategoryDto category;

   
    private UserDto user;

   
}
