import java.util.Scanner;

public class IT26102562Lab5Q1
{
	public static void main(String [] args)
	{
		int num1,num2,num3,sml,lgt;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter num 1: ");
		num1 = input.nextInt();

		System.out.println("Enter num 2: ");
		num2 = input.nextInt();
		
		System.out.println("Enter num 3: ");
		num3 = input.nextInt();
		
		if (num1>num2)
		{
			lgt = num1;
			sml = num2;
		}
		else
		{
			lgt = num2;
			sml = num1;
		}
		
		if (num3>lgt)
		{
			lgt = num3;
		}
		
		if (num3<sml)
		{
			sml = num3;
		}
		
		System.out.println("The entered numbers are " + num1 + " " + num2 + " " + num3);
		System.out.println("The largest num is " + lgt);
		System.out.println("The smallest num is " + sml);
		
		
	}
}