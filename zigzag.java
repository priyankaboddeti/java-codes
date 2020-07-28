import java.util.Scanner;

public class zigzag
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array size");
	int size=sc.nextInt();
	int temp=0;
	boolean var=true;
	int in[]=new int[size];
	System.out.println("enter elements");
	for(int i=0;i<size;i++)
	{
		in[i]=sc.nextInt();
	}
	for(int i=0;i<size-1;i++)
	{
		if(var==true) 
		{
		if(in[i]>in[i+1])
		{
			temp=in[i];
			in[i]=in[i+1];
			in[i+1]=temp;
		}
		}
		
		else
		{
		if(in[i]<in[i+1])
		{
			temp=in[i];
			in[i]=in[i+1];
			in[i+1]=temp;
		}
	  }
		var=!var;

	}
	
		
		
		for(int i=0;i<size;i++) 
		{
		System.out.println(in[i]);
	   }
	
}
	}



