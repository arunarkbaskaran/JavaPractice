package Practice;

public class SumOfDigit {

	public static void main(String[] args) {
		int given = 12345, temp, sum = 0;
		label : while (given > 0) {
			temp = given % 10;
			sum = sum + temp;
			given = given / 10;
		}
		System.out.println("Sum of Digit  is : " + sum);
	}

}
