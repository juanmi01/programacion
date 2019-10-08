public class Ejercicio1T3 {
  public static void main(String[] args) {
  String linea;
  System.out.println("Por favor inserte un número entero: ");
  linea = System.console().readLine();
  int numero1 = Integer.parseInt( linea );
  System.out.print("intruduce otro número entero: ");
  linea = System.console().readLine();
  int numero2 = Integer.parseInt( linea);
  int total;
  total = numero1 * numero2;
  System.out.println(" El producto de los dos números anteriores es: " +total);
 }
}
