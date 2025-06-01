package Practice;

public class PrimeNumber1toN {

	public static void main(String[] args) {
		int limit = 100;
		for (int i = 1; i <= limit; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
	}

	public static boolean isPrime(int n) {
		int prime = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				prime++;
			}
		}
		if (prime == 2) {
			return true;
		} else {
			return false;
		}
	}

}
