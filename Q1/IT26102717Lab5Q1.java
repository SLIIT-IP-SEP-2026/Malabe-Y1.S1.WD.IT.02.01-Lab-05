import java.util.Scanner;
public class IT26102717Lab5Q1{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first integer :");
		int a = input.nextInt();
		
		
		System.out.print("Enter the second integer :");
		int b = input.nextInt();
		
		
		System.out.print("Enter the third integer :");
		int c = input.nextInt();
		
		System.out.println();
		System.out.println("User entered numbers are : "+ a +" "+ b + " " + c  );
		
		
		if(a<b && a<c){
			System.out.println("The smallest number is : "+ a );
		}
		else if(b<a && b<c){
			System.out.println("The smallest number is : "+ b );
		}
		else{
			System.out.println("The smallest number is : "+ c );
		}
		
		
		if(a>b && a>c){
			System.out.println("The largest number is : "+ a );
		}
		else if(b>a && b>c){
			System.out.println("The largest number is : "+ b );
		}
		else{
			System.out.println("The largest number is : "+ c );
		}
		
		
		
		
		
		
	}
}