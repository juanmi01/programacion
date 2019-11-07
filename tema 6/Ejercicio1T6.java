import java.util.Scanner;

public class Ejercicio1T6 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int suma = 0;
		int tirada;
		for(int i = 1; i <=  3; i++) {
			tirada = (int)(Math.random()*6)+1;
			System.out.print(tirada + " ");
			suma += tirada;
		}
		
		System.out.println("\nSuma: " +suma);
		
		
	}
}

