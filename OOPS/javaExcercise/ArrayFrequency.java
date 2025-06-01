package javaExcercise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class ArrayFrequency {

	public static void main(String[] args) {
		int[] a1 = {31, 5, 30,30, 2,2,5,1, 6, 32};
		Map<Integer,Integer> hashmap=new HashMap<Integer,Integer>();
		for(int i:a1)
		{
			hashmap.put(i,hashmap.getOrDefault(i,0)+1);
		}
		for(Entry e:hashmap.entrySet())
		{
			System.out.println("Value : "+e.getKey()+". Frequency : "+e.getValue());
		}
	}

}
