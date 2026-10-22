import java.util.Scanner;
public class IT26300571Lab5Q2 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter the number of members introduced");
		int members = input.nextInt();
		
		if (members = 0) {
		System.out.println(" No prize");
		int prize = input.nextInt();
		} 
		if (members = 1) {
		System.out.println(" Prize is a : Pen");
		int prize = input.nextInt();
		}
		if (members = 2) {
		System.out.println(" Prize is a : Umbrella");
		int prize = input.nextInt();
		}
		if (members = 3) {
		System.out.println(" Prize is a : Bag");
		int prize = input.nextInt();
		}
		if (members = 4) {
		System.out.println(" Prize is a :Travelling chair");
		int prize = input.nextInt();
		}
		if (members >= 5) {
		System.out.println(" Prize is a : Headphone");
		int prize = input.nextInt();
		}
		else {
		System.out.print(" Input must be a number 0 or greater"):
		}
	}
}