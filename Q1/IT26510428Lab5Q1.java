import java.util.Scanner;
public class IT26510428Lab5Q1{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first integer: ");
		int first=input.nextInt();
		System.out.println("Enter the second integer: ");
		int second=input.nextInt();
		System.out.println("Enter the third integer: ");
		int third=input.nextInt();
		System.out.println();
		System.out.println("User entered numbers are: "+first+" "+second+" "+third);
		int smallest=first;
		if (smallest>second){
			smallest=second;
		}
		if (smallest>third){
			smallest=third;
		}
		int largest=first;
		if (largest<second){
			largest=second;
		}
		if (largest<third){
			largest=third;
		}
		System.out.println("The Smallest Number is: "+smallest);
		System.out.println("The Largest Number is: "+largest);
	}
}
		
	
		
			
		
		