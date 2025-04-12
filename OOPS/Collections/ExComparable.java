package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ExComparable implements Comparable<ExComparable> {
	int eid;
	String eName;
	int eAge;
	String eState;

	public ExComparable(int eid, String eName, int eAge) {
		this.eid = eid;
		this.eName = eName;
		this.eAge = eAge;
	}

	@Override
	public int compareTo(ExComparable o) {
		System.out.println("o.eAge : "+ o.eAge +"eAge : "+eAge);
		if (eAge == o.eAge) {
			
			return 0;
		} else if (eAge > o.eAge) {
			return -1;
		} else
			return 1;

	}

	public static void main(String args[]){  
		ArrayList<ExComparable> al=new ArrayList<ExComparable>();  
		al.add(new ExComparable(101,"Vijay",23));  
		al.add(new ExComparable(106,"Ajay",27));  
		al.add(new ExComparable(100,"Jai",21));  
		  
		Collections.sort(al);  
		for(ExComparable st:al){  
		System.out.println(st.eid+" "+st.eName+" "+st.eAge);  
		}}  
}
