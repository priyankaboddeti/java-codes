import java.util.Scanner;

public class altdiff 
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array size");
	int diff=0;
	int lardiff=0;
	int smallindex=0;
	int size=sc.nextInt();
	int in[]=new int[size];
	System.out.println("enter elements");
	for(int i=0;i<in.length;i++)
	{
		in[i]=sc.nextInt();
	}
	for(int i=0;i<size-2;i++)
	{
		 diff=in[i]-in[i+2];
		 if(diff<0)
		 {
	        diff=diff*-1;
		 }
		 System.out.println(in[i]+"-"+in[i+2]+"="+diff);
		 if(lardiff<diff)
		 {
			 lardiff=diff;
			 if(in[i]<in[i+2])
			 smallindex=i;
			 else
				 smallindex=i+2;	 
		 }
		 
	}
	System.out.println("larger-difference" +lardiff);
	System.out.println("larger difference of low index is "+smallindex);
}
}
