import java.util.Scanner;
public class IT26102670Lab5Q1
{
	public static void main(String[] args)
	{
		Scanner nim = new Scanner(System.in);
		
		System.out.print("Enter the first integer:");
		int num1=nim.nextInt();
		
		System.out.print("Enter the second integer:");
		 int num2=nim.nextInt();
		
		System.out.print("Enter the third integer:");
		int num3=nim.nextInt();
		
		System.out.println("\n");
		System.out.println("User entered numbers are: "+ num1 +" "+ num2 +" "+ num3);
		
		int min = num1;
		int max = num1;
		
		
		if (num2 < min)
		{
			min = num2;
		}
		
		if (num3 < min)
		{
			min = num3;
		}
		if (num1 < min)
		{
		    min = num1;
		}
		System.out.println("The Smallest number is:" + min);
		
		
		
		if (num2 > max)
		{
			max = num2;
		}
		if (num3 > max)
		{
			max = num3;
		}
		if (num1 > max)
		{
			max = num1;
		}
		System.out.println("The Largest number is:" + max);
	}
}
		
		