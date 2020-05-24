import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HangmanSlutprojekt {
	
	public static final String[] arraylistContainingCars = { "bmw", "mercedes", "volvo", "audi", "ford", "nissan", "toyota", "opel", "tesla", "saab", "volkswagen", "peugeuot", "chevrolet", "seat", "suzuki", "skoda", "fiat", "citroen", "kia", "mazda"};
	public static final String[] arraylistContainingTeachers = { "are", "linda", "tomas", "erik", "stefan", "simon", "sacha", "dawid"};
	public static final String[] arraylistContainingColors = { "yellow", "red", "blue", "pink", "black", "white", "gray", "purple", "brown", "green", "orange"};
	ArrayList < Integer[] > arrayListContainingIntegers = new ArrayList < > ();
	
	
	
	static final Random RANDOM = new Random();
	static Scanner input = new Scanner(System.in);
	public static final int maxErrors = 7;
	public static int guessesLeft;
	public static String wordToFind;
	public static char[] wordFound;
	public static int wrongLetterInputs;
	public static String nextWordToFind;
	public static ArrayList < String >	letters = new ArrayList < > ();
	public static ArrayList < Integer > Integers = new ArrayList < > ();
	public static char playerGuess;
	
	
	public static String nextWordToFindWithinCars() {
		return arraylistContainingCars[RANDOM.nextInt(arraylistContainingCars.length)];
	}
	
	public static String nextWordToFindWithinColors() {
		return arraylistContainingColors[RANDOM.nextInt(arraylistContainingColors.length)];
	}
	
	public static String nextWordToFindWithinTeachers() {
		return arraylistContainingTeachers[RANDOM.nextInt(arraylistContainingTeachers.length)];
	}
	
	
	public static void main(String[] args) {
		welcome();
		playGame();
	}
	
	
	public static void playGame() {
		playerChooseToPlayOrNot();
		playerChooseSubjectMethod();
		replaceLettersWithUnderscore();
		shortMessageBeforeStart();
		play();
	}
	
	
	public static void playGameAgain() {
		resetStatsForNewGame();
		playerChooseSubjectMethod();
		replaceLettersWithUnderscore();
		shortMessageBeforeStart();
		play();
		
	}
	
	public static void welcome() {
		System.out.println("\nHello and welcome to Hangman!");
		System.out.println();
		System.out.println("\nThe game works like this: You are going to try and guess a word by entering a letter one by one.");
		System.out.println("\nYou'll get to see how long the word is and try to figure out what the word can be.");
		System.out.println("\nThere's different subjects to choose from and once you have entered a correct letter, it'll replace the index for that specific letter");
		System.out.println("\nAlso... You'll only have 7 guesses so use them well!" );
		System.out.println();
	}

	public static void shortMessageBeforeStart() {
		System.out.println();
		System.out.println("Interesting choice, now let's see if you can guess the word with only 7 tries!");
		System.out.println("(P.S Every word should be typed in with lowercase!)");
	}
	
	
	
	public static void play() {
		try (Scanner input = new Scanner(System.in)) {
			while (wrongLetterInputs < maxErrors) {
				System.out.println("Enter a Letter, otherwise it'll count as a wrong guess: ");
				
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
	
	public static boolean isNextInputString() {
		boolean isLetter = Character.isLetter(playerGuess);
		if(!isLetter) {
			System.out.println("You have to enter a letter!");
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	
	public static void resetStatsForNewGame() {
		guessesLeft = 7;
		letters.clear();
		wrongLetterInputs = 0;
	}
	
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
	
	
	
	public static void replaceLettersWithUnderscore() {
		wordFound = new char[wordToFind.length()];
		for (int i = 0; i < wordFound.length; i++) {
			wordFound[i] = '_';
		}
	}

	
	public static boolean wordFound() {
	return wordToFind.contentEquals(new String(wordFound));
	}
	
	
	public static void playHangmanAgain() {
		System.out.println("Do you want to play again?");
		System.out.println();
		checksIfPlayerTypesYesOrNo();
		
	}
		

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
	
	
	

	
	public static void updateWordAfterCharacterInputFromUser(String c) {
		if(!letters.contains (c)) {
			if (wordToFind.contains (c)) {
				int index = wordToFind.indexOf(c);
				
				while (index >= 0) {
					wordFound[index] = c.charAt(0);
					index = wordToFind.indexOf(c, index + 1);
				}
			}
			else {
				wrongLetterInputs++;
			}
			
			letters.add(c);
		}
	}
	
	
	
	
	
	
	
	
	public static void playerChooseSubjectMethod() {
		System.out.println("Choose a subject:");
		playerMustChooseASubject();
		
	}
	
	
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
	
	public static void playerChooseToPlayOrNot() {
		System.out.println("\nDo you want to give it a try?");
		enterEitherOneOrTwo();
			
		}
		
		
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
