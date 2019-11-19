import java.util.Scanner;

public class Ejercicio29T5 {


	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca el número que vamos a dividir: ");
		int n = s.nextInt();
		
		System.out.print("Introduzca el número que va a actuar como divisor: ");
		int div = s.nextInt();
		
		for(int i = 1; i < n; i++ ) {
			
			
			if ((i % div) != 0) {
				
				System.out.print(i + " ");
			}
		}
	}
}
