import java.util.Scanner;
 public class IT26102573Lab5Q1{
	 public static void main(String[]args){
		 
		 Scanner sc = new Scanner(System.in);
		 
		 int num1,num2,num3,smallest,largest;
		 
		 System.out.println("Input first intiger");
		 num1=sc.nextInt();
		 
		 System.out.println("Input second intiger");
		 num2=sc.nextInt();
		 
		 System.out.println("Input third intiger");
		 num3=sc.nextInt();
		 
		 
		 
		 
		System.out.println("User entered numbers are:"+" "+num1+" "+num2+" "+num3+" ");
		 
		 
		largest = num1;
		smallest = num1;
		 
		 if (num2 > largest){
			 largest = num2;
		 }
		 
		if (num3 > largest){
			largest = num3;
		}
		System.out.println("The largest number are:"+largest);
		
		if (num2 < smallest){
			smallest = num2;
		}
			
			
		if(num3 < smallest){
			smallest = num3;
			
		}
		System.out.println("The smallest number are:"+smallest);
		
		
	 }
 }
			
			
		 