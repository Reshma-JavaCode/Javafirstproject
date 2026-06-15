package com.languagefundamentals.loops;

public class PrimeNumbers3 {

	public static void main(String[] args) {

		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (isPrime(i)) {
				count++;
				if (count % 2 != 0)
					System.out.print(i + " ");
			}
		}
	}

	static boolean isPrime(int i) {
		boolean status = true;

		if (i <= 1)
			return false;
		for (int j = 2; j <= Math.sqrt(i); j++) {
			if (i % j == 0)
				return false;
		}

		return true;
	}
}
