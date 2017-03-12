package demo;

import java.util.Scanner;

public class AtmDemo {

	public static void main(String[] args) {
		        
		     /* this program is for taking input from user and printing it*/
		
		System.out.println("enter your pin :");
		Scanner k = new Scanner(System.in);   // here we used Scanner class to give input at runtime
		int pin = k.nextInt();          // we imported scanner class from util package
		
		
		System.out.println("you have entered your pin as :"  + pin);
		
		
		System.out.println("enter your name :");
		Scanner k1 = new Scanner(System.in);
		String name = k1.nextLine();
		
		System.out.println("you have entered your name as :" + name);
		
	}

}
