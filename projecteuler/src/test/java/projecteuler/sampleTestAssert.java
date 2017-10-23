package projecteuler;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Ignore;
import org.junit.Test;

public class sampleTestAssert {

	@Test
	public void myFirstTest() {
		assertEquals(2, 1 + 1);
	}

	@Test(expected = RuntimeException.class)
	public void testRuntimeException() {
		throw new RuntimeException();
	}

	@Test(timeout = 100)
	public void testSort_Performance() {
		int array[] = {11,23,4};
		for (int i=1; i<=1000000; i++){
			array[0]=i;
			Arrays.sort(array);
		}
			
	}
}
