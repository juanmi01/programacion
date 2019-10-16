import java.util.Scanner;
public class Ejercicio9T5 {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  
  int numero;
  int i;
  int digito = 1;
  System.out.println("Introduce el número entero: ");
  numero = s.nextInt();
  i = numero;
  while (i>10) {
    i /= 10;
    digito++;
  }
  System.out.println("El número introducido tiene: " +digito+ " dígitos");
  }
}
