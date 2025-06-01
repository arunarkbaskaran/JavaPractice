package javaExcercise;

public class PermutionCombination {

	public static void main(String[] args) {
		String str = "ABC";
		permute(str, "");
	}

	public static void permute(String str, String prefix) {
		if (str.isEmpty()) {
			System.out.println(prefix);
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			String remaining = str.substring(0, i) + str.substring(i + 1);
			permute(remaining, prefix + str.charAt(i));
		}
	}

}
