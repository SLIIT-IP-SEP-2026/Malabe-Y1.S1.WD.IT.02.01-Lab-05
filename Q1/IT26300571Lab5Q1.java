import java.util.Scanner ;
public class IT26300571Lab5Q1 {
	public static void main (String[]args) {
		int num1, num2, num3, smallest, largest ;
		Scanner input = new Scanner (System.in);
		 
		 System.out.println( " Enter the first integer" );
		 num1 = input.nextInt();
		 
		 System.out.println( " Enter the Second integer" );
		 num2 = input.nextInt();
		 
		 System.out.println( " Enter the Third integer" );
		 num3 = input.nextInt();
		
		 
		 smallest = num1;
         largest = num2;

             if (num2 > smallest){
                 smallest = num2;
			 }
			 
             if (num2 > largest){
                 largest = num2;
			 } 	
			 
			 if (num3 > smallest) {
				 smallest = num3;
			 }
			 if (num3 > largest) {
				 largest = num3;
			 }
			 
			 System.out.print( " User input numbers are :" + num1 + " " + num2 + " " + num3 );
			 System.out.println( " The smallest number is :" + smallest);
			 System.out.println( " the largest number is :" + largest);
			 
			 
	
	}
}
			 
			 