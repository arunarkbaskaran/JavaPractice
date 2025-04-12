package javaExcercise;

public class ThirdLargestinArray {
	public static void main(String args[])
	{
		int[] arr = {31, 5, 30, 2, 6, 32};
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			 if (arr[i] > arr[j]) {
			        temp=arr[i];
			        arr[i]=arr[j];
			        arr[j]=temp;
			 }
			}
		System.out.println("Largest Number : "+arr[arr.length-1]);
		System.out.println("Second Largest Number : "+arr[arr.length-2]);
		System.out.println("Third Largest Number : "+arr[arr.length-3]);
	}

}
