package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class list_generic {

	public static void main(String[] args) {
		int i=0;
		
		List<Integer> l=new ArrayList<Integer>(); //generic
		l.add(5);
		l.add(7);
		l.add(8);
		l.add(3);
		l.add(5);
		l.add(1,5);
		l.add(null);
		
//		l.set(0, 2); // change the element
//		l.set(1, null);//change the element to null   // List accepts n no.of null elements
//		l.set(2, null);
		
//		for(int i=0;i<l.size();i++) // for loop
//		{
//			System.out.println(l.get(i));
//		}
		
		while(i<l.size())
		{
			System.out.println(l.get(i));
			i++;
		}
	
//		Iterator i =l.iterator(); //Iterator
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//	     }
//				for( int values:l)
//	{
//	System.out.println(values);
//		}
//		System.out.println("Returning 2nd element: "+l.get(3)); //retrieve the element

}
	}


