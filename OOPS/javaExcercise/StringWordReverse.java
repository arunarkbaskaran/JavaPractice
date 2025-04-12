package javaExcercise;

import java.util.Scanner;

public class StringWordReverse {
	public static void main(String args[])
	{
		String srcString="i.like.this.program.very.much";
		reverseString(srcString);
	}

	private static void reverseString(String srcString) {
		System.out.println("Source String : "+srcString);
		System.out.println("Source String Length : "+srcString.length());
		char[] srcCharArray=srcString.toCharArray();
		String result="";
		
		for(int i=srcCharArray.length-1;i>=0;i--)
		{
			result=result+srcCharArray[i];
		}
		System.out.println(result);
	}

}
