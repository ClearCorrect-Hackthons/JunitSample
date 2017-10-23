package projecteuler;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem1Test {

  @Test
  public void testSimpleRange() {
    assertEquals(23, Problem1.sumMultiples(1, 10, new int[] {3, 5}));
  }

  @Test
  public void testMultipleMultiples() {
    assertEquals(15, Problem1.sumMultiples(1, 7, new int[] {2, 3}));
  }

  @Test
  public void testAnswer() {
    assertEquals(233168, Problem1.sumMultiples(1, 1000, new int[] {3, 5}));
  }
  
  @Test
  public void testbiggerNumber()
  {
	  assertEquals(1404932684,Problem1.sumMultiples(1,1000000 ,new int[] {3,5}));
  }

}
