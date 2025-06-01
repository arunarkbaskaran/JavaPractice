package Practice;

public class Palindrome {

	public static void main(String[] args) {
		String given="Tenet";
		String given1="ARUN";
		//Method 1
		StringBuffer sBuffer=new StringBuffer();
		sBuffer.append(given);
		sBuffer.reverse();
		if(sBuffer.toString().equalsIgnoreCase(given))
		{
			System.out.println("Palindrome!!!");
		}
		else
		{
			System.out.println("NOT Palindrome!!!");
		}
		//Method 2
		String reversed="";
		char[] givenArray=given.toCharArray();
		for(int i=given.length()-1;i>=0;i--)
		{
			reversed=reversed+givenArray[i];
		}
		if(reversed.equalsIgnoreCase(given))
		{
			System.out.println("Palindrome!!!");
		}
		else
		{
			System.out.println("NOT Palindrome!!!");
		}
		

	}

}
