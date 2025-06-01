package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(50);
		al.add(50);
		al.add(60);
		al.add(1);
		System.out.println("Print ArrayList..");
		Iterator it = al.iterator();
		toPrintArrayListUsingIterator: while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("Print ArrayList After Sort..");
		
		Collections.sort(al);
		
		toPrintArrayListAfterSort: al.forEach(item -> {
			System.out.println(item);
		});
		
		System.out.println("Map to Find Frequency");
		Map<Integer, Integer> frequency = new HashMap<Integer, Integer>();

		loopForArrayList: al.forEach(i -> {
			frequency.put((Integer) i, frequency.getOrDefault(i, 0) + 1);
		});

		for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Frequency : " + entry.getValue());
		}
		System.out.println("Sorted Map (Key) to Find Frequency");
		Map<Integer, Integer> sortedMap = new TreeMap<Integer, Integer>();
		sortedMap.putAll(frequency);
		
		for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Frequency : " + entry.getValue());
		}
		

	}

}
