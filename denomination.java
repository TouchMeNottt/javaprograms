//WAP to input an amount upto 5 digits and print the denomination of it
import java.util.Scanner;
class denomination
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
        int amt,i,p,t;
        int a[]={1000,500,100,50,20,10,5,2,1};
        int l=a.length;
        System.out.print("Enter an amount upto 5 digits : ");
        amt=in.nextInt();
        if(amt>99999){
        System.out.println("INVALID AMOUNT.");}
        else
        {
           p=amt;
           for(i=0;i<l;i++)
           {
              t=amt/a[i];
              if(t!=0)
              {
                 System.out.println("Rupees s"+a[i]+" X "+t+" = "+(t*a[i]));
                 amt=amt%a[i];
               }
           }
	    }
    }
}