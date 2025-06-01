package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapExample {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 2);
		map.put(2, 3);
		map.put(3, 4);
		map.put(4, 4);
		map.put(1, 4);
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		map.containsKey(1);
		map.containsValue(2);

		map.forEach((key, value) -> {
			System.out.println(key + " " + value);
		});

		Set set = map.keySet();
		set.forEach(key -> {
			System.out.println(key);
		});

		map.put(5, 2);
		map.putIfAbsent(5, 3);
		map.putIfAbsent(6, 2);
		
		map.forEach((key, value) -> {
			System.out.println(key + " " + value);
		});
		Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
		treeMap.values();
	}

}
