
public class Ejercicio5T6 {

	public static void main(String[] args) {
		
		int numero;
		int numeroMax = 100;
		int numeroMin = 199;
		int media;
		int suma = 0;
		
		for (int i = 1; i <= 50; i++) {
			
			numero = (int)(Math.random()* 99 ) + 100;
		
			System.out.println(numero + " ");
			suma += numero;
		
		
			if (numero > numeroMax) {
			
				numeroMax = numero;
			}
			if (numero < numeroMin) {
				numeroMin = numero;
			}
		
		}
		
		media = suma/50 ;
		
		System.out.println("El número mayor es: " +numeroMax);
		System.out.println("El número menor es " +numeroMin);
		System.out.println("La media de los números es: " +media);
		
	}
}
