package com.TODO;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TodoBusinessImpleMockTest {

	@Rule
	public MockitoRule mockitoRule=MockitoJUnit.rule();
	
	
	@Mock
	TodoService todoserviceMock;

	@InjectMocks
	TODOServiceImpl todoserviceImpl;

	List<String> todoList = Arrays.asList("Learn spring", "Learn mvc", "Learn to dance");

	@Test
	public void testRetrieveTodosRelatedtoSpring_usingMock() {
		// TodoService todoserviceMock = mock(TodoService.class);

		when(todoserviceMock.retrieveTodos("something")).thenReturn(todoList);

		// TODOServiceImpl todoserviceImpl = new
		// TODOServiceImpl(todoserviceMock);
		List<String> fileterTodos = todoserviceImpl.retrieveTodosRelatedToSpring("something");
		assertEquals(1, fileterTodos.size());
	}

	@Test
	public void testRetrieveTodosRelatedtoSpring_usingEmptylistMock() {
		// TodoService todoserviceMock = mock(TodoService.class);
		List<String> todoList = Arrays.asList();

		when(todoserviceMock.retrieveTodos("spring")).thenReturn(todoList);

		// TODOServiceImpl todoserviceImpl = new
		// TODOServiceImpl(todoserviceMock);
		List<String> fileterTodos = todoserviceImpl.retrieveTodosRelatedToSpring("spring");
		assertEquals(0, fileterTodos.size());
	}

	@Test
	public void testRetrieveTodosRelatedtoSpring_usingEmptylistMockBDD() {
		// TodoService todoserviceMock = mock(TodoService.class);
		// List<String> todoList = Arrays.asList();

		given(todoserviceMock.retrieveTodos("spring")).willReturn(todoList);

		// TODOServiceImpl todoserviceImpl = new
		// TODOServiceImpl(todoserviceMock);
		todoserviceImpl.ddeleteTodoRelatedToSpring("spring");
		verify(todoserviceMock).deleteTodo("Learn to dance");
		verify(todoserviceMock, times(1)).deleteTodo("Learn to dance");
		verify(todoserviceMock, never()).deleteTodo("Learn spring");

		// List<String> fileterTodos =
		// todoserviceImpl.retrieveTodosRelatedToSpring("spring");
		// assertEquals(1, fileterTodos.size());
		// assertThat(fileterTodos.size(),is(2));
	}
}
