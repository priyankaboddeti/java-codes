import java.util.Scanner;

public class passfail 
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a no of subjects");
	int pass=0;
	int fail=0;
	int size=sc.nextInt();
	if(size<=0)
		System.out.println("ivalid input size");
		
	int arr[]=new int[20];
	for(int i=0;i<size;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<size;i++)
	{
	if (arr[i]>50)
		pass+=1;
	else
		fail+=1;  
	}
	if(pass>0 && fail>0)
	System.out.println("ram passed in " +pass+ " sub and failed in " +fail+ " sub");
	else if(pass==size)
		System.out.println("ram passed in all sub");
	else
		System.out.println("ram failed in all sub");
	}
}
