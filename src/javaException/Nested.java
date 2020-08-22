package javaException;

import java.util.Scanner;

public class Nested {

	public static void main(String[] args) {
		
		System.out.println("This is division calculator");
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Give me the first Number");
		int a = userInput.nextInt();
		
		System.out.println("Give me the second Number");
		int b = userInput.nextInt();
		
		
		if(a==50){
			if(b==0){
				b=1;
				System.out.println(b);
			}
			else{
				b=2;
				System.out.println(b);
			}
		}
		else{
			System.out.println("Result: " + a/b);
		}
		
		
	}

}
