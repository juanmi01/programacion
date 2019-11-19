import java.util.Scanner;

public class Ejercio9T7 {
		
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n[] = new int[8];
		
		for(int i = 0; i < 8; i++) {
			
			System.out.print("Introduce un entero: ");
			n[i] = s.nextInt();
		}
		
		for(int i = 0; i < 8; i++) {
			
			if((n[i] % 2) == 0) {
				
				System.out.println(n[i] + " par ");
				
			} else {
				
				System.out.println(n[i] + " impar ");
			}
		}
	}

}
