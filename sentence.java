//WAP to reverse each word of user give string without altering their position. For e.g; input- Amit Kumar Roy : o/p- timA ramuK yoR
import java.util.Scanner;
class sentence
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int i;
		System.out.println("Enter a sentence");
		String s1=in.nextLine();
		s1=s1.trim();
		String s2=s1.concat(" ");
        int l=s2.length();
        String str="";
		String str1="";
		for(i=0;i<l;i++)
		{
			char ch=s2.charAt(i);
			if(ch != ' ')
			{
               str=ch+str;
			}
			else
			{
				str1=str1+" "+str;
			    str="";
			}
		}
		System.out.println(str1);
	}
}