import java.util.Scanner;
 public class IT26102554Lab5Q3{
  public static void main(String[] args){
  
  final double Room_charge = 48000.0;
  final double dis_3_4_days = 0.9;
  final double dis_5_more = 0.8;
  Scanner input = new Scanner(System.in);
  
  
  System.out.println("Enter start date (1-31) :");
  int start = input.nextInt();
  if (start < 1 || start > 31) {
	  System.out.println("Days must be between 1 and 31");
      return;}
	  
  
  System.out.println("Enter end date (1-31) :");
  int end = input.nextInt();
  if (start < 1 || start > 31) {
	  System.out.println("Days must be between 1 and 31");
      return; }
  
  
  System.out.println("Room charge per day : Rs." + Room_charge + "/=" );
  
  if (start > end) {
	  System.out.println("Start date must be less than the end date");
      return;}
	  
  int duration = end - start;
  
  System.out.println("Number of days reserved :" + duration );
  
  if (duration<3){
   System.out.println("Total amount to be paid :" + Room_charge * duration);}
  else if (duration == 3 || duration == 4){
  System.out.println("Total amount to be paid :" + Room_charge * duration * dis_3_4_days);}
  else{ 
  System.out.println("Total amount to be paid :" + Room_charge * duration * dis_5_more);}
 }
}
