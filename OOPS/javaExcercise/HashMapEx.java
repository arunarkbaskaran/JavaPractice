package javaExcercise;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;

public class HashMapEx {
	public static void main(String args[]) {
		int a1[] = new int[] { 1, 5, 3, 655, 432, 786, 2, 12, 45, 12,1,5,3};
		int a2[] = new int[] { 1, 5, 3, 67, 45, 343, 565, 32, 5 };
		int a1Length = a1.length;
		int a2Length = a2.length;
		System.out.println("a1 Length : " + a1Length);
		System.out.println("a2 Length : " + a2Length);
		Map<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		for (int i : a1) {
			hashmap.put(i, hashmap.getOrDefault(i, 0) + 1);
		}
		for (int j : a2) {
			hashmap.put(j, hashmap.getOrDefault(j, 0) + 1);
		}
		for (Map.Entry<Integer, Integer> entry : hashmap.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
			}
		}
		
		

	}
}
