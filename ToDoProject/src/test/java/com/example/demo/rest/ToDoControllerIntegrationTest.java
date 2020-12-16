package com.example.demo.rest;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.persistence.domain.ToDo;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
//sql runs in order so put schema first
@Sql(scripts = {"classpath:toDo-schema.sql", "classpath: toDo-data.sql"}, executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
@ActiveProfiles("dev")
public class ToDoControllerIntegrationTest {
	
	@Autowired
	private MockMvc mvc;
	
	@Autowired
	private ObjectMapper jsonifier;
	
	@Autowired
	private ModelMapper mapper;
	
	private final ToDo TEST_TODO_1 = new ToDo(1L, "London");
	private final ToDo TEST_TODO_2 = new ToDo(1L, "Tokyo");
	
	private final List<ToDo> ListOfToDos = List.of(TEST_TODO_1,TEST_TODO_2);

}
