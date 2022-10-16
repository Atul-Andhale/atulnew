package collectionStudy;

import java.util.HashSet;
import java.util.Iterator;

public class HashetStudy {

	public static void main(String[] args) {
		
	
		HashSet hs=new HashSet();
		
		hs.add("Pune");
		hs.add("Pune");
		hs.add(null);
		hs.add(null);
		hs.add(123);
		hs.add(true);
		hs.add('A');
		
		System.out.println(hs);
		
		System.out.println(hs.contains("Pune"));
		System.out.println(hs.size());
		System.out.println(hs.remove('A'));
		System.out.println(hs.size());
		System.out.println(hs.add('B'));
		System.out.println(hs.size());
		
		System.out.println("==========================================");
 
		Iterator it = hs.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
		System.out.println("==========================================");
		
		for(Object i:hs) 
		{
			System.out.println(i);
		}
		
		
		

	}

}
