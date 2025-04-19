package Interview;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MaxCounter {

	public static void main(String[] args) {
		System.out.println(LocalDateTime.now());
		int N = 5;
		int[] A2 = { 3, 4, 4, 6, 6, 5, 4 };
		System.out.println(Arrays.toString(solution2(N, A2)));
		System.out.println(LocalDateTime.now());
	}

	public static int[] solution(int N, int[] A) {
		int[] arr = new int[N];
		int maxValue = 0;
		for (int operation = 0; operation < A.length; operation++) {
			if (A[operation] <= N) {
				int counter = A[operation];
				arr[counter - 1] = arr[counter - 1] + 1;
				if (arr[counter - 1] > maxValue) {
					maxValue = arr[counter - 1];
				}
			} else if (A[operation] > N) {
				for (int j = 0; j < arr.length; j++) {
					arr[j] = maxValue;
				}
			}
		}
		return arr;
	}

	public static int[] solution2(int N, int[] A) {
		int[] arr = new int[N];
		int maxValue = 0;
		int lastUpdate = 0;

		for (int operation : A) {
			if (operation >= 1 && operation <= N) {
				int index = operation - 1;
				if (arr[index] < lastUpdate) {
					arr[index] = lastUpdate;
				}
				arr[index]++;
				if (arr[index] > maxValue) {
					maxValue = arr[index];
				}
			} else if (operation == N + 1) {
				lastUpdate = maxValue;
			}
		}

		for (int i = 0; i < N; i++) {
			if (arr[i] < lastUpdate) {
				arr[i] = lastUpdate;
			}
		}

		return arr;
	}
}
