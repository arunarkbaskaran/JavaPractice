package Practice;

public class FactorialOfEachNumber {

	public static void main(String[] args) {
		int limit=20;
		for(int i=1;i<=limit;i++)
		{
			System.out.println("Factorial for : "+i+" is : "+findFactorial(i));
		}
	}
	public static int findFactorial(int number)
	{
		if(number==0||number==1)
		{
			return 1;
		}
		return number*findFactorial(number-1);
	}
}
