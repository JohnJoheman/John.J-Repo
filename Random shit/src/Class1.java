import java.util.Scanner;

public class Class1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vad heter du?");
		String namn = scan.next();
		namn += scan.next();
		
		System.out.println("Hur gammal är du?");
		int ålder = scan.nextInt();
		
		System.out.println("Vad är din adress?");
		String adress = scan.next();
		adress += scan.next();
	
		System.out.println("Vad är ditt postnummer?");
		String postnummer = scan.next();
		
		System.out.println("Vilken stad bor du i?");
		String stad = scan.next();
		
		System.out.println("Vad är ditt telefonnummer?");
		int telefonnummer = scan.nextInt();
		
		
		
		System.out.println("Information:");
		System.out.println("Namn:" + namn);
		System.out.println("Ålder:" + ålder);
		System.out.println("Adress:" + adress);
		System.out.println("Stad:" + stad);
		System.out.println("Telefon:" + telefonnummer);

	}
	
}

