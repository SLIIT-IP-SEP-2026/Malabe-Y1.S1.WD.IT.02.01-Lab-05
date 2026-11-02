import java.util.Scanner;

public class IT26102554Lab5Q2{
    public static void main(String[] args){
	int numofMembers;
		
	Scanner input = new Scanner(System.in);
	System.out.println("INPUT Number of New Members introduced:");
		numofMembers = input.next().charAt(0);
		
		switch(numofMembers)
		{
			case'0' : System.out.println("No prize");
			break;
			
		case'1' : System.out.println("The prize is a Pen");
		break;
		
		case'2': System.out.println("The prize is a Umbrella");
		break;
		
		case'3': System.out.println("The prize is a Bag");
		break;
		
		case'4': System.out.println("The prize is a Travelling Chair");
		break;
		
		default :
		if (numofMembers>=5)
		{
			System.out.println("The prize is a Headphone");
		}
		else
		{
			System.out.println("input nuber must be 0 or higher");
		}
		break;
		}
	}
}