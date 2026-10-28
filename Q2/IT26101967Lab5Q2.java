import java.util.Scanner;
public class IT26101967Lab5Q2{
public static void main(String[] args){
int numMembers;
Scanner input=new Scanner(System.in);

System.out.println("Enter the number of new members introduced:");
numMembers=input.nextInt();

switch(numMembers){
case 0:
System.out.println();
System.out.println("No prize");
    break;
	case 1:
	System.out.println();
	System.out.println("Prize is a :pen");
	break;
	
	case 2:
	System.out.println();
	System.out.println("prize is a :umbrella");
	break;
	
	case 3:
	System.out.println();
	System.out.println("prize is a:bag");
	break;
	
	case 4:
	System.out.println();
	System.out.println("prize is a :travelling chair");
	break;
	
	default:
	if(numMembers>=5){
		
		System.out.println();
		System.out.println("Prize is a: Headphone");
		
		
		
	}
	else{
		
		System.out.println("Input number must be a zero or greater");
	}
	
	break;





}





}





}
