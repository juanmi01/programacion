public class Ejercicio7T3 {
 public static void main(String[] args) {
  String linea;
  System.out.print("Introduzca la factura: ");
  linea = System.console().readLine();
  double factura;
  factura = Double.parseDouble( linea );
  double total = factura * 1.21;
  System.out.println("El total de la factura sobre la base ponible es: " +total);
 }
}

4
