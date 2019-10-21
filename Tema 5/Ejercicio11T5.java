import java.util.Scanner;
public class Ejercicio11T5 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un número: ");
    int numero = s.nextInt();
    
    for (int i = numero; i < numero + 5; i++) {
      System.out.printf("%4d %6d %8d\n", i, i * i, i * i * i);
      
    }
  }
}
