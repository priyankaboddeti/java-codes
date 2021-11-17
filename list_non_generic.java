package collections;

import java.util.*;

public class list_non_generic {

	public static void main(String[] args) {
		ArrayList l=new ArrayList(); //Non generic
		l.add(1);
		l.add("hello");
		l.add("1");
		l.add(1.0);
		
		for(int i=0;i<l.size();i++) // for loop
		{
			System.out.println(l.get(i));
		}
//		Iterator i =l.iterator(); //Iterator
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//	}
		System.out.println(l.remove(1));

}
}