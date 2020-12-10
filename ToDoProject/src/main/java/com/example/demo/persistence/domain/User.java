package com.example.demo.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String name;
	
	@NotNull
	@Min(1)
	@Max(120)
	private int age;
	
	@NotNull
	private String tasks;

	public User(Long id, String name, @Min(1) @Max(120) int age, String tasks) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.tasks = tasks;
	}

	public User(String name, @Min(1) @Max(120) int age, String tasks) {
		super();
		this.name = name;
		this.age = age;
		this.tasks = tasks;
	}
	
	
	
}
