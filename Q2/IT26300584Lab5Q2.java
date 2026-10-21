// Q2

import java.util.Scanner;

public class  IT26300584Lab5Q2
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		int numOfMembers;
		
		System.out.print("Enter the number of new members introduced : ");
		numOfMembers = input.nextInt();
		
		switch(numOfMembers)
		{
			case '0' : System.out.print("No prize");
			break;
			
			case '1' : System.out.print("The prize is a Pen");
			break;
			
			case '2' : System.out.print("The prize is an Umbrella");
			break;
			
			case '3' : System.out.print("The prize is a Bag");
			break;
			
			case '4' : System.out.print("The prize is a Travelling Chair");
			break;
			
			
			default : 
				if(numOfMembers >= 5)
		{
			System.out.print("The prize is a Haedphone");
		}
		else 
		{
			System.out.print("Input number must be 0 or greater");
			break;
		}
		}
	}
}