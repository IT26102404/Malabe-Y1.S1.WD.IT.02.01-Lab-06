import java.util.Scanner;
 public class IT26102404Lab6Q3 {
  public static void main (String[] args) {
  Scanner input = new Scanner(System.in);
  
  int number;
  int sumOfSquare=0, count=0;
  double meanOfSquare,rms;
  System.out.println("Enter positive number (Terminate with -99):");
  number = input.nextInt();
  
  while (number!=-99){
   if (number>0){
     count++;
	 sumOfSquare=sumOfSquare +(number*number);
	 System.out.print("\n Enter positive number(Terminate with -99):");
	 number = input.nextInt();
	}
   else
    {
       System.out.println("Invalid input");
        break;	   
	