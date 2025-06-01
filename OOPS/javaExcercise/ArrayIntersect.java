package javaExcercise;

import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class ArrayIntersect {
	public static void main(String args[]) {
		int[] a1 = new int[] { 4, 6, 8, 5, 2, 6, 8 };
		int[] a2 = new int[] { 4, 10, 8, 18, 2, 6, 8 };
		SortedMap<Integer, Integer> uniqueMap = new TreeMap<>();
		SortedSet<Integer> set = new TreeSet<Integer>();
		for (int i : a1) {
			uniqueMap.put(i, uniqueMap.getOrDefault(i, 0) + 1);
			set.add(i);
		}
		for (int j : a2) {
			uniqueMap.put(j, uniqueMap.getOrDefault(j, 0) + 1);
			set.add(j);
		}
		for (Map.Entry<Integer, Integer> entry : uniqueMap.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
			}
		}

		System.out.println("Set Result");
		set.forEach(num -> {
			System.out.println(num);
		});
	}
}
