import java.util.Scanner;
public class IT26101731Lab5Q2{
	public static void main(String[] args){
	int numOfMembers;
	
	Scanner input=new Scanner(System.in);
    System.out.print("Enter the number of new members introduced:");
    numOfMembers=input.nextInt();
	
	switch(numOfMembers){
		case 0 : System.out.print("No prize");
		break;
		case 1 : System.out.print("Prize is a : pen");
		break;
		case 2 : System.out.print("Prize is a : umbrella");
		break;
		case 3 : System.out.print("Prize is a : bag");
		break;
		case 4 : System.out.print("Prize is a : travelling chair");
		break;
		default :
		    if(numOfMembers>=5){
				System.out.print("Prize is a : headphone");
			}else{
				System.out.print("Input must be a number 0 or greater");
			}
				
	    }
	}
}
