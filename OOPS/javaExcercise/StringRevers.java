package javaExcercise;

public class StringRevers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=4567;
		printReverse(i);
		System.out.println();
	}
	public static void printReverse(int num){
		int temp=0;
		if(num>=10)
		{
			System.out.println(temp);
			num=Math.divideExact(num, 10);
			printReverse(num);
			
		}
		else
		{
			System.out.println(Math.floorMod( num, 10));
		}
	}

}
