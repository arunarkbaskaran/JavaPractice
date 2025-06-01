package Interview;

public class SringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String a = "Automation";
		 String b = "Auto" + "mation";
		 String c = new String("Automation");

		 System.out.println(a == b); // true?
		 System.out.println(a == c); // false?
		 System.out.println(a.equals(c)); // true?
	}

}
