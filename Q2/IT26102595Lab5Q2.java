import java.util.Scanner;
 public class IT26102595Lab5Q2{
  public static void main(String[] args){
  
   int numofmembers;
   
    Scanner input = new Scanner(System.in);

  System.out.print("Enter the number of new members introduced:");
  numofmembers= input.next().charAt(0);
   
   switch(numofmembers)
   {
   case'0' : System.out.print("No price");
   break;
    
   case'1' : System.out.print("The price is a pen");
   break;
   
   case'2' : System.out.print("The price is an u8mbrella");
   break;
   
   case'3' : System.out.print("The price is a bag");
   break;
   
   case'4' : System.out.print("The price is a travelling chair");
   break;
   
   
  default : 
        if(numofmembers >= 5)
		{
		 System.out.print("The price is a headphone");
		}
		else
		{
			System.out.print("input number must be 0 or greater");
		}
		
		
		  break;
 
 
 
   }
  }
 }