package objectCreation;

import java.util.Scanner;

public class FindPosition {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a letter: ");
        String input = scanner.nextLine();
        
        // Check if the input is a single character
        if (input.length() != 1) {
            System.out.println("Please enter a single letter.");
            return;
        }
        
        char letter = input.charAt(0);
        
        // Check if the input is a valid English alphabet character
        if (!Character.isLetter(letter)) {
            System.out.println("Please enter a valid English alphabet character.");
            return;
        }
        
        // Convert the letter to lowercase to handle both uppercase and lowercase input
        letter = Character.toLowerCase(letter);
        
        // ASCII value of 'a'
        int asciiValueOfA = (int) 'a';
        
        // ASCII value of the input letter
        int asciiValueOfLetter = (int) letter;
        
        // Calculate the position of the letter in the alphabet
        int position = asciiValueOfLetter - asciiValueOfA + 1;
        
        // Output the result
        System.out.println("Position of " + letter + " in the alphabet: " + position);
        
        scanner.close();
    }


	}

