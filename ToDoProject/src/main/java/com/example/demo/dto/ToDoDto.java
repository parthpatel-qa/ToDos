package com.example.demo.dto;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ToDoDto {

	private Long id;
	private String name;
	
	private List<UserDto> users;
}
