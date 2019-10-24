import java.util.Scanner;
public class Ejercicio18T5 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un número inicial: ");
    int numeroi = s.nextInt();
    System.out.print("Introduzca un número final: ");
    int numerof = s.nextInt();
    
    for(int i = numeroi; i<=numerof; i+= 7) {
      System.out.print(i + " ");
    }
  }
}
