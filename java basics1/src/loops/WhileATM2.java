package loops;

import java.util.Scanner;

public class WhileATM2 {

	public static void main(String[] args) {
		
		int Actualpin = 1122;
		 int tries = 0;
		
System.out.println(" welcome to home page");
System.out.println("please enter the pin");
   Scanner k = new Scanner(System.in);
   int input = k.nextInt();
   
   
   
   while((input != Actualpin) && (tries<3)){
	   System.out.println("incorrect pin, try again");
	   System.out.println("please enter your pin again");
	    input = k.nextInt();
	    tries++;
   }
   if(tries== 3){
   System.out.println(" sorry you have exceeded maximum tries");
   }
   else
   {
	   System.out.println("you have entered correct pin");
	   
   }
   
   
   

	}

}
