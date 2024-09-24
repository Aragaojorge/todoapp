package com.devjola.springboot.todoapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

	private static List<Todo> todos = new ArrayList<>();
	
	static {
		todos.add(new Todo(1, "devjola", "Learn AWS", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(2, "devjola", "Learn DevOps", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(3, "devjola", "Learn Full Stack Dev", LocalDate.now().plusYears(1), false));
	}
	
	public List<Todo> findByUsername(String username) {
		
		return todos;
		
	}
	
}
