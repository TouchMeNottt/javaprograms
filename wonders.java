//WAP to check the wonder of the user input world with the predefined wonders and world
import java.util.Scanner;
class wonders
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int i;
		String wonders[]={"Wonder1","Wonder2","Wonder3","Wonder4","Wonder5","Wonder6","Wonder7"};
		String country[]={"country1","country2","country3","country4","country5","country6","country7"};
		
		int counter=0;

		System.out.println("Enter a country name to check its wonder");
		String userinputworld=in.next();
		
		int l=userinputworld.length();
		for(i=0;i<l;i++)
		{
			if(country[i].equalsIgnoreCase(userinputworld))
			{
				System.out.println("The wonder of this country is "+wonders[i]);
				counter=1;
				break;
			}
		}
		if (counter==0)
		{
				System.out.println("Sorry! Threre is no wonder in this country");
		}
	}
}