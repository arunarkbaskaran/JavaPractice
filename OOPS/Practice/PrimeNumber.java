package Practice;

public class PrimeNumber {

	public static void main(String[] args) {
		int number = 18, divisibleCount = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				divisibleCount++;
			}
		}
		System.out.println("Given Number is divisible By : "+divisibleCount+" Times");
		if (divisibleCount == 2) {
			System.out.println("Given Number is prime");
		} else {
			System.out.println("Not Prime");
		}
	}

}
