//WAP to enter a string/word and check weather the word is palindrome or not
import java.util.Scanner;
class palindrome
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int i,l;
		System.out.println("Enter a word to check palindrome");
		String s1=in.next();
		String str="";
		s1=s1.trim();
		l=s1.length();
		for(i=0;i<l;i++)
		{
			char ch=s1.charAt(i);
			str=ch+str;
		}
		if(s1.equals(str))
		{
			System.out.println("It is a palindrome word");
		}
		else
		{
			System.out.println("It is not a palindrome word");
		}
	}
}

