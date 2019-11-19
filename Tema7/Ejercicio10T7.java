
public class Ejercicio10T7 {

	public static void main(String[] args) {
		
		int n[] = new int[20];
		int par[] = new int[20];
		int impar[] = new int[20];
		int i;
		int pares = 0;
		int impares = 0;
		
		for( i = 0; i < 20; i++) {
			
			n[i] = (int)(Math.random() * 101);
			
			if((n[i] % 2) == 0) {
				
				n[i] = par[i];
				
			} else {
				
				n[i] = impar[i - pares];
			}
		}
		
		for( i = pares; i < 20; i++) {
		
			System.out.println("Array con los pares al principio: ");
				
			for(i = 0; i < 20; i++) {
				
				System.out.print(n[i] + " ");
			}
	
		}	
		
	}
}

