import java.util.Scanner;
public class IT26510428Lab5Q3{
	public static final double Roomperday= 48000.0;
	public static final double three_fourDiscount= 0.1;
	public static final double fiveormore= 0.2;
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Start date(1-31): ");
		int startdate=input.nextInt();
		System.out.println("Enter End date(1-31): ");
		int enddate=input.nextInt();
		if (startdate<1||startdate>31||enddate<1||enddate>31){
			System.out.println("Days must be between 1 and 31");
			return;
		}
		if (startdate>=enddate){
			System.out.println("Start Date must be less than End Date");
			return;
		}
		
		int days=(enddate-startdate);
		double base=Roomperday*days;
		double discountrate=0.0;
		if (days>=3&&days<=4){
			discountrate= three_fourDiscount;
		}
		else if(days>=5)
		{
			discountrate= fiveormore;
		}
		double total=base-base*discountrate;
		System.out.println("Room Charge Per Day: Rs. "+Roomperday);
		System.out.println("Number of Days Reserved: "+days);
		System.out.println("Total Amount to be paid: "+total);

	}
}
		
		
