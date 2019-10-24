import java.util.Scanner;
public class Ejercicio16T5 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un número entero y dile si es primo: ");
    int numero = s.nextInt();
    
    boolean esPrimo = true;
    
    for (int i = 2; i< numero; i++) {
      if((numero % i) == 0) {
        esPrimo= false;
      }
     }
    
    if (esPrimo) {
      System.out.println("El número introducido es primo");
    } else {
      System.out.println("EL número introducido no es primo");
    }
  }
}
      
    
