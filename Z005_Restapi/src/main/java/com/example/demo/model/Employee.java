package com.example.demo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="employee")
public class Employee {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		
		@NotBlank(message ="Name is required")
		private String name;
		
		@NotBlank(message ="Email is required")
		@Pattern(regexp ="[a-zA-Z0-9_-]+@[a-zA-Z]+\\.[a-z]{2,4}" ,message = "Invalid email format")
		private String email;
		
		@Min(value=1,message = "Age is Required")
		private int age;
		
		@NotBlank(message ="Phone is required")
		@Pattern(regexp = "\\d{10}",message = "Invalid phone number")
		private String phone;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		
		
		
}
