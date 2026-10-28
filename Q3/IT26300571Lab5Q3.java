import java.util.Scanner;
public class IT26300571Lab5Q3 {
	public static void main ( String[]args) {
		int startDate, endDate, numberOfDaysReserved ;
		double totalAmountBeforeDiscount,totalAmountToBePaid, discountAmount;
		
		final double discount3To4Days = 0.1;
		final double discount5OrMoreDays = 0.2;
		final double roomChargePerDay = 48000.0;
		
		double discountRate =0;
		
		Scanner input = new Scanner ( System.in);
		
		System.out.print( " Enter the start date (1-31)");
		startDate = input.nextInt();
		
		System.out.println( " Enter the end date (1-31) ");
		endDate = input.nextInt();
		
		if (startDate <  1 || startDate > 31 || endDate < 1 || endDate > 31){
		System.out.println( " Days must be between 1 and 31 ");
		
		return;
		}
		
		
	if ( startDate >= endDate ) {
		System.out.println(" Start date must be less than the end date");
		
		return;
	}
	
	numberOfDaysReserved = endDate - startDate;
	
	 if (numberOfDaysReserved >= 3 && numberOfDaysReserved <= 4) {
		discountRate = discount3To4Days;
	 }
	else if (numberOfDaysReserved >= 5) {
		discountRate = discount5OrMoreDays;
	}
	
	totalAmountBeforeDiscount = numberOfDaysReserved* roomChargePerDay;
	discountAmount = totalAmountBeforeDiscount* discountRate;
	totalAmountToBePaid = totalAmountBeforeDiscount - discountAmount;
	
	System.out.println( " Room charges per day : Rs. " + roomChargePerDay + "/=");
	System.out.println( " Total discount Amount is : Rs. " + discountAmount + "/=");
	System.out.println( " Total Amount to be Paid is Rs. " + totalAmountToBePaid + "/=");
		
	}
}

	
		
		
		