 	
public class Ejercicio4T7 {
	
	public static void main(String[] args) {
		
		int numero[] = new int[20];
		int cuadrado[] = new int[20];
		int cubo[] = new int[20];
		
		for (int i = 0; i < 20; i++) {
			numero[i] = (int)(Math.random() * 101);
			cuadrado[i] = numero[i] * numero[i];			
			cubo[i] = cuadrado[i] * numero[i];
					
		}
		
		System.out.printf("  n  |   n2  |  n3  \n");
		
		for(int i =0; i < 20; i++) {			
			System.out.printf("%4d | %6d| %8d\n", numero[i], cuadrado[i], cubo[i]);
			
		}
	}
}
