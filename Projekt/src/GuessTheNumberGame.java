import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
	
	static Scanner playersInput = new Scanner(System.in);
	
	
	public static int maxNumber;
	public static int minNumber;
	public static int guessesLeft;
	public static int difficulty;
	public static int wantToContinue;
	public static int correctNumber;
	public static int guessedNumber;
	public static boolean run = true;
	

	
	public static void main(String[] args) {
		
		
	}
		
		public static void theAlgorithmForGuessTheNumber()	{
			
			System.out.println("Let's see if you can guess the number");
			
		correctNumber = (int) (Math.random() * ((maxNumber-minNumber) + 1) + minNumber);

		
		if(guessedNumber == correctNumber) {
			System.out.println("Nice Job! You've successfully guessed the right number!");
			System.out.println();
			break;
		}
			else if(guessesLeft != 0) {
			
			 if(guessedNumber > correctNumber) {
				System.out.println("The number you're searching for are lower than what you've guessed");
				System.out.println("You have" + (guessesLeft - 1) + "guesses left");
				System.out.println("Please try again");
			}
			
			 else if (guessedNumber < correctNumber) {
				 System.out.println("The number you're searching for are higher than what you've guessed");
				 System.out.println("You have" + (guessesLeft - 1) + "guesses left");
				 System.out.println("Please try again");
			 }
			 
			 else {
				 System.out.println("You are out of guesses, better luck next time!");
				 break;
			 }
			 }
			 
		}
		
	}
	
}
