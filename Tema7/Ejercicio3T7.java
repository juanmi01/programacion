import java.util.Scanner;
public class Ejercicio3T7 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n[] = new int[10];
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Introduzca un número: ");
			n[i] = s.nextInt();
		}
		
		
		for(int i = 9; i >= 0; i--) {
			System.out.println(n[i]);
		}
		
	}
}
