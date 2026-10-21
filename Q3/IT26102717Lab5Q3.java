import java.util.Scanner;
public class IT26102717Lab5Q3{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Start Date (1 - 31): ");
		int Startdate = input.nextInt();
		
		System.out.print("Enter End Date (1 - 31): ");
		int Enddate = input.nextInt();
		
		if(Startdate>31 || Startdate<1 || Enddate<1 || Enddate>31){
			System.out.println("Error : Days must be between 1 and 31.");
		}
		else{
			if(Startdate>Enddate){
				System.out.println("Error : Start date must be less than End date.");
			}
			else{
				System.out.println("Room charge per day : Rs. 48000.0/=");
				int num = (Enddate - Startdate);
				System.out.println("Number of days reserved : " + num);
				if(num<3){
					double total = (num * 48000);
					System.out.println("Total amount to be paid : "+total+"/=");
				}
				else if(3<= num && num<=4){
					double total = (num * 48000);
					double discount = ((total * 90)/100);
					System.out.println("Total amount to be paid : "+discount+"/=");
				}
				else{
					double total = (num * 48000);
					double discount = ((total * 80)/100);
					System.out.println("Total amount to be paid : "+discount+"/=");
				}
			}
		}
		
	}
}