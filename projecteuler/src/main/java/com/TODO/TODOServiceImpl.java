package com.TODO;

import java.util.ArrayList;
import java.util.List;

public class TODOServiceImpl {
	private TodoService todoService;

	public TODOServiceImpl(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	public List<String> retrieveTodosRelatedToSpring(String user) {
		List<String> filterTodos = new ArrayList<String>();
		List<String> allTodos = todoService.retrieveTodos(user);
		for (String todo : allTodos) {
			if (todo.contains("spring")) {
				filterTodos.add(todo);
			}
		}
		return filterTodos;
	}

	public void ddeleteTodoRelatedToSpring(String user) {
		List<String> allTodos = todoService.retrieveTodos(user);

		for (String todo : allTodos) {
			if (!todo.contains("spring")) {
				todoService.deleteTodo(todo);
			}

		}
	}

}
