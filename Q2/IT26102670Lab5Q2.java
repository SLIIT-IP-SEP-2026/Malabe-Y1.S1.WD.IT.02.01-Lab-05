import java.util.Scanner;
public class  IT26102670Lab5Q2
{
	public static void main(String[] args)
	
	{
		Scanner nim = new Scanner(System.in);
		
		System.out.print("Enter the number of new members introduced:");
		int numOfmembers = nim.nextInt();
		
		switch(numOfmembers)
		{
		case '0' : System.out.print("No Prize");
		break;
		
		case '1' : System.out.print("The prize is a : Pen");
		break;
		
		case '2' : System.out.print("The prize is a : Umbrella");
		break;
		
		case '3' : System.out.print("The prize is a : Bag");
		break;
		
		case '4' : System.out.print("The prize is a : Travelling Chair");
		break;
		
		default :
			if(numOfmembers >= 5)
				 
				 {
					 System.out.print("The prize is a : Headphone");
				 }
				 else
				 {
					 System.out.print("Input number must be 0 or greater");
				 }
				 break;
		}
	}
}
	