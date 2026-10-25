import java.util.Scanner;
public class IT26102683Lab5Q3old{
	public static void main(String[] args){
		Scanner input =  new  Scanner(System.in);
		
		System.out.print("Enter Start date (1-31):");
		int start_date = input.nextInt();
		
		System.out.print("Enter End date (1-31):");
		int end_date = input.nextInt();
		
		if (start_date <1 || start_date>31 || end_date<1 || end_date>31){
			System.out.println ("Error: Days must be between 1 and 31");
			return;
		}
		
		else if (start_date>=end_date){
			System.out.println ("Error:  Start date should be less than the end date");
			return;
		}
		
		
		final double room_charge = 48000.0;
		final double discount_3_to_4_days = 0.1;
		final double discount_5_or_more = 0.2;
		
		double discount_rate = 0;
		
		System.out.println("Room Charge per day:"+room_charge);
		
		int reserved_days = (end_date - start_date);
		System.out.println("Number of Days Reserved:"+reserved_days);
		
		if (reserved_days<3){
			discount_rate=0;
		}
		else if (reserved_days>=3 && reserved_days<=4){
			discount_rate = discount_3_to_4_days;
		}
		else if (reserved_days>= 5){
			discount_rate = discount_5_or_more;
		}
		
		
		double totalAmount_BD = reserved_days*room_charge;
		double discount_amount = totalAmount_BD * discount_rate;
		
		double totalAmount_AD = totalAmount_BD - discount_amount;
		
		System.out.println("Total Amount to be paid:"+totalAmount_AD);
		
		
		
		
		
		
			
		
		
	}
}
		