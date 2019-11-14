import java.util.Scanner;
public class Ejercicio5T7 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n[] = new int[10];
		
		int numeroMax = Integer.MIN_VALUE;
		int numeroMin = Integer.MAX_VALUE;
		int i;
		
		
		for( i = 0; i < 10; i++) {
			
			System.out.print("Introduzca un número: ");
			n[i]= s.nextInt();		
			
			
			if(n[i] < numeroMin) {
				numeroMin = n[i];
			}
			
			if(n[i] > numeroMax) {
				numeroMax = n[i];
			}
		
		}
		
		System.out.println();
		
		for (i = 0; i < 10; i++) {	
			System.out.print(n[i]);
			
			
			if(n[i] == numeroMax) {
				System.out.print(" máximo");
			}
			
			
			if(n[i] == numeroMin) {
				System.out.print(" mínimo");
			}
			
			System.out.println();
		
		}
		
		
	}
}
