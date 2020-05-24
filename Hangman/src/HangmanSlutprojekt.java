import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HangmanSlutprojekt {
	
	/**
	 * lists containing the different words that the player are going to guess. What list the word will be generated from is depending on what subject the player wants to guess in.
	 */
	public static final String[] arraylistContainingCars = { "bmw", "mercedes", "volvo", "audi", "ford", "nissan", "toyota", "opel", "tesla", "saab", "volkswagen", "peugeuot", "chevrolet", "seat", "suzuki", "skoda", "fiat", "citroen", "kia", "mazda"};
	public static final String[] arraylistContainingTeachers = { "are", "linda", "tomas", "erik", "stefan", "simon", "sacha", "dawid", "annieke", "henrik", "niklas"};
	public static final String[] arraylistContainingColors = { "yellow", "red", "blue", "pink", "black", "white", "gray", "purple", "brown", "green", "orange"};	
	
	
	static final Random RANDOM = new Random(); 
	static Scanner input = new Scanner(System.in);
	public static final int maxErrors = 7; //max errors before player lose
	public static int guessesLeft; //The amount of guesses the player have left.
	public static String wordToFind; //the word that the player are going to figure out.
	public static char[] wordFound; //word found stored in a char array to show progression of user
	public static int wrongLetterInputs; //wrong letters that the player have guessed. It'll be stored so if the player tries to guess the same letter, it won't affect the guesses left.
	public static ArrayList < String >	letters = new ArrayList < > (); //ArrayList for the letters already guessed by the player
	public static char playerGuess; //the letter that the player guess.
	
	
	/**
	 * A method that randomly choose a word from the list containing cars
	 * @return the random word generated within the list.
	 */
	public static String nextWordToFindWithinCars() {
		return arraylistContainingCars[RANDOM.nextInt(arraylistContainingCars.length)];
	}
	
	
	/**
	 * A method that randomly choose a word from the list containing colors.
	 * @return the random word generated within the list.
	 */
	
	public static String nextWordToFindWithinColors() {
		return arraylistContainingColors[RANDOM.nextInt(arraylistContainingColors.length)];
	}
	
	
	/**
	 * A method that randomly choose a word from the list containing teachers in NTI
	 * @return the random word generated within the list.
	 */
	
	public static String nextWordToFindWithinTeachers() {
		return arraylistContainingTeachers[RANDOM.nextInt(arraylistContainingTeachers.length)];
	}
	
	/**
	 * main method that runs the whole program by calling on methods that later calls on other methods. Just so the structure gets better and the code more understandable.
	 */
	
	public static void main(String[] args) {
		welcome();
		playGame();
	}
	
	/**
	 * this is the method for running the game when the player haven't played it before, or first launching it.
	 */
	
	public static void playGame() {
		playerChooseToPlayOrNot();
		playerChooseSubjectMethod();
		replaceLettersWithUnderscore();
		shortMessageBeforeStart();
		play();
	}
	
	/**
	 * this is the method for running the game when the player choose to play again, it resets the stats and doesnt run the "welcome" message etc becuase that's unnecessary.
	 */
	
	public static void playGameAgain() {
		resetStatsForNewGame();
		playerChooseSubjectMethod();
		replaceLettersWithUnderscore();
		shortMessageBeforeStart();
		play();
	}
	
	
	/**
	 * I made this into a method because I don't always want it to print out whenever the game resets and restarts.
	 * I'll have an option in the end that let's the player choose if he/she wants to play again. Then if the player chooses yes, the welcome message becomes unnecessary.
	 */
	
	
	public static void welcome() {
		System.out.println("\nHello and welcome to Hangman!");
		System.out.println();
		System.out.println("\nThe game works like this: You are going to try and guess a word by entering a letter one by one.");
		System.out.println("\nYou'll get to see how long the word is and try to figure out what the word can be.");
		System.out.println("\nThere's different subjects to choose from and once you have entered a correct letter, it'll replace the index for that specific letter");
		System.out.println("\nAlso... You'll only have 7 guesses so use them well!" );
		System.out.println();
	}

	
	//this is a method that prints out a short extra message before the game continues.
	
	public static void shortMessageBeforeStart() {
		System.out.println();
		System.out.println("Interesting choice, now let's see if you can guess the word with only 7 tries!");
		System.out.println("(P.S Every word should be typed in with lowercase!)");
	}
	
	
	/**
	 * A method that plays the game until the player runs out of guesses or succeed to figure out the word. It'll also write out if the player won or lost. 
	 * After the game is over, the player will be asked if he/she wants to play again or not. if yes: the program will run "playGameAgain" which is a method that starts with asking which subject the player wants to guess a word from.
	 * Instead of running the whole game again so to speak.
	 */
	
	public static void play() {
		try (Scanner input = new Scanner(System.in)) {
			while (wrongLetterInputs < maxErrors) {
				System.out.println("Enter a single letter, otherwise it'll count as a wrong guess: ");
				
				String str = input.nextLine();
				
			
			updateWordAfterCharacterInputFromUser(str);
			System.out.println("\n" + wordFoundContent());
			
			if (wordFound()) {
				System.out.println("\nCongrats, you won!");
				System.out.println();
				playHangmanAgain();
				break;
			} 
			
			else {
				
				System.out.println("Guesses Left : " + (maxErrors - wrongLetterInputs));
				printOutHangman();
			}
			
		}
		if (wrongLetterInputs == maxErrors) {
			System.out.println("\n unlucky, you lost!");
			System.out.println("The correct word was : " + wordToFind);
			System.out.println();
			playHangmanAgain();
		}
		
		
		printOutHangman();
			
			
		}
	}
	
	/**
	 * A method that resets the stats so the player can continue playing without restarting the whole program
	 */
	
	public static void resetStatsForNewGame() {
		guessesLeft = 7;
		letters.clear();
		wrongLetterInputs = 0;
	}
	
	
	/**
	 * A method that catches the errors that occur in case the player writes a data type other than an int.
	 * @return returns the players int input.
	 */
	
	public static int isNextInputInt () {
		while(true)	{
			try {
				return input.nextInt();
			}
			catch (Exception e) {
				System.out.println("Try typing in a number instead");
				input.nextLine();
			}
		}
	}
	
	
	/**
	 * A method that replaces the whole word with underscore instead of letters. So if the word is 5 letters long, it'll be 5 underscores instead.
	 * loops through the whole word to see how many letters there are, to later replace them. 
	 */
	
	public static void replaceLettersWithUnderscore() {
		wordFound = new char[wordToFind.length()];
		for (int i = 0; i < wordFound.length; i++) {
			wordFound[i] = '_';
		}
	}

	
	/**
	 * during the game, I need to manage the word found by the user. First, I need to have a method for determining if the word to find has been found.
	 * For that, I need to transform the wordFound array to String and then comparing this new String to the wordFind.
	 * Which the following method does...
	 */
	public static boolean wordFound() {
	return wordToFind.contentEquals(new String(wordFound));
	}
	
	
	/**
	 * Then I have to define a method returning the state of the word being found by the player under String format. 
	 * For better readability, I add a space between each character/underscore.
	 */
	
	public static String wordFoundContent() {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < wordFound.length; i++) {
			builder.append(wordFound[i]);
			
			if (i < wordFound.length - 1) {
				builder.append(" ");
			}
		}
		return builder.toString();
	}
	
	/**
	 * A method that asks the player if he/she wants to play again or not. 
	 * Then it runs the method where I have a switch case that determines what code that should be run depending on the answer from the player.
	 */
	public static void playHangmanAgain() {
		System.out.println("Do you want to play again?");
		System.out.println();
		checksIfPlayerTypesYesOrNo();
		
	}
		

	/**
	 * This is a method for checking so that the player types in either 1 or 2, it's to prevent the program from crashing when typing in anything else than requested.
	 * It'll continue until either 1 or 2 is typed and I made this into 2 seperate methods because I didnt want the consol to type out "do you want to play again?" every time the player tries to write anything else besides what's requested.
	 */
	
	public static void checksIfPlayerTypesYesOrNo() {
		System.out.println("Enter (1) for YES");
		System.out.println("Enter (2) for NO");
		int answerFromPlayer = isNextInputInt();
		
		switch(answerFromPlayer) {
		case 1: 
			playGameAgain();
			break;
			
		case 2: 
			System.out.println("Alright, see you later!");
			System.exit(0);
			break;
			
		default:
			System.out.println();
			System.out.println("Didn't I just tell you to enter either 1 or 2!?");
			checksIfPlayerTypesYesOrNo();
		}
	}
	
	
	/**
	 * A method that checks if the letter is in the wordToFind and replaces the underscore by the occurrences of the letter in the wordFound array. 
	 * It'll with a while loop, find all the occurrences at the correct position. During the loop/iteration, it replaces the underscore with the letter entered by the player.
	 * @param c is just a character used to execute the method, let's say that the player enters an "a" (it could be any letter), then that letter is called "c" in this method.
	 */
	
	public static void updateWordAfterCharacterInputFromUser(String c) {
		//we update only if c has not already been entered
		if(!letters.contains (c)) {
			//checks if wordToFind contains c
			if (wordToFind.contains (c)) {
				int index = wordToFind.indexOf(c);
				
				while (index >= 0) {
					wordFound[index] = c.charAt(0);
					index = wordToFind.indexOf(c, index + 1);
				}
			}
			else {
				//c is not in the word, which will result/count as a wrong guess.
				wrongLetterInputs++;
			}
			//c is now a letter entered
			letters.add(c);
		}
	}
	
	
	/**
	 * This is a method that lets the player know that it's time to choose a subject.
	 * Then it calls on a method that contains the code that handle the answer etc.
	 */
	
	public static void playerChooseSubjectMethod() {
		System.out.println("Choose a subject:");
		playerMustChooseASubject();
		
	}
	
	
	/**
	 * This is a method that lets the player choose a subject by entering either 1, 2 or 3.
	 * It'll with the switch case run different codes depending on the answer from the player. 
	 * It'll also check so that the player doesn't type in anything else than what's requested. That might lead to a crash in my program
	 * wordToFind will be randomized within the list of the subject that the player choose to guess from.
	 */
	
	public static void playerMustChooseASubject () {
		System.out.println("Enter (1) for cars.");
		System.out.println("Enter (2) for teachers in NTI.");
		System.out.println("Enter (3) for colors.");
		int playerChooseSubject = isNextInputInt();
		switch (playerChooseSubject) {
		
		case 1:
			wordToFind = nextWordToFindWithinCars();
			break;
			
		case 2:
			wordToFind = nextWordToFindWithinTeachers();
			break;
			
		case 3:
			wordToFind = nextWordToFindWithinColors();
			break;
		default:
			System.out.println();
			System.out.println("Didn't I just tell you to enter either 1, 2 or 3!?");
			playerMustChooseASubject();
		}
	}
	
	
	/**
	 * A method that prints out if the player wants to give the game a try or not
	 * Then it runs a method that lets the player answer and then handle that answer depending on players input.
	 */
	public static void playerChooseToPlayOrNot() {
		System.out.println("\nDo you want to give it a try?");
		enterEitherOneOrTwo();
			
		}
		
		/**
		 * A method that asks the player to type either yes or no by typing in 1 or 2.
		 * Then it checks if the input is an int or not by calling on the try-catch method.
		 * After that, it'll run the different codes depending on the answer/input from the player. 
		 * If the player doesn't want to try the game, then it'll just exit.
		 * In the end I have a method that runs the code again if the player doesn't answer with what's requested (1 or 2). 
		 * It'll also print out that the player only can answer with what's requested, and from there it runs whole method again to check if the input is correct the next time.
		 */
	public static void enterEitherOneOrTwo() {
		System.out.println("Enter (1) for YES");
		System.out.println("Enter (2) for NO");
		int playerChooseYesOrNo = isNextInputInt();

		
		switch (playerChooseYesOrNo) {
		
		case 1:
			System.out.println("\nAyyy let's goooo");
			break;
			
		case 2:
			System.out.println("\nAlright, See You Later!");
			System.exit(0);
			break;
			
		default:
			System.out.println();
			System.out.println("You have to enter either 1 or 2 to continue the game!");
			enterEitherOneOrTwo();
			
			
		}
	}
	
	
	/**
	 * A method that prints out the different parts of the hanging man until his whole body is there (until guessesLeft is 0). 
	 * The different "pictures" will be printed out in order depending on how many wrong letters the player have entered.
	 */
	
	public static void printOutHangman() {
		if (wrongLetterInputs == 1) {
			System.out.println(
				    "   _____\n" +
				    "   |   |\n" +
	                "   O   |\n" +
	                "       |\n" +
	                "       |\n" +
	                "       |\n" +
	                "_______|");
		}
		
		else if (wrongLetterInputs == 2) {
			System.out.println(
				    "   _____\n" +
				    "   |   |\n" +
	                "   O   |\n" +
	                "   |   |\n" +
	                "       |\n" +
	                "       |\n" +
	                "_______|");
		}
		
		else if (wrongLetterInputs == 3) {
			System.out.println(
				    "   _____\n" +
				    "   |   |\n" +
	                "   O   |\n" +
	                "  /|   |\n" +
	                "       |\n" +
	                "       |\n" +
	                "_______|");
		}
		
		else if (wrongLetterInputs == 4) {
			System.out.println(
				    "   _____\n" +
				    "   |   |\n" +
	                "   O   |\n" +
	                "  /|\\  |\n" +
	                "       |\n" +
	                "       |\n" +
	                "_______|");
		}
		
		else if (wrongLetterInputs == 5) {
			System.out.println(
				    "   _____\n" +
				    "   |   |\n" +
	                "   O   |\n" +
	                "  /|\\  |\n" +
	                "   |   |\n" +
	                "       |\n" +
	                "_______|");
		}
		else if (wrongLetterInputs == 6) {
			System.out.println(
				    "   _____\n" +
				    "   |   |\n" +
	                "   O   |\n" +
	                "   |   |\n" +
	                "  /|\\  |\n" +
	                "  /    |\n" +
	                "_______|");
		}
		
		else if (wrongLetterInputs == 7) {
			System.out.println(
				    "   _____\n" +
				    "   |   |\n" +
	                "   O   |\n" +
	                "   |   |\n" +
	                "  /|\\  |\n" +
	                "  / \\  |\n" +
	                "_______|");
		}
	}
	
	
	
	}
