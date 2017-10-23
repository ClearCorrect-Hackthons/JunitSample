package projecteuler;

import java.util.Arrays;

public class Problem4 {

	public static int findLargestPolindrome() {
		int res = 0;
		boolean isPalindrome = false;
		for (int i = 999; i >= 100; i--) {
			for (int j = 999; j >= 100; j--) {
				isPalindrome = isPalindrome(i * j);
				if (isPalindrome == true) {
					if(res < i*j){
						res = i*j;
					}

				}
			}

		}
		return res;
	}

	public static boolean isPalindrome(int palNum) {
		char[] input = String.valueOf(palNum).toCharArray();
		char[] out = new char[input.length];
		int startIndex = 0;
		for (int i = input.length - 1; i >= 0; i--) {

			out[startIndex] = input[i];
			startIndex++;
		}

		return Arrays.equals(out, input);
	}
}
