//WAP to input a sentence and display the word of that sentence that contains the maximum number of vowels
import java.util.Scanner;
class maxvowel
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int i,j,l;
		int f=0;//to count the number of vowels
		int max=0;//to store the number of maximum vowels present in it
		System.out.println("Enter a sentence to check the word that contains the maximum number of vowels");
		String s1=in.nextLine();
		s1=s1.trim();
		String s2=s1.concat(" ");
		l=s2.length();
		String str="";
		String vowelmax=" ";//to store the word which contains the maximum number of words
		for(i=0;i<l;i++) //this is the main loop               
		{
			char ch = s2.charAt(i);
			if(ch != ' ')
			{
                str=str+ch;   //  character extract/word formation       
			}
			else
			{
               int l1=str.length();
               str=str.toUpperCase();
               for(j=0;j<l1;j++)               //this is the nested loop
                {
                	char ch1=str.charAt(j);
                	if(ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U')
                	{
                		f++;
                	}
                }
			}
			if(max<f)
			{
				max=f;
				vowelmax=str;
				f=0;
				str="";
			}
		}
		System.out.println("the word which contains the maximum number of vowels is "+vowelmax);
	}
}