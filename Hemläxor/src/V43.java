import java.util.Scanner;

public class V43 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double radius = in.nextDouble();
		System.out.println(doubleVolume(radius));
		
		
	
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(stringReverse(str));
			
	}
	
	
	
	
	public static double doubleVolume(double radius) {
	
		return((4 * Math.PI * Math.pow(radius, 3)) / 3);
		
		//returnar det som står inom parantesen tillbaka till main-metoden.
	}
	
	
	
	public static String stringReverse(String str) {
		
		String reverse ="";
		
		for(int i = str.length() - 1; i >= 0; i--)	
		reverse = reverse + str.charAt(i);
		//en loop som bygger den nya bakvända stringen.
		//använder sig av charAt för att ta in den sista bokstaven från stringen
		//det nya läggs in i en ny string tack vare "+".
		
		return reverse;
	}

	
}
