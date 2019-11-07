import java.util.Scanner; 

public class Ejercicio22T5 {

  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
  
    System.out.println("Vamos a mostrar todos los números primos entre 2 y 100");
  
    boolean esPrimo = true;
    
    for(int n= 2; n<=100; n++) {
      
      //comprobamos si n es primo
      esPrimo = true;
      
      for(int i = 2; i < n; i++) {
        if ((n % i) == 0) {
          esPrimo = false;
        }
      }
      
      // si n es primo, se muestra por pantalla
      if (esPrimo) {
        System.out.print(n+ " ");
      }
    }
  }
}
