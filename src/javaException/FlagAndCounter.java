package javaException;

import java.util.Scanner;

public class FlagAndCounter {

	public static void main(String[] args) {
		
		//Flag = boolean
		//Counter
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Give me the first Number");
		int a = userInput.nextInt();
		
		System.out.println("Give me the second Number");
		int b = userInput.nextInt();
		
		int counter = 0;
		boolean flag = true;
		
		for(int i=a; i<=b; i++){
			//System.out.println(i);
			
			if(i==0){
				flag=false;
			}
			
			if(flag){
				if(i%5==0){
					counter++;
				}
			}
			
			
		}
		
		System.out.println("total amount: " + counter);
		
		//divisible by 3. -- multiple of 3 // MOD = %
		
		//15
		//10
		//5

	}

}
