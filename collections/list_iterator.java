package collections;
import java.util.*;
public class list_iterator {

	public static void main(String[] args) {
		 List<String> listObject = new ArrayList<String>();
	      listObject.add("Java");
	      listObject.add("Selenium");
	      listObject.add("Python");
	      listObject.add("Java Script");
	      listObject.add("Cloud Computing");
	      System.out.println(listObject);
//	      ListIterator it = listObject.listIterator();
//	      System.out.println("Iterating the elements in forward direction: ");
//	      while (it.hasNext()) {
//	         System.out.println(it.next());
//	      }
//	      System.out.println("--------------------------------------------");
//	      System.out.println("Iterating the elements in backward direction: ");
//	      while (it.hasPrevious()) {
//	         System.out.println(it.previous());
//	      }
	      List<String> listObject1 = new ArrayList<String>();
	      listObject1.add("Java");
	      listObject1.add("Selenium");
	      listObject1.add("Python");
	      listObject1.add("Java Script");
	      listObject1.add("Cloud Computing");
	      System.out.println(listObject1);
	      //listObject.removeAll(listObject1);
	      //listObject.addAll(listObject1);
	      //System.out.println(listObject.size());
	      System.out.println(listObject.hashCode());
	      System.out.println(listObject.iterator());
//	      System.out.println(listObject.equals(listObject1));
	     // listObject.clear();
	      //System.out.println(   listObject1.isEmpty());
         System.out.println(listObject.contains("Python"));
//          System.out.println(listObject1);
	}

}
