import java.util.Scanner;

public class Ejercicio6T6 {


	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
			
		int oportunidades = 5;
		int numeroOculto = (int)(Math.random()	 * 101);
		int numeroIntroducido;
	    boolean acertado = false;		
		
		do {
					
			System.out.print("Introduce un número: ");
			numeroIntroducido = s.nextInt();
			oportunidades--;
			
			if ( (numeroIntroducido > numeroOculto) && (oportunidades > 0) ) {
				System.out.println("El número que estoy pensando es menor que " +numeroIntroducido);
				System.out.println("Le quedan " +oportunidades+ " oportunidades");
			}
			
			if ( (numeroIntroducido < numeroOculto) && (oportunidades > 0) ) {
				System.out.println("El número que estoy pensando es mayor que " +numeroIntroducido);
				System.out.println("Le quedan " +oportunidades+ " oportunidades");
			}
			
			if (numeroIntroducido == numeroOculto) {
				acertado = true;
				System.out.println("¡HAS ACERTADO!");
			}
			
		} while (!acertado && (oportunidades > 0));
		
		if (!acertado) {
			System.out.println("Lo siento, no has acertado, el numero era " +numeroOculto);
		}
	}
}
