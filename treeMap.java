package collections;
import java.util.*;
public class treeMap {

	public static void main(String[] args) {
		TreeMap<Integer,String> t=new TreeMap<Integer,String>();
		t.put(101, "Priya");
		t.put(105, "hello");
		t.put(110, "hai");
		t.put(104, "hari");
//		System.out.println(t.headMap(110));
//	System.out.println(t.lowerEntry(102));
//		t.replace(104,"Priya");
//		System.out.println(t);
//		System.out.println(t.floor(104));
//		System.out.println(t.floorEntry(106));
		for(Map.Entry m:t.entrySet())
		{

			System.out.println(m.getKey()+" "+m.getValue());
			
	    }

}
}
