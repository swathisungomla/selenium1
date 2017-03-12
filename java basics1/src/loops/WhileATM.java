package loops;

import java.util.Scanner;

public class WhileATM {

	public static void main(String[] args) {
		
		 int Actualpin = 3457;
		
		
		System.out.println(" Welcome to ATM");
		System.out.println("please enter your pin");
		 Scanner k = new Scanner(System.in);
		 int input = k.nextInt();
		  
		 while(input != Actualpin){
			 System.out.println("incorrect pin, please try again");
			 System.out.println(" please enter the pin");
			 input = k.nextInt();
		 }
		 
		 System.out.println("pin accepted, welcome to homepage");
		 
		
	}

}
