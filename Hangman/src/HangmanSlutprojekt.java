import java.util.ArrayList;
import java.util.Random;

public class HangmanSlutprojekt {
	
	public static final String[] arraylistContainingCars = { "bmw", "mercedes", "volvo", "audi", "ford", "nissan", "toyota", "opel", "tesla",

	};
	public static final String[] arraylistContainingTeachers = { "Are", "Linda", "Tomas", "Erik", "Stefan", "Simon"
	};
	
	public static final String[] arraylistContainingColors = { "yellow", "red", "blue", "pink", "black", "white", "gray", "purple", "brown", "green"
	};
	
	public static final Random RANDOM = new Random();
	
	public static final int maxErrors = 6;
	
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
		return arraylistContainingTeachers[RANDOM.nextInt(arraylistContainingColors.length)];
	}
	
	
	
	
	
	
	
	}
