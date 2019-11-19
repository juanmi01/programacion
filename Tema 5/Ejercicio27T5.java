import java.util.Scanner;

public class Ejercicio27T5 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca un número :");
		int n = s.nextInt();
		
		int suma = 0;
		int cuenta = 0;
		
		for(int i =1; i < n; i++) {
			
			if((i % 3) == 0) {
				
				System.out.print(i + " ");
				cuenta++;
				suma += i;
				
			}
		}
		System.out.println();
		System.out.println("Entre 1 y " +n+ " hay " +cuenta+ " números que son multiplos de 3");
		System.out.print("la suma entre 1 y " +n+ " es de " +suma);
		
	}
}
