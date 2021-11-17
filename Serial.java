package collections;

import java.io.*;
import java.util.*;
class Serial{

	public static void main(String[] args)
	{
		Serial s=new Serial();
		s.writeStudent();
	}
		private void writeStudent()
		{
		try
		{
			FileOutputStream fout=new FileOutputStream("/home/miracle/Desktop/Test1.txt");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			Student s=new Student(101,"priya");
			Student s1=new Student(102,"sai");
			ArrayList al=new ArrayList();
			al.add(s);
			al.add(s1);
			out.writeObject(al);
			out.close();
			System.out.println("success");
		}
		
        catch(Exception e) {};
     }
		
	}


