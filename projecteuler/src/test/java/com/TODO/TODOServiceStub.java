package com.TODO;

import java.util.Arrays;
import java.util.List;

public class TODOServiceStub implements TodoService {

	public List<String>retrieveTodos(String user)
	{
		return Arrays.asList("Learn spring","Learn mvc","Learn to dance");
	}

	@Override
	public void deleteTodo(String todo) {
		// TODO Auto-generated method stub
		
	}
}
