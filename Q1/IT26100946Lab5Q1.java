import java.util.Scanner;

public class IT26100946Lab5Q1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();

        System.out.println("\n");
        System.out.println("User entered numbers are : " + num1 + " " + num2 + " " + num3);
		
        int smallest = num1;
        int largest = num1;
		
        if (num2 < smallest) {
            
			smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
			
			
        }

        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            
			largest = num3;
        }

        System.out.println("The Smallest number is: " + smallest);
        System.out.println("The Largest number is: " + largest);

        sc.close();
    }
}