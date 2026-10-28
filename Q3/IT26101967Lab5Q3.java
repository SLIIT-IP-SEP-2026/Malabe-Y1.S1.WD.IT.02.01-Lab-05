
import java.util.Scanner;

public class IT26101967Lab5Q3 {
    public static void main(String[] args) {

        final double ROOM_CHARGE = 48000.00;
        final double DISCOUNT_10 = 10.0;
        final double DISCOUNT_20 = 20.0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();

        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
        }
        else if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
        }
        else {
            int daysReserved = endDate - startDate;
            double totalAmount = daysReserved * ROOM_CHARGE;

            if (daysReserved >= 3 && daysReserved <= 4) {
                totalAmount = totalAmount - (totalAmount * DISCOUNT_10 / 100);
            }
            else if (daysReserved >= 5) {
                totalAmount = totalAmount - (totalAmount * DISCOUNT_20 / 100);
            }

            System.out.println();
            System.out.printf("Room Charge Per Day: Rs. %.2f%n", ROOM_CHARGE);
            System.out.println("Number of Days Reserved: " + daysReserved);
            System.out.printf("Total Amount to be Paid: Rs. %.2f%n", totalAmount);
        }

        input.close();
    }
}
