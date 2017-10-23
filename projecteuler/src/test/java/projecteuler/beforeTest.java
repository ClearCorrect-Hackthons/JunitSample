package projecteuler;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class beforeTest {
	List empty;

	@Before
	public void initialize() {
		empty = new ArrayList();
	}

	@Test
	public void testEmptyArray() {
		assertEquals(0, empty.size());
		assertTrue(empty.isEmpty());

	}

	@Test
	public void testRemove() {
		empty.add("1");
		empty.remove("1");
		assertEquals(0, empty.size());
	}

	@Test
	public void OneItemCollection() {
		empty.add("oneItem");
		assertEquals(1, empty.size());
	}

}
