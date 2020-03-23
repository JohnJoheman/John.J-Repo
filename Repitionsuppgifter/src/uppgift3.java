import java.util.Random;
import java.util.Scanner;

public class uppgift3 {

	public static void main(String[] args) {
		
	}
	int minNumber = 1;
	int maxNumber = 100;
	
		public static int randomNumber(int maxNumber, int minNumber) {
			Random r = new Random();
			return r.nextInt((maxNumber - minNumber) + 1) + minNumber;
			System.out.println(r);
		}
	}