import java.util.Scanner;

public class V43 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double radius = in.nextDouble();
		System.out.println(doubleVolume(radius));
	}
	
	public static double doubleVolume(double radius) {
		double pi = Math.PI;
		
	
		return((4 * pi * Math.pow(radius, 3)) / 3);
		
	}
}
