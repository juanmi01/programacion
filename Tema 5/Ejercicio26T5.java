import java.util.Scanner;

public class Ejercicio26T5 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca un número: ");
		int n = s.nextInt();
		

		System.out.print("Introduzca un dígito: ");
		int dig = s.nextInt();
		
		 // Le da la vuelta al número
		
		int numero = n;
		int volteado = 0;
		int longitud = 0;
		int posicion = 1;
		
		if (numero == 0) {
			
			longitud = 1;
		}
		
		while (numero > 0) {
			
			volteado = (volteado * 10) + (numero % 10);
			
			numero /= 10;
			
			longitud++;
		}
		
		// Comprueba la posición
		
		while (volteado > 0) {
			
			if ((volteado % 10) == dig) {
				System.out.print(posicion + " ");
			}
			
			volteado /= 10;
			posicion++;
		}
		
		System.out.println();
	}
}
