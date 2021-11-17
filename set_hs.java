package collections;

import java.util.*;

public class set_hs {

	public static void main(String[] args) {
		
		Set<String> l=new HashSet<String>(); //generic
		l.add("hello");
		l.add("priya");
		l.add("sai");
		l.add("manasa");
		l.add("priya");
		l.add("priya");
		
		l.remove("hello");
		
		l.add(null); // Set accepts Only 1 null value
		l.add(null);


//	for(int i=0;i<l.size();i++) // for loop
//	{
//		System.out.println(l.get(i));
//	}
		
//	for( String values:l) //for_each loop
//	{
//		System.out.println(values);
//		}
//		

//	while(i<l.size())
//	{
//		System.out.println(l.get(i));
//		i++;
//	}
		Iterator it =l.iterator(); //Iterator
		while(it.hasNext())
		{
			System.out.println(it.next());
     }
		
}
}
