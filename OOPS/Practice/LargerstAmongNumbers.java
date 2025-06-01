package Practice;

public class LargerstAmongNumbers {

	public static void main(String[] args) {
		int[] array = { 20, 30, 1, 60, 2, 70, 10, 2, 3 };
		int m=0,secondBiggest=0,thirdbiggest=0;
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>m)
			{
			thirdbiggest=secondBiggest;
			secondBiggest=m;
			m=array[i];	
			}
		}
		System.out.println("1st Biggest : "+m+", 2nd Biggest : "+secondBiggest+", 3rd Biggest : "+thirdbiggest);
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}

}
