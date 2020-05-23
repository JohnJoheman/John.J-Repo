import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HangmanSlutprojekt {
	
	public static final String[] arraylistContainingCars = { "bmw", "mercedes", "volvo", "audi", "ford", "nissan", "toyota", "opel", "tesla",

	};
	public static final String[] arraylistContainingTeachers = { "Are", "Linda", "Tomas", "Erik", "Stefan", "Simon"
	};
	
	public static final String[] arraylistContainingColors = { "yellow", "red", "blue", "pink", "black", "white", "gray", "purple", "brown", "green"
	};
	static final Random RANDOM = new Random();
	static Scanner input = new Scanner(System.in);
	public static final int maxErrors = 6;
	public static int guessesLeft;
	public String wordToFind;
	public char[] wordFound;
	public int wrongLetterInputs;
	public String nextWordToFind;
	public ArrayList < String >	letters = new ArrayList < > ();
	
	
	public String nextWordToFindWithinCars() {
		return arraylistContainingCars[RANDOM.nextInt(arraylistContainingCars.length)];
	}
	
	public String nextWordToFindWithinColors() {
		return arraylistContainingColors[RANDOM.nextInt(arraylistContainingColors.length)];
	}
	
	public String nextWordToFindWithinTeachers() {
		return arraylistContainingTeachers[RANDOM.nextInt(arraylistContainingTeachers.length)];
	}
	
	
	
	public static int isNextInputInt () {
		while(true)	{
			try {
				return input.nextInt();
			}
			catch (Exception e) {
				System.out.println("Try typing in a number instead");
				input.nextLine();
				continue;
			}
		}
	}
	
	
	
	public void createWordToFind() {
		wordFound = new char[wordToFind.length()];
		for (int i = 0; i < wordFound.length; i++) {
			wordFound[i] = '_';
		}
	}

	
	public boolean wordFound() {
	return wordToFind.contentEquals(new String(wordFound));
	}
	
	
	
	public String wordFoundContent() {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < wordFound.length; i++) {
			builder.append(wordFound[i]);
			
			if (i < wordFound.length - 1) {
				builder.append(" ");
			}
		}
		return builder.toString();
	}
	
	
	public void updateWordAfterCharacterInputFromUser(String c) {
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
	
	
	
	
	
	public void play() {
		try (Scanner input = new Scanner(System.in)) {
			while (wrongLetterInputs < maxErrors) {
				System.out.println("\nEnter a Letter : ");
				String str = input.nextLine();
				if (str.length() > 1) {
					str = str.substring(0, 1);
				}
			
			updateWordAfterCharacterInputFromUser(str);
			System.out.println("\n" + wordFoundContent());
			
			if (wordFound()) {
				System.out.println("\nCongrats, you win!");
				break;
			} else {
				System.out.println("\n Guesses Left : " + (maxErrors - wrongLetterInputs));
			}
			
		}
		if (wrongLetterInputs == maxErrors) {
			System.out.println("\n unlucky, you lost!");
			System.out.println("\n The correct word was : " + wordToFind);
		}
				
	}
	
	}
	
	
	public void playerChooseSubjectMethod() {
		int playerChooseSubject = input.nextInt();
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
		}
		
	}
	
	
	public static void printOutHangman() {
		if (guessesLeft == 6) {
			System.out.println(
				    "   _____\n" +
				    "   |   |\n" +
	                "   O   |\n" +
	                "       |\n" +
	                "       |\n" +
	                "       |\n" +
	                "_______|");
		}
		
		else if (guessesLeft == 5) {
			System.out.println(
				    "   _____\n" +
				    "   |   |\n" +
	                "   O   |\n" +
	                "   |   |\n" +
	                "       |\n" +
	                "       |\n" +
	                "_______|");
		}
		
		else if (guessesLeft == 4) {
			System.out.println(
				    "   _____\n" +
				    "   |   |\n" +
	                "   O   |\n" +
	                "  /|   |\n" +
	                "       |\n" +
	                "       |\n" +
	                "_______|");
		}
		
		else if (guessesLeft == 3) {
			System.out.println(
				    "   _____\n" +
				    "   |   |\n" +
	                "   O   |\n" +
	                "  /|\\ |\n" +
	                "       |\n" +
	                "       |\n" +
	                "_______|");
		}
		
		else if (guessesLeft == 2) {
			System.out.println(
				    "   _____\n" +
				    "   |   |\n" +
	                "   O   |\n" +
	                "  /|\\ |\n" +
	                "   |   |\n" +
	                "       |\n" +
	                "_______|");
		}
		else if (guessesLeft == 1) {
			System.out.println(
				    "   _____\n" +
				    "   |   |\n" +
	                "   O   |\n" +
	                "   |   |\n" +
	                "  /|\\ |\n" +
	                "  /    |\n" +
	                "_______|");
		}
		
		else if (guessesLeft == 0) {
			System.out.println(
				    "   _____\n" +
				    "   |   |\n" +
	                "   O   |\n" +
	                "   |   |\n" +
	                "  /|\\ |\n" +
	                "  / \\ |\n" +
	                "_______|");
		}
	}
	
	
	
	}
