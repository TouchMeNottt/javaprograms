//WAP to accept two integer array of size. The propgram should create another array T that finds the itersection of the two
import java.util.Scanner;
class intersection
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int i,j;
		int x=0;
		int a[]=new int[5];
		int b[]=new int[5];
		int c[]=new int[5];
		System.out.print("Enter 1st set of array elements: ");
		for(i=0;i<5;i++)
		{
			a[i]=in.nextInt();
		}
		System.out.print("Enter 2nd set of array elements: ");
		for(i=0;i<5;i++)
		{
			b[i]=in.nextInt();
		}
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++);
			{
				if(a[i]==b[i])
			    {
				      c[x]=a[i];
				      x++;
			    }
			}
		}
		System.out.println("The intersection elements are :");
		for(i=0;i<x;i++)
		{
			System.out.print(c[i]+"/t");
		}
	}
}