package collections;
import java.util.*;

class obj_arr {
	int id;
	String name;
	double salary;
 
	
	obj_arr (int id,String name,double salary) //this is used when we use same names in Parameters and Variables
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	
//	obj_arrlist (int i,String n) 
//	{
//		i=id;
//		n=name;
//	}
}
 public class obj
 {
	public static void main(String[] args)
	{
		obj_arr o=new obj_arr(1,"priya",15000);
		
		obj_arr o1=new obj_arr(2,"Sai",30000);
		TreeMap<Integer,obj_arr> hs=new TreeMap<Integer,obj_arr>();
		//HashSet<obj_arr> hs=new HashSet<obj_arr>();
		//LinkedHashSet<obj_arr> hs=new LinkedHashSet<obj_arr>();
	    //Set<obj_arr> hs=new TreeSet<obj_arr>();b Treesort doesnt work with Objects. 
		//hs.add(o);
		hs.put(2,o);
		hs.put(3,o);
		hs.put(1,o1);
		//hs.put(,o1);
//		for(obj_arr ob:hs)
//		{
//			System.out.println("id:"+ob.id+"\t" +"name:"+ob.name+"\t"+"Salary:"+ob.salary+"\t");
//		}
//		Iterator i =hs.iterator();
//		while(i.hasNext())
//		{
//			//System.out.println(i.next()); // it prints the hash code
//			obj_arr o2=(obj_arr)i.next();
//			System.out.println("id:"+o2.id+"\t"+"name:"+o2.name+"\t"+"Salary:"+o2.salary+"\t");
//		}
		for(Map.Entry<Integer,obj_arr> m:hs.entrySet())
		{
			int k=m.getKey();
			obj_arr a=m.getValue();
			System.out.println(k);
			System.out.println(a.id+" "+a.name);
		}

	}

}
