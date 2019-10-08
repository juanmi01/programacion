public class Ejercicio3T3 {
  public static void main(String[] args) {
  String linea;
  System.out.print("Por favor, inserte las pesetas  que quiera convertir: ");
  linea = System.console().readLine();
  int pesetas;
  pesetas  = Integer.parseInt( linea );
  double euros;
  euros = pesetas  * 166.386 ;
  System.out.println("euros: " +euros);
  }
}
