import java.util.Scanner ;
public class IT26102449Lab5Q1 {
	public static void main (String[]args) {
		int num1,num2,num3,smallest,largest ;
		
		Scanner input = new Scanner (System.in) ;
		
		System.out.println("Enter first integer") ;
		num1=input.nextInt();
		
	    System.out.println("Enter second integer") ;
		num2=input.nextInt();
		
		System.out.println("Enter third integer") ;
		num3=input.nextInt();
		
		System.out.println("User entered numbers are: "+num1+" "+num2+" "+num3);
		
		smallest = num1 ;
		
		if (smallest > num2 ){
			smallest=num2 ;
		}	
		
		if (smallest > num3 ){
			smallest=num3 ;
		}
			
	    largest = num1 ;
			
			if (largest > num2 ){
			largest=num3 ;
			}
			
			if (largest > num3 ){
			largest=num3 ;
			
			}
		System.out.println("The Smallest Number is : "+smallest);
		System.out.println("The largest Number is : "+largest);
		
		
		
	}
}

		
		
		