//WAP to input a sentence and print the words contained in it which starts and ends with vowel
import java.util.Scanner;
class vowels
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int i,j;
		System.out.println("Enter a sentence");
		String s1=in.nextLine();
		s1=s1.trim();
		String s2=s1.concat(" ");
		int l=s2.length();
		String str="";
		String vowelwords=" "; //to store the words which starts and ends with vowel
		for(i=0;i<l;i++)
		{
			char ch=s2.charAt(i);
			if(ch !=' ')
			{
				str=str+ch;
			}
			else
			{
				int l1=str.length();
				str=str.toUpperCase();
				
				  char start=str.charAt(0);
				  char end=str.charAt(l1-1);
				  if((start=='A'|| start=='E'||start=='I'||start =='O'||start=='U')&&(end=='A'|| end=='E'||end=='I'||end=='O'||end=='U'))
				  {
                   vowelwords=vowelwords+" "+str;
				  }
				  str="";
				
			}
		}
		if(vowelwords.equals(" "))
		{
			System.out.println("No words are present which starts and ends with vowel");
		}
		else
		{
			System.out .println("The words which starts and ends with vowels are "+vowelwords);
		}
	}
}