public class Ejercicio2T3 {
  public static void main(String[] args) {
  String linea;
  System.out.print("Por favor, inserte los euros que quiera convertir: ");
  linea = System.console().readLine();
  int euros;
  euros = Integer.parseInt( linea );
  double pesetas;
  pesetas = 166.386 + euros;
  System.out.println("pesetas: " +pesetas);
  }
}
