package collections;

import java.util.HashSet;
import java.util.*;

public class set_linhaset {

	public static void main(String[] args) {
		int i=0;
		Set<String> l=new LinkedHashSet<String>(); //generic
		l.add("hello");
		l.add("priya");
		l.add("sai");
		l.add("manasa");
		l.add("priya");

//	for(int i=0;i<l.size();i++) // for loop
//	{
//		System.out.println(l.get(i));
//	}
		
//	for( int values:l) //for_each loop
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


