import java.util.Scanner;

public class uppgift2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		
		int i = 0;
		for(i = 1; i <= 50; i++) {
			if(i % 5 == 0)
				System.out.println(i);
		}
	}
}