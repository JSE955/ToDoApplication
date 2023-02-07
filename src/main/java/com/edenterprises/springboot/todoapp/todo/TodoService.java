package com.edenterprises.springboot.todoapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList<>();
	static {
		todos.add(new Todo(1, "Jordan", "Learn AWS", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(2, "Jordan", "Learn DevOps", LocalDate.now().plusYears(2), false));
		todos.add(new Todo(3, "Izzy", "Learn Full Stack Development", LocalDate.now().plusYears(1), false));
	}
	
	public List<Todo> findByUser(String username) {
		return todos;
	}
}
