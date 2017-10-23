package projecteuler;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem1 {

  /**
   * Sum all of the numbers between a lower and upper (exclusive) integer that are multiples of
   * number contained in array.
   * 
   * @param lower starting number (inclusive)
   * @param upper ending number (exclusive)
   * @param multiples an array of numbers to test for multiples
   * 
   * @return the sum of all integers between lower bound and upper bound that are multiples of the
   *         numbers contained in the array
   */
  public static int sumMultiples(int lower, int upper, int[] multiples) {
    int sum = 0;
    
    for (int i = lower; i < upper; i++) {
		for (int j = 0; j < multiples.length; j++) {
			if (i%multiples[j]==0 )
			{
				sum=sum+i;
				break;
			}
		}
	}
    return sum;
  }
}
