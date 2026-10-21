import java.util.Scanner;
public class IT26102717Lab5Q2{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter the number of new members introduced : ");
		int num = input.nextInt();
		
		
		switch(num)
		{
			
			case 0 : System.out.println("No prize");
			          break;
			case 1 : System.out.println("Prize is a : pen");
			          break;
			case 2 : System.out.println("Prize is a : Umbrella");
			          break;
			case 3 : System.out.println("Prize is a : Bag");
			          break;
			case 4 : System.out.println("Prize is a : Travelling chair");
			          break;
			default :
			          if(num >= 5){
						  System.out.println("Prize is a : Headphone");
					  }
					  else {
						  System.out.println("Input must be a number 0 or greater");
					  }
					  break;
		} 
	}
}