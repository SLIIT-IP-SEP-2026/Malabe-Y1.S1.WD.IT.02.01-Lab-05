import java.util.Scanner;
public class IT26102411Lab5Q1{
  public static void main(String[]args){
   Scanner input = new Scanner(System.in);
  
   System.out.print("Enter the first integer:");
   int num1 = input.nextInt();

   System.out.print("Enter the second integer:");
   int num2 = input.nextInt();

   System.out.print("Enter the third integer:");
   int num3 = input.nextInt();

   System.out.println("Enter your numbers are:"+num1 +" " + num2+" " +num3);
   
   int min = num1;
   int max = num1;
    
   if(num2<min){
      System.out.println("The smallest number is"+num2);
    }
   else if(num3<min){
      System.out.println("The smallest number is"+num3);
    }
    else{
      System.out.println("The smallest number is"+num1);
      }




    if(num2>max){
	   System.out.println("The Largest number is"+num2);
	 }
	else if(num3>max){
      System.out.println("The Largest number is"+num3);
     }  
	else{
	  System.out.println("The Largest number is"+num1);
	 }
	
	
	
	
  }
}