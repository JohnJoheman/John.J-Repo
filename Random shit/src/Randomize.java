import java.util.Random;

public class Randomize {
	
	public static void main(String[] args) {
		
		
		for(int i = 0; i < 10; i++) {
			System.out.println(randomNum(1, 6));
			System.out.println(randomNummer(1, 7));
		
		}
	}
	
	public static int randomNum(int bottom, int top) {
		
		Random rand = new Random();
	
		return rand.nextInt(top - bottom + 1) + bottom;
		//behövs om du vill ha en botten gräns, annars räknar den från 0 till det givna talet.
	}
	
	
	
	
	
	public static int randomNummer(int bottom, int top) {
		double num = Math.random();
		
		Random randm = new Random();
		
		num *= top - bottom + 1;
		
		num += bottom;
		
		
		return randm.nextInt(top - bottom + 1) + bottom;
		// samma sak som: num = num * top;
	}

}
