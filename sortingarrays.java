import java.util.Scanner;

public class sortingarrays 
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of array");
	int i=0;
	int temp=0;
	int size=sc.nextInt();
	if(size<=0)
	{
		System.out.println("array size should be greater than zero");
	    System.exit(0);
	}
		int arr[]=new int[size];
	System.out.println("enter elements");
	for(i=0;i<size;i++)
	{
	  arr[i]=sc.nextInt();
	}
	for(i=0;i<size/2;i++)
	{
	  if(arr[i]>arr[i+1])
	  {
		  temp=arr[i];
		  arr[i]=arr[i+1];
		  arr[i+1]=temp;
	  }
	}
	for(int j=i;j<size-1;j++)
	{
	  if(arr[j]<arr[j+1])
	  {
		  temp=arr[j];
		  arr[j]=arr[j+1];
		  arr[j+1]=temp;
	  }
	}
	System.out.println("your output");
	for(i=0;i<size;i++)
	{
	  System.out.println(arr[i]);
	}
}
}
