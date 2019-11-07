import java.util.Scanner;

public class Ejercicio23T5 {

  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
  
    System.out.println("Vaya introduciendo números hasta que la suma de estos de 10000: ");
  
    int numero;
    int suma = 0;
    int contador = 0;
  
    do {
      numero = s.nextInt(); 
      suma += numero;
      contador++;
    } while (suma<= 10000);
  
    System.out.println("EL numero total de números introducidos es de: " + contador + "  números");
    System.out.println("La suma total es: " +suma);
    System.out.println("La media es: " +suma / contador);
  }
}
