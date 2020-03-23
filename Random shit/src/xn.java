import java.util.Scanner;

public class xn {
	public static void main(String[] args) {
		System.out.println("Welcome to the number game!");
		System.out.println("You are now going to choose ");
		
		Scanner scan = new Scanner(System.in);
		
		int max = 100;
		int min = 0;
		
		int CorrectNumber = (int) (Math.random() * ((max-min) + 1) + min);
		
		System.out.println(CorrectNumber);
	}
}