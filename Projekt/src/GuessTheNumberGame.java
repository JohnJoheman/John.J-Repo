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
	public static String chooseDifficulty;
	public static String playAgain;
	


	public static void main(String[] args) {
		
		launchGuessTheNumberGame();
	
	
	public static void launchGuessTheNumberGame() {
		
	
	
	while (run) {
		System.out.println("Hello and welcome to GuessTheNumberGame");
		System.out.println();
		System.out.println("You're going to guess a number thats randomly generated between a certain interval");
		System.out.println();
		System.out.println("Easy = number between 1-10, with a total of 5 guesses");
		System.out.println("Medium = number between 1-100, with a total of 10 guessses");
		System.out.println("Hard = number between 1-1000, with a total of 10 guesses");
			
		System.out.println("Please choose a difficulty by typing it down below");
		System.out.println("If you don't want to play, just type " + "'Exit'");
		
		switch (chooseDifficulty) {
		
		case "Exit":
			System.out.println("See you Next time!");
			break;
			
		case "Easy":
			easyDifficulty();
			
			break;
			
		case "Medium": 
			mediumDifficulty();
			
			break;
			
		case "Hard":
			hardDifficulty();
		}
		
		
		
		System.out.println("Do you want to play again?");
		System.out.println("Yes / No");
		
		switch (playAgain) {
		case "Yes":
			break;
				
		case "No":
			 run = false;
			 System.out.println("Hope to see you soon, haev a great time!");
			
		}
		} while (run);
		
	}
	
	
	public static void easyDifficulty() {
		
		guessesLeft = 5;
		minNumber = 1;
		maxNumber = 10;
		
		theAlgorithmForGuessTheNumberGame();
	}
	
	
	public static void mediumDifficulty() {
		
		guessesLeft = 10;
		minNumber = 1;
		maxNumber = 100;
		
		theAlgorithmForGuessTheNumberGame();

	}
	
	
	public static void hardDifficulty() {
		
		guessesLeft = 10;
		minNumber = 1;
		maxNumber = 1000;
		
		theAlgorithmForGuessTheNumberGame();

	}
	
	
	
	
		public static void theAlgorithmForGuessTheNumberGame()	{
			
			System.out.println("Let's see if you can guess the number");
			
	
		for(int i = 1; i <= guessesLeft; i++) {
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

