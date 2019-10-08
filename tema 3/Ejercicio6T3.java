public class Ejercicio6T3 {
  public static void main(String[] args) {
    String linea;
    System.out.print("Introduzca un de los dos lados más largos del rectángulo ");
    linea = System.console().readLine();
    int l1;
    l1 = Integer.parseInt( linea);
    System.out.print("Introduzca uno de los dos lados más cortos del rectángulo ");
    linea = System.console().readLine();
    int l2;
    l2 = Integer.parseInt( linea );
    int area;
    area = l1 * l2;
    System.out.print("La área del rectángulo es " +area);    
  }
}
