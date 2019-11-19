import java.util.Scanner;

public class Ejercicio8T7 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int temp[] = new int[12];
		
		for(int i= 0; i < 12; i++) {
			
			System.out.print("Introduzca la temperatura de este mes: ");
			temp[i] = s.nextInt();
			
 		}
		
		for(int i = 0; i < 12; i++) {
			
			for (int j = 0; j <= temp[i]; j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
