package javaExcercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionsEx {

	public static void main(String[] args) {
		List<String> testArrayList=new ArrayList<String>();
		testArrayList.add("Arun");
		testArrayList.add("KUMAR");
		testArrayList.add("BASKARAN");
		testArrayList.add("ORACLE");
		testArrayList.forEach(item->{
			System.out.println(item);
		});
		testArrayList.size();
		List<String> testLinkedList=new LinkedList<String>();
		testLinkedList.add("LL1");
		testLinkedList.add("LL2");
		testLinkedList.add("LL3");
		testLinkedList.add("LL4");
		testLinkedList.add("LL5");
		testLinkedList.add("LL6");
		Iterator it=testLinkedList.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		String s="Arun";
		s.toCharArray();
	}

}
