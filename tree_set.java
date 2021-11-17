package collections;

import java.util.HashSet;
import java.util.*;

public class tree_set {

	public static void main(String[] args) {
		int i=0;
		TreeSet<Integer> l=new TreeSet<Integer>(); //generic
		l.add(1);
		l.add(2);
//		l.add("sai");
//		l.add("priya");
//		l.add("manasa");
//		

//	for(int i=0;i<l.size();i++) // for loop
//	{
//		System.out.println(l.get(i));
//	}
		
	for( int values:l) //for_each loop
	{
		System.out.println(values);
		}
//		

//	while(i<l.size())
//	{
//		System.out.println(l.get(i));
//		i++;
//	}
//		Iterator it =l.iterator(); //Iterator
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//     }
		
}

	}


