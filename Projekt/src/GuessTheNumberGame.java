import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class GuessTheNumberGame {
	
	static Scanner playersInput = new Scanner(System.in);  //So the player can type in the console
	
	
	public static int maxNumber;			//The highest possible generated number
	public static int minNumber;			//The lowest possible generated number
	public static int guessesLeft;			//The amount of guesses the player still has
	public static int difficulty;			//The difficulty the player choose
	public static int correctNumber;		//The correct number that's randomly generated
	public static int guessedNumber;		//The number that the player guesses
	public static boolean run = true;		//The program will run as long as "run" = true, otherwise it'll stop
	public static String chooseDifficulty;	//The string that saves the input from the player when choosing difficulty
	public static String playAgain;			//The string that saves the input from the player when choosing if he/she wants to play again
	


	public static void main(String[] args) {
		
		launchGuessTheNumberGame();
	
	}
	
	/**
	 * This method randomly generates the correct number between the interval, depending on what difficulty the player choose.
	 * @param maxNumber - the highest number in the interval
	 * @param minNumber - the lowest number in the interval
	 * @return the number which the player has to guess
	 */
		public static int randomNumber(int maxNumber, int minNumber) {
			Random correctNumber = new Random();
			return correctNumber.nextInt((maxNumber - minNumber) + 1) + minNumber;
			
		}
		
		
		/**
		 * A method that makes sure that the game will not crash when typing in anything else besides an integer
		 * @return - an int-input from the player
		 */
		public static int checkIfInputAreInt() {
			int inputFromPlayer;
			try {
				inputFromPlayer = playersInput.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("You have to write an integer!" + "Try again");
				playersInput.nextLine();
				inputFromPlayer = checkIfInputAreInt();
			}
			return inputFromPlayer;
		}
	
		
		/**
		 * A method that makes sure that the game will not crash when typing in anything else besides a String
		 * @return - a string-input from the player
		 */
		public static String checkIfInputAreString() {
			String StringInputFromPlayer;
			try {
				StringInputFromPlayer = playersInput.nextLine();
			}
			catch (InputMismatchException e) {
				System.out.println("You have to write a difficulty, check if you've typed it correctly with uppercase!");
				playersInput.nextInt();
				StringInputFromPlayer = checkIfInputAreString();
			}
			return StringInputFromPlayer;
		}
		
		
		/**
		 * This method contain the code of the game
		 */
	public static void launchGuessTheNumberGame() {
		
	do {
	
	while (run) {
		System.out.println("Hello and welcome to GuessTheNumberGame");
		System.out.println();
		System.out.println("You're going to guess a number thats randomly generated between a certain interval");
		System.out.println();
		System.out.println("Easy = number between 1-10, with a total of 5 guesses");
		System.out.println("Medium = number between 1-100, with a total of 10 guessses");
		System.out.println("Hard = number between 1-1000, with a total of 10 guesses");
		System.out.println();
		System.out.println("Please choose a difficulty by typing it down below." + " " + "If you don't want to play, just type 'exit'.");
		
		chooseDifficulty = checkIfInputAreString();
		
		switch (chooseDifficulty) {
		
		case "exit":
			System.out.println("See you Next time!");
			break;
			
		case "easy":
			easyDifficulty();
			
			break;
			
		case "medium": 
			mediumDifficulty();
			
			break;
			
		case "hard":
			hardDifficulty();
			
			break;
		}
		
		
		System.out.println("Do you want to play again?");
		System.out.println("Yes / No");
		
		playAgain = checkIfInputAreString();
		playAgain = playersInput.nextLine();
		
		switch (playAgain) {
		case "Yes":
			break;
				
		case "No":
			run = false;
			System.out.println();
			 System.out.println("Hope to see you soon, have a great time!");
			
			}
			} 
		}while (run);
	}
	
	
	/**
	 * This method contains some code for the easiest difficulty
	 * It changes the values
	 */
	public static void easyDifficulty() {
		
		guessesLeft = 5;
		minNumber = 1;
		maxNumber = 10;
		
		System.out.println("A number have been generated between 1-10");
		theAlgorithmForGuessTheNumberGame();
	}
	
	
	/**
	 * This method contains some code for the medium difficulty
	 * It changes the values
	 */
	public static void mediumDifficulty() {
		
		guessesLeft = 10;
		minNumber = 1;
		maxNumber = 100;
		
		System.out.println("A number have been generated between 1-100");
		theAlgorithmForGuessTheNumberGame();
	}
	
	/**
	 * This method contain some code for the Hard difficulty
	 * It changes the values
	 */
	public static void hardDifficulty() {
		
		guessesLeft = 10;
		minNumber = 1;
		maxNumber = 1000;
		
		System.out.println("A number have been generated between 1-1000");
		theAlgorithmForGuessTheNumberGame();
	}

	
	
	/**
	 * This method contains the whole algorithm for the game, how GuessTheNumberGame works
	 */
		public static void theAlgorithmForGuessTheNumberGame()	{
			
			System.out.println("Let's see if you can guess the number");
			
			
			correctNumber = randomNumber(maxNumber, minNumber);

			
		for(int i = 1; i <= guessesLeft; i++) {
			
			guessedNumber = checkIfInputAreInt();
					
		if(guessedNumber == correctNumber) {
			System.out.println("Nice Job! You've successfully guessed the right number!");
			System.out.println();
			break;
		}
			else if(guessesLeft != 0) {
			
			 if(guessedNumber > correctNumber) {
				System.out.println("The number you're searching for are lower than what you've guessed");
				System.out.println("You have" + " " + (guessesLeft - i) + " " + "guesses left" + ", please try again");
			}
			
			 else if (guessedNumber < correctNumber) {
				 System.out.println("The number you're searching for are greater than what you've guessed");
				 System.out.println("You have" + " " + (guessesLeft - i) + " " + "guesses left" + ", please try again");
			 }
		}
			 
			 else {
				 System.out.flush();
				 System.out.println("You are out of guesses, better luck next time!");
				 break;
			 }
			 }
			 
		}
		
	}


