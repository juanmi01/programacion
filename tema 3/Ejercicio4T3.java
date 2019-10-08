public class Ejercicio4T3 {
  public static void main(String[] args) {
    String linea;
    System.out.print("Introduce un número entero ");
    linea = System.console().readLine();
    int numero1;
    numero1 = Integer.parseInt( linea );
    System.out.print("Introsuzca un segundo número entero ");
    linea = System.console().readLine();
    int numero2;
    numero2 = Integer.parseInt( linea );
    int suma = numero1 + numero2;
    int resta = numero1 - numero2;
    int mul = numero1 * numero2;
    double div = numero1 / numero2;
    System.out.println("La suma de los dos números ingresados es " +suma);
    System.out.println("La resta de los dos números ingresados es " +resta);
    System.out.println("La multiplicación de los dos números ingresados es " +mul);
    System.out.printf("La división de los dos números ingresados es %1.8f" ,div);
  }
}
