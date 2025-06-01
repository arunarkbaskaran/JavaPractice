package Practice;

public class Fibonacci {

	public static void main(String[] args) {
		int first=0,second=1,limit=10;
		int current;
		while(limit>0)
		{
			current=first+second;
			System.out.println(current);
			first=second;
			second=current;
			limit--;
		}
	}
}
