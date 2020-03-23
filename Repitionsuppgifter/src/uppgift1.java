import java.util.Scanner;

public class uppgift1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Skriv in två heltal");
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		if(x > y) {
			System.out.println(y);
		}
			else {
				System.out.println(x);
			}
		}
		
	}

