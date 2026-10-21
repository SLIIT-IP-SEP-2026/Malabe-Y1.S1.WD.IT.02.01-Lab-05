import java.util.Scanner;
	public class IT26102684Lab5Q2{
		public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of new members introduced :");
		
		int numbers = input.nextInt();
		
		if(numbers<0){
		System.out.println("Input must be 0 or greater :");
		
		} else {
	
			
			switch(numbers){
				
					case 0 : 
						System.out.println("No prize");
						break;
						
					case 1 : 
						System.out.println("The price is : Pen");
						break;
						
					case 2 : 
						System.out.println("The price is : Umbrella");
						break;	
						
					case 3 : 
						System.out.println("The price is : Bag");
						break;
						
					case 4 : 
						System.out.println("The price is : Travelling Chair");
						break;		

						
					default:
					System.out.println("The price is : headphone");
					}
		
		
		}
		input.close();	
		
		
		}
	
	}