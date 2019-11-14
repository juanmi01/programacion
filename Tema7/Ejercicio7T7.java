import java.util.Scanner;
public class Ejercicio7T7 {
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		//REALIZAR EL ARRAY CON NÚMEROS ALEATORIOS
		
		int n[] = new int[100];
		int i;
		
		for(i = 0; i < 100; i++) {
			
			n[i] = (int)(Math.random() * 20) + 1;
		}
		
		for(i = 0; i < 100; i++) {
			
			System.out.print(n[i] + " ");
		}
		
		System.out.println();
		
		//PEDIR LOS VALORES POR PANTALLA
		int numero1;
		int numero2;
		
		System.out.println("A continuación introduce dos números");
		
		System.out.print("Introduce un número entre 0 y 20: ");
		numero1 = s.nextInt();
		
		System.out.print("Introduce un segundo número: ");
		numero2 = s.nextInt();
		
		//CAMBIAR EL NÚMERO1 Y CAMBIARLO POR EL NUMERO2
		
		for (i = 0; i < 100; i++) {
			
			if (n[i] == numero1) {
				
				n[i] = numero2;
				
				System.out.print("\"" + n[i] + "\" ");
				
			} else {
				
				System.out.print(n[i]+ " ");
			}
			
		}

	}
}
