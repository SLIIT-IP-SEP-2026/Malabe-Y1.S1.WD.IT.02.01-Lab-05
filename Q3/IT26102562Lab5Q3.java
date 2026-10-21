import java.util.Scanner;

public class IT26102562Lab5Q3
{
	public static void main(String [] args)
	{
		int strtDate, endDate;
		double amountToBePaid;
		final double chargePerDay = 48000.00;
		final double discount3_4days = 0.9;
		final double discount5_or_more_days = 0.8;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter the Start Date");
		strtDate = input.nextInt();
		
		System.out.println("Enter the End Date");
		endDate = input.nextInt();
		
		if (strtDate < 1 || strtDate > 31 || endDate < 1 || endDate > 31 )
		{
			System.out.print("Days must be between 1 and 31");
			return;
		}
		
		if (strtDate>endDate)
		{
			System.out.print("Start Date must be less than End Date");
			return;
		}
		
		int numOfDays = endDate - strtDate;
		
		if (numOfDays < 3)
		{
			amountToBePaid = numOfDays*chargePerDay;
		}
		
		else if (numOfDays >= 3 && numOfDays <= 4)
		{
			amountToBePaid= numOfDays*chargePerDay*discount3_4days;
		}
		
		else
		{
			amountToBePaid = numOfDays*chargePerDay*discount5_or_more_days;
		}
		
		System.out.println("Room charges per day: Rs. " + chargePerDay + "/=");
		System.out.println("Number of Days Reserved: " + numOfDays);
		System.out.println("Total amount to be paid: " + amountToBePaid);
		
	}
}