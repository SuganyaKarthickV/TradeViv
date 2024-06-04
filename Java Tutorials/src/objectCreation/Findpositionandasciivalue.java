package objectCreation;

import java.util.Scanner;

public class Findpositionandasciivalue {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        
        // Input string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        // Calculate and print ASCII values of characters in the string
        System.out.println("ASCII values of characters in the string:");
        for (int i = 0; i < inputString.length(); i++) {
            char character = inputString.charAt(i);
            int asciiValue = (int) character;
            System.out.println("'" + character + "' : " + asciiValue);
        } 
        
        // Input letter
        System.out.print("Enter a letter to find its position in the alphabet: ");
        String inputLetter = scanner.nextLine();
        
        // Check if the input is a single character
        if (inputLetter.length() != 1) {
            System.out.println("Please enter a single letter.");
            return;
        }
        
        char letter = inputLetter.charAt(0);
        
        // Check if the input is a valid English alphabet character
        if (!Character.isLetter(letter)) {
            System.out.println("Please enter a valid English alphabet character.");
            return;
        }
        
        // Convert the letter to lowercase to handle both uppercase and lowercase input
        letter = Character.toLowerCase(letter);
        
        int asciivalue=(int)letter;
        int position= asciivalue-96;
        
        System.out.println("Position of " + letter + " in the alphabet: " + position);
        
        scanner.close();
       
        
        
        
        /* // ASCII value of 'a'
        int asciiValueOfA = (int) 'a';
        
        // ASCII value of the input letter
        int asciiValueOfLetter = (int) letter;
        
        // Calculate the position of the letter in the alphabet
        int position = asciiValueOfLetter - asciiValueOfA + 1;*/
        
        // Output the result
        

	}

}
