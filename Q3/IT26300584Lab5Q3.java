//Q3

import java.util.Scanner;

public class  IT26300584Lab5Q3
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		final double roomChargePerDay = 48000;
		final double discount3To4Days = 0.1;
		final double discount5DaysMore = 0.2;
		double totAmount, discount;
		
		System.out.print("Enter Start Date (1 - 31) : ");
		int startDate = input.nextInt();
		
		System.out.print("Enter End Date (1 - 31) : ");
		int endDate = input.nextInt();
		
		if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31)
		{
			System.out.println("Days must be between 1 and 31");
			return;
		}
		
		if (startDate >= endDate)
		{
			System.out.print("Start date must be less than End date");
			return;
		}
		
		int daysReserved = endDate - startDate;
		
		double grossAmount = roomChargePerDay * daysReserved;
		
		if (daysReserved >= 5)
		{
			totAmount = grossAmount - (grossAmount * discount5DaysMore);
		}
		else if (daysReserved >= 3)
		{
			totAmount = grossAmount - (grossAmount * discount3To4Days);
		}
		else
		{
			totAmount = grossAmount;
		}
		
		System.out.println();
		System.out.println("Room Charge per day is Rs.48000/= ");
		System.out.println("Number of Days Reserved : " + daysReserved);
		System.out.println("Total Amount to be paid : Rs. " + totAmount + " /=");
	}
}

		
		