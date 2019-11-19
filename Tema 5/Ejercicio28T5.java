import java.util.Scanner;

public class Ejercicio28T5 {

	public static void main(String[] argss) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca un factorial: ");
		int n  = s.nextInt();
		
		int factorial = 1;
		
		for(int i = 1; i <= n; i++) {
			
		
			factorial *=i;
			
			
		}
		System.out.print("El factorial de " +n+ " es " +factorial);
	}
}
