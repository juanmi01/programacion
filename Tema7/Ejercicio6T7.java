import java.util.Scanner;

public class Ejercicio6T7 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n[] = new int[15];
		int i;
		
		for (i = 0; i < 15; i ++) {
			
			System.out.print("Introduzca el número " +i + ": ");
			n[i] = s.nextInt();
		}
		
		for(i = 0; i < 15; i++) {
			
			System.out.print(n[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("A continuación desplazaremos el array");
		System.out.println("una posición.");
		
		int aux = n[14];
		
		for(i = 14; i > 0; i--) {
			n[i] = n[i - 1];
		}
		
		n[0] = aux;
		
		for(i = 0; i < 15; i++) {
			
			System.out.print(n[i] + " ");
		}
	}
}
