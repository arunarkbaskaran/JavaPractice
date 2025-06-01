package Practice;

public class StringMethods {

	public static void main(String[] args) {
		String given2="Arun,Welcome to Interview,Thank you.";
		String[] result=given2.split(given2);
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
		System.out.println(given2.substring(0,given2.indexOf(",")));
		System.out.println(given2.substring(given2.indexOf(",")+1,given2.length()));
		String given="Arun";
		StringBuffer given1=new StringBuffer();
		given1.append("Arun Kumar");
		System.out.println(given.charAt(0));
		given=given.concat(" Kumar");
		System.out.println(given);
		System.out.println(given.contains("Arun"));
		System.out.println(given.contentEquals(given1));
		given.endsWith("Kumar");
		given.startsWith("Arun");
		System.out.println(given.repeat(5));
		int a=7;
		System.out.println(String.valueOf(a));
	}

}
