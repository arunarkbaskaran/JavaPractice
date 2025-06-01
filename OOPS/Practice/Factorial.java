package Practice;

import java.util.Scanner;

public class Factorial {
//Factorial Formula n! = n x (n-1) x... x 1
	//n=5 5*4*3*2*1=120
	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Integer number to find factorial!");
		number=sc.nextInt();
		int result=1;
		while(number>=1)
		{
			result=result*number;
			number--;
		}
		System.out.println("Factorial for "+number+" is : "+result);
		//method 2 : Recursion
		System.out.println("Factorial for 5 is : "+factorial(10));
	}
	public static int factorial(int n)
	{
		if(n==0||n==1)
		{
			return 1;
		}
		return n*factorial(n-1);
	}

}
