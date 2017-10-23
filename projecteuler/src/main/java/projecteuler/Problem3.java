package projecteuler;

public class Problem3 {
/**
 * 
 * @return
 */
	public static long primFactor() {
		// BigInteger input = new BigInteger("600851475143");
		// BigInteger input = new BigInteger("13195");
		long input = 600851475143l;
		long res = 0;
		long end = (long) Math.sqrt(input);
		for (long i = 2; i <= end; i++) {

			if (input % i == 0) {
				res = i;
			}

		}
		long p = 2;
		long j = 2;
		for (long i = res; i > 3; i--) {
			if(input % i ==0 ){
				for (j = 2; j < i; j++) {
				   if(i% j == 0 ){
					   break;
				   }
				}
				if(j == i){
					p =j;
					break;
				}
			}
		}

		

		return p;
	}

}
