package collectionStudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) 
	{
		Vector v=new Vector();
		
		v.add("velocity");
		v.add(123);
		v.add('A');
		v.add(12.325);
		v.add(true);
		v.add("velocity");
		v.add(null);
		v.add(null);
		
		
		System.out.println(v);
		
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		System.out.println(v.get(5));
		System.out.println(v.indexOf(true));
		System.out.println(v.remove(1));
		
		v.add(1, "pune");
		
		System.out.println(v);
		System.out.println("========================");
		
		//for loop
		
		for(int i=0; i<=v.size()-1; i++) 
		{
			System.out.println(v.get(i));
		}
		System.out.println("========================");
		
		//iterator
		Iterator it = v.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
		System.out.println("========================");
		
		//listiterator
		ListIterator lv = v.listIterator();
		
		while(lv.hasNext()) 
		{
			System.out.println(lv.next());
		}
		System.out.println("========================");
		//foreach loop
		for(Object p:v)
       {
			System.out.println(p);
       }
		
		System.out.println("========================");
		//byenumerator
		Enumeration el = v.elements();
		while(el.hasMoreElements()) 
		{
			System.out.println(el.nextElement());
		}

	}

}
