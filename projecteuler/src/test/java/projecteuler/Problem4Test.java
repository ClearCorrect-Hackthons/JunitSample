package projecteuler;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem4Test {
	@Test
	public void isPolindrome() {
		assertEquals(true, Problem4.isPalindrome(99));
	}

	@Test
	public void notaPlodrome() {
		assertEquals(false, Problem4.isPalindrome(3777));
	}
	
	@Test
	public void findLargetPolindrome()
	{
		assertEquals(906609,Problem4.findLargestPolindrome());
	}
}
