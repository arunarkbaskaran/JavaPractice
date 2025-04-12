package javaExcercise;

import java.util.Scanner;

public class StringReverse {
	public static void main(String args[])
	{
		String srcString="i.like.this.program.very.much";
		System.out.println("Enter a New String");
		Scanner sc=new Scanner(System.in);
		srcString=sc.next();
		String[] srcStringArray=srcString.split("[.]");
		System.out.println(srcStringArray);
		String targetResult="";
		System.out.println("Size of a String '"+srcString+"' is \t "+srcStringArray.length);
		for(int i=srcStringArray.length-1;i>=0;i--)
		{
			if(i==0)
				targetResult=targetResult+srcStringArray[i];
			else
				targetResult=targetResult+srcStringArray[i]+".";
		}
		System.out.println(targetResult);
	}

}
