package projecteuler;

import static org.junit.Assert.*;

import org.junit.Test;

public class sampleTestAssertMethods {

	StringHelper helper = new StringHelper();

	@Test
	public void testfirstAndLastTwoCharacterTheSame_assertEquals() {
		boolean actualValue = helper.areFirstAndLastTwoCharactersTheSame("ABCD");
		assertEquals(false, actualValue);
	}

	@Test
	public void testfirstAndLastTwoCharacterTheSame_BasicTest_assertFalse() {
		boolean actualValue = helper.areFirstAndLastTwoCharactersTheSame("ABCD");
		assertFalse(actualValue);
	}
}
