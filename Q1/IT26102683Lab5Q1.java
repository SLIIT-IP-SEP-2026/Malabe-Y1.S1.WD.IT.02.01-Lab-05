import java.util.Scanner;
public class IT26102683Lab5Q1{
	public static void main (String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input the First integer:");
		int num1 = input.nextInt();
		
		System.out.print("Input the second integer:");
		int num2 = input.nextInt();
		
		System.out.print("Input the Third integer:");
		int num3 = input.nextInt();
		
		System.out.println( "User entered numbers are:"+ num1+" " + num2+" "+ num3+" ");
		
		if (num1<num2 && num1<num2){
			System.out.println("The Smallest number is:"+num1);
		}
		else if (num2<num1 && num2<num3){
			System.out.println("The Smallest number is:"+num2);
		}
		else{
			System.out.println("The Smallest number is:"+num3);
		}
		
		
		
		if (num1>num2 && num1>num2){
			System.out.println("The Largest number is:"+num1);
		}
		else if (num2>num1 && num2>num3){
			System.out.println("The Largest number is:"+num2);
		}
		else{
			System.out.println("The Largest number is:"+num3);
		}
		
		
		
		
	}
}
		
		
		
		