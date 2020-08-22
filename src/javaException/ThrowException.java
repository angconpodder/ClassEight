package javaException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("This is division calculator");
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Give me the first Number");
		int a = userInput.nextInt();
		
		System.out.println("Give me the second Number");
		int b = userInput.nextInt();
		
		if(b==0){
			throw new InputMismatchException("Can not put 0 in here");
		}else{
			System.out.println("Result: " + a/b);
		}
		
	}

}
