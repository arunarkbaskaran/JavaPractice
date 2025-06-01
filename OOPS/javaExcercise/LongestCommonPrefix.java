package javaExcercise;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] input = { "geeksforgeeks", "geeks", "geek", "geezer" };
		System.out.println("Prefix Result" + longestCommonPrefixv2(input));

	}

	public String findLongestCommonPrefix(String[] input) {
		String prefixResult;
		int size = input.length;
		if (size == 0)
			prefixResult = null;
		if (size == 1)
			prefixResult = input[0];
		Arrays.sort(input);
		System.out.println("Size of an Given Input : " + input.length);
		int minCharSize = Math.min(input[0].length(), input[size - 1].length());
		System.out.println("Min Char Length : " + minCharSize);
		int i = 0;
		while (i < minCharSize && input[0].charAt(i) == input[size - 1].charAt(i)) {
			i++;
		}
		prefixResult = input[0].substring(0, i);
		return prefixResult;
	}

	public static String longestCommonPrefixv2(String[] strs) {
		if (strs == null || strs.length == 0) {
			return "";
		}

		String prefix = strs[0]; // Start with the first string as the prefix

		for (int i = 1; i < strs.length; i++) {
			while (strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1); // Reduce prefix length
				if (prefix.isEmpty()) {
					return "";
				}
			}
		}
		return prefix;

	}

	public static String longestCommonPrefix(String[] a) {
		int size = a.length;
		if (size == 0)
			return "";

		if (size == 1)
			return a[0];

		Arrays.sort(a);

		int end = Math.min(a[0].length(), a[size - 1].length());
		int i = 0;
		while (i < end && a[0].charAt(i) == a[size - 1].charAt(i))
			i++;

		String pre = a[0].substring(0, i);
		return pre;
	}

}
