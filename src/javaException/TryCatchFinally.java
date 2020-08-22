package javaException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinally {

	public static void main(String[] args) {
		

		//Try Catch block
		
		try{
			System.out.println("This is division calculator");
			Scanner userInput = new Scanner(System.in);
			
			System.out.println("Give me the first Number");
			int a = userInput.nextInt();
			
			System.out.println("Give me the second Number");
			int b = userInput.nextInt();
			
			System.out.println("Result: " + a/b);
		}
		catch(ArithmeticException e){
			//e.printStackTrace();
			System.out.println("Try running again, i think your 2nd input was 0. And thats not possible!");
		}
		finally{
			System.out.println("Finally block");
		}
		
		
		System.out.println("rest of my code - after try catch");

	}
}

//Javac filename.java >> checked exception
//Java filename >> unchecked exception
