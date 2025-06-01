package Practice;

public class Swap2Numbers {

	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("Original : A="+a+", B="+b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("Swap : A="+a+", B="+b);
		
		//Swap without temp Variable
		a=10;b=20;
		System.out.println("Original : A="+a+", B="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Swap : A="+a+", B="+b);
		
	}
}
