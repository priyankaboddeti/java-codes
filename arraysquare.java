import java.util.Scanner;

public class arraysquare
{
public static void main(String args[])
{
	int sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array size");
	int size=sc.nextInt();
	int in[]=new int[size];
	int out[]=new int[size];
	System.out.println("enter array elements");
	for(int i=0;i<size;i++)
	{
		
		in[i]=sc.nextInt();	
	}
	System.out.println("ur output arraysquare elements");
	
  for(int j=0;j<size;j++)
	{
			sum=0;
		
		for(int i=0;i<size;i++)
		{
			if(i==j) 
				continue;
			else
			sum=sum+(in[i]*in[i]);
		}
		out[j]=sum;
	}
		for(int i=0;i<size;i++)
		{
			System.out.println( out[i]);
		}
	}
}
