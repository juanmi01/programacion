import java.util.Scanner;

public class Ejercicio5T4 {
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  
  System.out.println("Este programa resuelve ecuaciones tipo ax+b=0");
  System.out.print("Introduzca el valor de a: ");
  int a= in.nextInt();
  System.out.print("Introduzca el valor de b: ");
  int b= in.nextInt();  
  
  if (a==0) {
    System.out.println("Esta ecuación no tiene solución real");
  } else {
    int total;
    total = (-b) / a;
    System.out.println("El valor de x es: " +total);
  }
  }
}
