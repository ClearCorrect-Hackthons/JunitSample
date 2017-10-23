package com.TODO;

import java.util.List;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TodoBusinessImpleStubTest {

	@Test
	public void testRetrieveTodosRelatedtoSpring_usingStub() {
		TodoService todoservice = new TODOServiceStub();
		TODOServiceImpl todoserviceImpl = new TODOServiceImpl(todoservice);
		List<String> fileterTodos = todoserviceImpl.retrieveTodosRelatedToSpring("spring");
		assertEquals(1, fileterTodos.size());
	}
	
	@Test
	public void testRetrieveNullTodosRelatedtoSpring_usingStub() {
		TodoService todoservice = new TODOServiceStub();
		TODOServiceImpl todoserviceImpl = new TODOServiceImpl(todoservice);
		List<String> fileterTodos = todoserviceImpl.retrieveTodosRelatedToSpring("test");
		assertEquals(1, fileterTodos.size());
	}
}
