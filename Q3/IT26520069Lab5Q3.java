
import java.util.Scanner;

public class IT26520069Lab5Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double ROOM_CHARGE = 48000.00;
        final double DISCOUNT_10 = 0.10;
        final double DISCOUNT_20 = 0.20;

        System.out.print("Enter start date: ");
        int startDate = input.nextInt();

        System.out.print("Enter end date: ");
        int endDate = input.nextInt();

        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31) {
            System.out.println("Invalid date");
            input.close();
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Start date must be less than end date");
            input.close();
            return;
        }

        int days = endDate - startDate;
        double discount = 0;

        if (days >= 3 && days <= 4) {
            discount = DISCOUNT_10;
        } else if (days >= 5) {
            discount = DISCOUNT_20;
        }

        double total = days * ROOM_CHARGE;
        double discountAmount = total * discount;
        double amountToPay = total - discountAmount;

        System.out.println("Days reserved: " + days);
        System.out.println("Room charge: Rs. " + total);
        System.out.println("Discount: Rs. " + discountAmount);
        System.out.println("Total amount to pay: Rs. " + amountToPay);

        input.close();
    }
}
