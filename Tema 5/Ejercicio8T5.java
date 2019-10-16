import java.util.Scanner;
public class Ejercicio8T5 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Introduzca un entero para mostrarle su tabla de multiplicar: ");
    int mul = teclado.nextInt();
    int i= 0;
    while(i < 11) {
      System.out.println(mul+" * " + i + " = " +mul * i);
      i++;
    }
  }
}
