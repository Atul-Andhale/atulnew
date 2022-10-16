package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy {

	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		
		al.add("Velocity");
		al.add('A');
		al.add(123);
		al.add(null);
		al.add("Velocity");
		al.add(10.26);
		al.add(true);
		al.add(null);
		
		System.out.println(al);
		
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.contains(null));
		System.out.println(al.indexOf('A'));
		System.out.println(al.get(3));
		System.out.println(al.remove(2));
		al.add(2, "pune");
		
		System.out.println(al);
		
	System.out.println("=========================================");
	
		for(int i=0; i<= al.size()-1; i++)
		{
			System.out.println(al.get(i));
			
		}
		System.out.println("=========================================");
		
		//for loop
		for(int i=al.size()-1; i>=0; i--)
		{
			System.out.println(al.get(i));
			
		}
		System.out.println("=========================================");
		
		//itorator
		Iterator it = al.iterator();
		
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
		System.out.println("=========================================");
		
		//listiterator
		ListIterator lit = al.listIterator();
		while(lit.hasNext()) 
		{
			System.out.println(lit.next());
		}
		
		System.out.println("=========================================");
		
		//foreach loop
		
		for(Object h:al)
		{
			System.out.println(h);
		}
		
		

	}

}
