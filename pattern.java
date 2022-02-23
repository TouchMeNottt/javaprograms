import java.util.Scanner;
class pattern
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int i,j;
		System.out.println("enter a word to print the pattern");
		String s1=in.nextLine();
		s1=s1.trim();
		int l=s1.length();
		for (i=0;i<l;i++) 
		{
			System.out.println(s1.substring(l-(i+1)));
		}
	}
}
