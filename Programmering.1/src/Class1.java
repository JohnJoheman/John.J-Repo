import java.util.Scanner;

public class Class1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vad heter du?");
		String namn = scan.next();
		
		System.out.println("Hur gammal �r du?");
		int �lder = scan.nextInt();
		
		System.out.println("Vad �r din adress?");
		String adress = scan.next();
	
		System.out.println("Vad �r ditt postnummer?");
		String postnummer = scan.next();
		
		System.out.println("Vilken stad bor du i?");
		String stad = scan.next();
		
		System.out.println("Vad �r ditt telefonnummer?");
		int telefonnummer = scan.nextInt();
		
	}	
	
}

