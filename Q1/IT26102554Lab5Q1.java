import java.util.Scanner;

public class IT26102554Lab5Q1{
    public static void main(String[] args){
		
         int num1,num2,num3,samllest,largest;
        
		Scanner input = new Scanner(System.in);
		 System.out.println("INPUT First INTERGER");
		 num1=input.nextInt();
		 
		 System.out.println("INPUT Second INTERGER");
		 num2=input.nextInt();
		 
		 System.out.println("INPUT Third INTERGER");
		 num3=input.nextInt();
		 
		 samllest=num1;
		 largest=num1;
		 
		 if(num2<samllest){
			 samllest=num2;
		 }
		if(num2>largest){
			 largest=num2;
		}

        if(num3<samllest){
			 samllest=num3;
		 }
		if(num3>largest){
			 largest=num3;
		}
		
		System.out.println();
		System.out.println("User entrered numbers are :"+ num1 +  num2 +  num3);
		System.out.println("The samllest number is "+samllest);
		System.out.println("The largest number is "+largest);
		}
}