import java.util.Scanner;
 public class Lab5Q2{
  public static void main(String[] args){
  
  Scanner input = new Scanner(System.in);
  
  System.out.println("Enter the number of new members introduced :");
  int num = input.nextInt()
  
  switch (num)
  {
   case '5':
   System.out.println();
    System.out.println("Prize is a : Headphone");
	break;
	
   case '4':
   System.out.println();
    System.out.println("Prize is a : Travelling chair");
	break;
	
   case '3':
   System.out.println();
    System.out.println("Prize is a : Bag");
	break;
   
   case '2':
   System.out.println();
    System.out.println("Prize is a : Umbrella");
	break;
	
   case '1':
   System.out.println();
    System.out.println("Prize is a : Pen");
	break;
	
   case '0':
   System.out.println();
    System.out.println("No price ");
	break;
	
   default :
        if (num>=5) {
		 	System.out.println();
		    System.out.println("Prize is a : Headphone");}
		else { 
		// Invalid input (Negative number)
		System.out.println("Input must be a number 0 or greater ");}
   }
  }
 }
 