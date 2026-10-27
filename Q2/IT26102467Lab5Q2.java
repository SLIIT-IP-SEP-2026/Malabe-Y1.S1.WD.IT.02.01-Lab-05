import java.util.Scanner;
public class IT26102467Lab5Q2{
  public static void main(String[]args){
  Scanner input = new Scanner(System.in);

  System.out.print("Enter the number of new members introduced:");
  int member = input.nextInt();

  if(member<0){
     System.out.print("No prize");
   }
  else{
    switch(member){
      case 0:
	    System.out.print("No Prize");
		break;
      case 1:
        System.out.print("Your prize is :pen");
		break;
      case 2:
        System.out.print("Your prize is:Umberlla");
		break;
      case 3:
        System.out.print("Your prize is:Bag");
		break;
      case 4:
        System.out.print("Your prize is:Traelling Chair");
		break;
      default:
        System.out.print("Your prize is: Headphone");
        break;


      }









   }









   }
}