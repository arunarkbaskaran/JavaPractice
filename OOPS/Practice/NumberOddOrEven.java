package Practice;

import java.util.Scanner;

public class NumberOddOrEven {

	public static void main(String[] args) {
		int x;
		System.out.println("Enter 1 Integer Number :");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		if (x != 0) {
			if (x % 2 == 0) {
				System.out.println("Even!");
			} else {
				System.out.println("Odd");
			}
		} else {
			System.out.println("Zero!");
		}
	}

}
