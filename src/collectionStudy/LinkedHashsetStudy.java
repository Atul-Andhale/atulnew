package collectionStudy;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetStudy {

	public static void main(String[] args) {
		
		LinkedHashSet lh=new LinkedHashSet();
		
		lh.add("Pune");
		lh.add("Pune");
		lh.add('B');
		lh.add(null);
		lh.add(null);
		lh.add(123);
		lh.add(true);
		
		System.out.println(lh);
		
		System.out.println(lh.add('C'));
		System.out.println(lh.contains('B'));
		System.out.println(lh.size());
		System.out.println(lh.remove('c'));
		System.out.println(lh.size());
		
		System.out.println("===============================");
		
		Iterator it = lh.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
		
		System.out.println("===============================");
		
		for(Object l:lh) 
		{
			System.out.println(l);
		}

	}

}
