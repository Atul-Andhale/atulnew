package collectionStudy;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) {
		
		TreeSet ts=new TreeSet();
		
		//ts.add("Pune");
		ts.add(2);
		ts.add(5);
		//ts.add('A');
		ts.add(10);
		//ts.add(true);
		//ts.add(null);
		
		System.out.println(ts);
		
		System.out.println(ts.contains(5));
		System.out.println(ts.size());
		System.out.println(ts.remove(2));
		System.out.println(ts.size());
		System.out.println(ts.add(11));
		System.out.println(ts.size());
	
		for(Object t:ts) 
		{
			System.out.println(t);
		}
		
		Iterator it = ts.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
		
		

	}

}
