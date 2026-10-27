import java.util.Scanner;

public class IT26102467Lab5Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double roomcharge = 48000;

        System.out.print("Enter start Date (1-31):");
        int sdate = input.nextInt();

        System.out.print("Enter End Date (1-31):");
        int edate = input.nextInt();

        if (sdate < 1 || sdate > 31 || edate < 1 || edate > 31) {
            System.out.print("Error : Date must be between 1 and 31.");
            return;
        }
        if (sdate >= edate) {
            System.out.print("Error : Start date must be less than End date.");
            return;
        }

        int daysReserved = edate - sdate;
        double grossAmount = roomcharge * daysReserved;

        double discountrate = 0.0;

        if (daysReserved > 5) {
            discountrate = 20.0;
        } else if (daysReserved >= 3) {
            discountrate = 10.0;
        } else {
            discountrate = 0.0;
        }

        discountrate /= 100.0;  

        double discountAmount = grossAmount * discountrate;

        double totBill = grossAmount - discountAmount;

        System.out.print("\n");
        System.out.println("Room Charge for a Day is Rs. 48000/=");
        System.out.println("No of Days Reserved is " + daysReserved + " days.");
        System.out.println("The Total Amount for your Stay is Rs. " + totBill + "/=");

        input.close();
    }
}