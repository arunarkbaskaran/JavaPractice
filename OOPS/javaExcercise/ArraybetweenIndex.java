package javaExcercise;

public class ArraybetweenIndex {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int target = 10;
		// Expected output {1,7}
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] + array[j] == target) {
					System.out.println("{" + i + "," + j + "}");
				}
			}
		}
	}
}
