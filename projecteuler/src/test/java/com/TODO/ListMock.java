package com.TODO;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

public class ListMock {

	//@SuppressWarnings("deprecation")
	@Test
	public void mockListsize() {
		List mockList = mock(List.class);
		when(mockList.size()).thenReturn(2);
		assertEquals(2, mockList.size());
	}

	@Test
	public void mockListsizeBDD() {
		List mockList = mock(List.class);
		given(mockList.size()).willReturn(2);
		int size = (int) mockList.size();
		assertThat(size, is(2));

	}

	@Test
	public void letsMockListWithMultipleSizewithMultipleReturnValues() {
		List<Object> mockList = mock(List.class);
		when(mockList.size()).thenReturn(2).thenReturn(3);
		assertEquals(2, mockList.size());
		assertEquals(3, mockList.size());
	}
	@Test
	public void letsMockListWithMultipleSizewithMultipleReturnValuesBDD() {
		List<Object> mockList = mock(List.class);
		given(mockList.size()).willReturn(2).willReturn(3);
		int firstVal=mockList.size();
		int secondVal=mockList.size();
		assertThat(firstVal,is(2));
		assertThat(secondVal,is(3));
	}

	@Test
	public void mockListGet() {
		List mockList = mock(List.class);
		when(mockList.get(0)).thenReturn("I am Raji");
		assertEquals("I am Raji", mockList.get(0));
		assertEquals(null, mockList.get(1));
	}

	//anyInt (argument matcher) 
	@Test
	public void mockListGetwithAny() {
		List mockList = mock(List.class);
		when(mockList.get(Mockito.anyInt())).thenReturn("Raji");
		assertEquals("Raji", mockList.get(1000));
		assertEquals("Raji", mockList.get(88));
	}

	@Test(expected = IOException.class)
	public void mockListGetwithAnyThrowException() {
		List mockList = mock(List.class);
		when(mockList.get(Mockito.anyInt())).thenThrow(new NullPointerException("this is a new exception"));
		mockList.get(0);
	}
}
