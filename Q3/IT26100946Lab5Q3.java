import java.util.Scanner;

public class IT26100946Lab5Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double roomprice = 48000.0;

        System.out.print("Enter start Ddate (1-31): ");
        int startDate = sc.nextInt();  
        System.out.print("Enter end date (1-31): ");
        int endDate = sc.nextInt();
        
        
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error  Days must be between 1 and 31");
            return;
        }
        
        
        if (startDate >= endDate) {
            System.out.println("Error  Start Date must be less than End Date");
            return;
        }
        
        
        int stay = endDate - startDate;
        

        double discount = 0.0;
        if (stay >= 5) {
            discount = 0.20; 
        } else if (stay >= 3 ) {
            discount = 0.10; 
        } else {
            discount = 0.0;  
        }
        

        double totalamount = (roomprice * stay) * (1.0 - discount);
        
        System.out.println("\n"); 
        System.out.println("Room Charge Per Day: Rs. " + roomprice );
        System.out.println("Number of Days Reserved: " + stay);
        System.out.println("Total Amount to be Paid: " + totalamount);
        
        sc.close();
    }
}