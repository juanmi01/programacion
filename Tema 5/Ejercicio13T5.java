import java.util.Scanner;
public class  Ejercicio13T5 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int negativos = 0;
    int positivos = 0;
      
    for (int i = 0; i <10; i ++) {
    System.out.print("Introduzca 10 números enteros: ");
    int numero = s.nextInt();
      if (numero < 0) {
        negativos++;
      } else {
        positivos++;
      }
    }
    System.out.println("Hay " +positivos+ " numeros positivos y " +negativos+ " numeros negativos");
  }
}
