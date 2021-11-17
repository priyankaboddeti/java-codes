package collections;


	import java.io.*;
	import java.util.*;
	
		public class deser {
		public static void main(String[] args)
		{
			deser s1=new deser();
			s1.readStudent();
			System.out.println("hello");
		}
			private void readStudent()
			{
			try
			{
				FileInputStream fin=new FileInputStream("Test1.txt");
				ObjectInputStream in=new ObjectInputStream(fin);
				
				ArrayList<Student> al=new ArrayList<Student>();
				
				al=(ArrayList)in.readObject();
				
				System.out.println("read the objects from the file.");
				for(Student stu:al)
				{
					System.out.println("Id :"+stu.getId());
					System.out.println("Id :"+stu.getName());
				}
			}
			
	        catch(Exception e) {};
	     }
		}
		

