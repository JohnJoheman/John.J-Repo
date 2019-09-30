import java.util.Scanner;

public class V39quadrant {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		
		Scanner Scan = new Scanner(System.in);
		int y = scan.nextInt();
		
		
		
		if(x > 0) {
			if(y > 0) {
				System.out.println(1);
			}
			else {
				System.out.println(4);
			}
		}
					
		if(x < 0) {
			if(y > 0) {
				System.out.println(2);
			}
			else {
				System.out.println(3);
			}
		}
			
				 
				
		}
	
		
	}

