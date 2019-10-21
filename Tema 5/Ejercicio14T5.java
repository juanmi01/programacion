import java.util.Scanner;
public class Ejercicio14T5 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
  
    System.out.print("Introduzca un número real como base: ");
    double base = s.nextInt();
    System.out.print("Introduzca un número entero como exponente: ");
    int exponenteF = s.nextInt();
  
    double potencia;
    int exponente;
  
    for(int i = 1; i <= exponenteF; i++) {
      potencia = 1;
      exponente = i;
    
      for(int j = 0; j < exponente; j++) {
        potencia *= base;
      }
    
    System.out.println(base + "^" +i+ " = " +potencia);
    }
  }
}
  

  
       
    
