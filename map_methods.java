package collections;

import java.util.*;

public class map_methods {

	public static void main(String[] args) {
		HashMap<Integer,String>map=new HashMap<Integer,String>();
//		HashMap map1=new HashMap();
//		HashMap map2=new HashMap();
		map.put(1,"priya");
		map.put(2,"priyanka");
		map.put(3,"saipriya");
		map.put(4, "hello" );
		System.out.println("Values in newmap1: "+ map);
//		map2= (HashMap) map .clone();
//		System.out.println("Values in newmap1: "+ map2);
//		map1.putAll(map);
//		map.putIfAbsent(5,"Javascript");
//		map.putIfAbsent(2,"Javascript");
//		map.remove(5);
//		
//		map.remove(4,"hello");
//		System.out.println("Values in newmap1: "+ map.keySet());
//		System.out.println("Values in newmap1: "+ map.values());
//		System.out.println("Values in newmap1: "+ map.entrySet());
//	      System.out.println("Values in newmap2: "+ map1);
//	      System.out.println((map1));
//	      System.out.println("Values in newmap2: "+ map1);
//		System.out.println(m);
//		Set s=map.entrySet();
//		Iterator itr=s.iterator();
//		while(itr.hasNext())
//		{
//			//System.out.println(it.next());
//	       //Converting to Map.Entry so that we can get key and value separately  
//			Map.Entry entry=(Map.Entry)itr.next();  
//			System.out.println(entry.getKey()+" "+entry.getValue());  
//			
//		}
		for (Map.Entry m : map.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());    
		{
			
		}
	}

}
