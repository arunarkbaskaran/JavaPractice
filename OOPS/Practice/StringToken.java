package Practice;

import java.util.StringTokenizer;

public class StringToken {

	public static void main(String[] args) {
		System.out.println("Hello Arun Kumar");
		StringTokenizer st = new StringTokenizer("Hello Arun Kumar", " ");
		String reversed = "";
		while (st.hasMoreElements()) {
			StringBuilder temp = new StringBuilder();
			temp.append(st.nextElement().toString()).reverse();
			if (st.hasMoreElements())
				reversed = reversed + temp.toString() + " ";
			else
				reversed = reversed + temp.toString();
		}
		System.out.println(reversed);
	}
}
