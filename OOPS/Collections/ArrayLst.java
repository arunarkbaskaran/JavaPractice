package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLst {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Arun");
		al.add("Suresh");
		al.add("Simbu");
		al.add("Sumo");
		al.add("Sathish");
		Iterator itr=al.iterator();
		
		while(itr.hasNext())
		{
		 System.out.println(itr.next());
		}
		
		al.forEach(i->{
			System.out.println(i);
		});
	}

}
