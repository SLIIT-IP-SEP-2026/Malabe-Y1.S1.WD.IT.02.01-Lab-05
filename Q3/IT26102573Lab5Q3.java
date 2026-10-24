import java.util.Scanner;

public class IT26102573Lab5Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double ROOM_CHARGE_PER_DAY = 48000.00;
        final double DISCOUNT_3_TO_4_DAYS = 0.1;
        final double DISCOUNT_5_OR_MORE_DAYS = 0.2;

        int startDate, endDate, numberOfDaysReserved;
        double totalAmountBeforeDiscount, discountAmount, totalAmountToBePaid;
        double discountRate = 0;

        System.out.println("Enter StartDate (1-31): ");
        startDate = sc.nextInt();

        System.out.println("Enter End Date (1-31): ");
        endDate = sc.nextInt();

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        numberOfDaysReserved = endDate - startDate;

        if (numberOfDaysReserved >= 3 && numberOfDaysReserved <= 4) {
            discountRate = DISCOUNT_3_TO_4_DAYS;
        } else if (numberOfDaysReserved >= 5) {
            discountRate = DISCOUNT_5_OR_MORE_DAYS;
        }

        totalAmountBeforeDiscount = numberOfDaysReserved * ROOM_CHARGE_PER_DAY;
        discountAmount = totalAmountBeforeDiscount * discountRate;
        totalAmountToBePaid = totalAmountBeforeDiscount - discountAmount;

        System.out.println();
        System.out.println("Room Charge per Day: Rs." + ROOM_CHARGE_PER_DAY + "/-");
        System.out.println("Number of Days Reserved: " + numberOfDaysReserved);
        System.out.println("Total Amount to be Paid: " + totalAmountToBePaid);
    }
}