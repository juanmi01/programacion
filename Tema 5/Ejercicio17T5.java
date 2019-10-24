import java.util.Scanner;
public class Ejercicio17T5 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
   
    int numero= 0;
  
    do {
      System.out.print("Introduzca un número: ");
      numero= s.nextInt();
    
      if (numero<0){
        System.out.println("No es valido debe ser un número positivo");
      }
    } while(numero<0);
    
    int suma= 0;

    for (int i = numero; i < numero + 100; i++) {
      suma += i;
    }
    System.out.println("La suma total es: " +suma);
  }
}
