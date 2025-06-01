package javaExcercise;

public class ArraysExamples {
	public static void main(String args[]) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		String[] s = { "abc", "def", "ghi" };
		char[] c = { 'a', 'b', 'c' };
		int len=a.length;
		System.out.println("Integer Array");
		for (int i : a) {
			System.out.println(i);
		}
		System.out.println("String Array");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}

		System.out.println("Char Array");
		for (char item : c) {
			String s1 = String.valueOf(item);
			System.out.println(s1);
		}

	}
}
