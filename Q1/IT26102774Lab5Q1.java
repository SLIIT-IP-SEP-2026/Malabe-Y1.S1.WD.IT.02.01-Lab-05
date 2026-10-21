import java.util.Scanner;
public class IT26102774Lab5Q1 {
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Input first integer");
	int num1 = input.nextInt();
	
	System.out.println("Input second integer");
	int num2 = input.nextInt();
	
	System.out.println("Input third integer");
	int num3 = input.nextInt();
	
	int smallest = num1;
	int largest = num1;
	
	if (num2 < smallest){
		smallest = num2;
	}
	if (num3 < smallest){
		smallest = num3;
	}
	if (num2 > largest){
		largest = num2;
	}
	if (num3 > largest){
		largest = num3;
	}
	
	System.out.println("User entered numbers are: "+ num1 + " " + num2 + " " + num3);
	System.out.println("Smallest number: "+ smallest);
	System.out.println("Largest number: "+ largest);
	
	}
}
