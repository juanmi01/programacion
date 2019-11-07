import java.util.Scanner; 

public class Ejercicio25T5 {

  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un número: ");
    int numeroIntroducido = s.nextInt();
    
    int numero = numeroIntroducido;
    int volteado = 0;
    
    
    while(numero > 0) {
      volteado = (volteado * 10 ) + (numero % 10);
      numero /= 10;
    }
    System.out.println("El número volteado es " +volteado);
    
  }
}
