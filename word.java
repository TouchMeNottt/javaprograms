//WAP to input a word and arrang the letters in ascending order
import java.util.Scanner;
class word
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int i,j,l;		
        System.out.println("enter a word to arrange in ascending order");
		String s1=in.next();
		s1=s1.trim();
		s1=s1.toUpperCase();
		String str="";
		l=s1.length();
		for (i = 65; i <= 90; i++) {
           for ( j = 0; j < l; j++) {
                char ch = s1.charAt(j);
                if ((char)i == ch) {
                    str += ch;
                }
            }
     }
		System.out.println("The word afer arranging in ascending order is "+str);
	}
}