import java.util.Scanner;
 public class Lab5Q1{
  public static void main(String[] args){
   
   Scanner input = new Scanner(System.in); 
   
   System.out.println("Enter the first integer :");
   int num1 = input.nextInt();
   
    System.out.println("Enter the second integer :");
   int num2 = input.nextInt();
   
    System.out.println("Enter the third integer :");
   int num3 = input.nextInt();
   
    System.out.println("User entered numbers are :" + num1 + " " + num2 + " " + num3 );
	
	// Assigning smallest and largest to 'num1' initially 
	int smallest = num1;
	int largest = num1;
	
	// Comapare 'num2' with largest and smallest
	if(num2<smallest)
	{ smallest = num2;}
     
	if(num2>largest)
	{ largest = num2;}

    // Compare 'num3' with smallest and largest
	if(num3<smallest)
	{ smallest = num3;}
     
	if(num3>largest)
	{ largest = num3;}

    // Display the result 
	 System.out.println( );
	 System.out.println("User entered numbers are :" + " " + num1 + " " +  num2 + " " + num3 );
	 System.out.println("The smallest number is : " + smallest);
	 System.out.println("The largest number is : " + largest);

		
  }
 }