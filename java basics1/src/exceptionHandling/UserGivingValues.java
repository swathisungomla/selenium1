package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserGivingValues {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		try{
		System.out.println("enter the first number : ");
		int num1= k.nextInt();
		System.out.println("enter the second number : ");
		int num2 = k.nextInt();
		int num3 = num1/num2;
		System.out.println("the division is : " + num3);	
	}
		catch(ArithmeticException e){
			System.out.println("cannot put zero as denominator. please try again");
		}
		catch(InputMismatchException e){
			System.out.println("please enter integer only");
		}
		catch(Exception e){
			System.out.println("enter a valid number");
		}
		
	}
}


