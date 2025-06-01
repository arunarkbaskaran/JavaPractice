package Practice;

public class ReverseANumber {

	public static void main(String[] args) {
		int number=4567;
		int temp,reversed=0;
		while(number>0)
		{
			temp=number%10;
			number=number/10;
			reversed=(reversed*10)+temp;
		}
		System.out.println("Reversed Integer : "+reversed);
	}

}
