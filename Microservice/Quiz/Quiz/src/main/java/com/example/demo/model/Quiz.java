package com.example.demo.model;

import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="quiz")
@Getter
@Setter
public class Quiz {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		int id;
		String title;
		transient List<Question> questions;
}
