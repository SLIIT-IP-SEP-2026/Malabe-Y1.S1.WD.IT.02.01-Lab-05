import java.util.Scanner;
public class IT26101967Lab5Q1{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first number:");
		double First_number=input.nextDouble();
		System.out.println("Enter the second number:");
		double Second_number=input.nextDouble();
		System.out.println("Enter the third number");
		double Third_number=input.nextDouble();
		
	double smallest=First_number;
	double largest=First_number;
	
	
	
	if(Second_number>largest){
		largest=Second_number;
	
		
		
		
	}

	if(Third_number>largest){
		largest=Third_number;
		
	}
	if(Second_number<smallest){
		smallest=Second_number;
		
		
	}	
	if(Third_number<smallest){
		smallest=Third_number;
		
		
	}
	System.out.println("User entered numbers are:"+First_number+" "+Second_number+" "+Third_number);
	System.out.println("the smallest number"+smallest);
	System.out.println("the largest number "+largest);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}