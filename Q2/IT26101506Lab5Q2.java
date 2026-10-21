import java.util.Scanner;
public class IT26101506Lab5Q2{
	public static void main(String[] args){
	
	    Scanner input = new Scanner(System.in);
		
		int num;
	
	    System.out.print("Enter the number of new members introduced : ");
	    num = input.nextInt();
	
	    switch(num){
		    case 0 : System.out.print("No Prize");
		                  break;
				 
		    case 1 : System.out.print("Pen");
		                  break;
				 
		    case 2 : System.out.print("Umbrella");
		                  break;
				 
		    case 3 : System.out.print("Bag");
		                  break;		 
				 
	        case 4 : System.out.print("Travelling Chair");
		                  break;
				 
	        default :
                     if(num >= 5){
					  System.out.print("Headphone");
					 }
					 
					 else{
					  System.out.print("Should be greater or equal to 0");
					 }
					 break;
		}
	}
}
					 
	