package projecteuler;

public class Problem2 {

	public static int finEvenFibonacciNumber() {
		int res = 0;
		int prev = 1;
		int curr = 1;
		int sum = 0;

		for (int i = 0; i <= 4000000; i++) {
			if (sum > 4000000) {
				return sum;
			}
			res = curr + prev;
			prev = curr;
			curr = res;
			if (res % 2 == 0) {
				sum = sum + res;
			}
		}

		return sum;
	}

}
