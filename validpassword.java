import java.util.Scanner;

public class validpassword
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println(" ");
		System.out.print("Enter the password : ");
		String password = input.nextLine();
		
		if(is_valid(password))
		{
			System.out.print(password+" is a valid password");
		}
		else
		{
			System.out.print(password+" is not a valid password");
		}
		System.out.println(" ");
	}
	public static boolean is_valid(String X)
	{
		
		if(X.length()<10)
			return false;
		
		int nd = 0;
		int na = 0;
		for(int i = 0 ; i<X.length() ; i++)
		{
			if(is_digit(X.charAt(i)))
				nd++;
			if(is_letter(X.charAt(i)))
				na++;
		}
		if(nd+na !=X.length())
			return false;
		if(nd<2)
			return false;
		return true;
	}
	public static boolean is_digit(char X)
	{
		if(X>='0'&& X<='9')
			return true;
		return false;
	}
	public static boolean is_letter(char X)
	{
		X = Character.toUpperCase(X);
		if(X>='A' && X<='Z')
			return true;
		return false;
	}
}
