import java.util.Scanner;

public class Ejercicio21T5 {

  public static void main(String[] args) {
  
    Scanner s = new Scanner(System.in);
    
    System.out.println("Por favor, vaya introduciendo números enteros.");
    System.out.println("Puede terminar mediante la introducción de un número negativo.");
    int numero;
    int i = 0;
    int contador = 0;
    int sumaImpares = 0;
    int contadorImpares = 0;
    int maximoPar = 0;
    
    do {
      numero = s.nextInt();
      
      if (numero >= 0) {
        contador ++;
        if ((numero % 2) == 1) {
          sumaImpares += numero;
          contadorImpares ++;
        } else {
          if (numero > maximoPar) {
            maximoPar = numero;
          }
        }
      }
    } while (numero >= 0);
    System.out.println("Ha introducido " + contador + " números");
    System.out.println("La media de los impares es " + sumaImpares/contadorImpares);
    System.out.println("El máximo de los pares es " + maximoPar);
  }
}

    
    
      
      
      
    
