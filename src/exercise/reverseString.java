package exercise;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		
		//I give you a word, you reverse it.
		//Palindrome: a word is palindrome if it reads the same way when reading backward such MADAM, LEVEL, MOM, WOW
		
		Scanner userInput = new Scanner(System.in);
		System.out.print("Give me a word: ");
		
		String userData = userInput.next();
		
		char[] allCharacters = userData.toCharArray();
		
		String finalOutput = "";
		for(int i=allCharacters.length-1; i>=0; i--){
			finalOutput = finalOutput + allCharacters[i] ;
		}
		
		System.out.println("Reversed word: " + finalOutput);
		
		if(userData.equalsIgnoreCase(finalOutput)){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
			System.out.println("test");
		}

	}

}
