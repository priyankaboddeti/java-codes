package collections;

import java.util.*;

public class Arr_list_for {

	public static void main(String[] args) {
		
		ArrayList<Integer> l=new ArrayList<Integer>(); //generic
		l.add(45);
		l.add(47);
		l.add(21);
		l.add(32);
		l.add(51);
		l.set(1,42);
	//l.remove(21);
	System.out.println(l);


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
	Iterator it = l.iterator(); //Iterator
	while(it.hasNext())
	{
		System.out.println(it.next());
}
//	ListIterator it = l.listIterator(); //Iterator
//		while(it.hasPrevious())
//		{
//			System.out.println(it.previous());
//  }
//		l.remove(2);
//		System.out.println(l);
//		
}
}
