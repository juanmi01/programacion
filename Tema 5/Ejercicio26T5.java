import java.util.Scanner;

public class Ejercicio26T5 {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un número: ");
    int numero = s.nextInt();
    System.out.print("Introduzca un dígito de ese número: ");
    int dígito = s.nextInt();
    
    // le da la vuelta al número y calcula la longitud
    
    int n = numero;
    int volteado = 0;
    int longitud = 0;
    int posicion = 1;
    int resto = 0;
    
    
    if (n ==0) {
      longitud = 1;
    }
    
    while  (n > 0) {
      
      volteado = (volteado * 10) + (n% 10);
      n /= 10;
      longitud++;
    }
    
    //comprueba la posición
    while (volteado > 0) {
      if ((volteado % 10) == dígito) {
        System.out.print(posicion + " ");
      }
      volteado /= 10;
      posicion++;
    }
    System.out.println();
  }
}

      
      
      
    
