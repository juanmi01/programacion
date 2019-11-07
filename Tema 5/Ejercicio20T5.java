import java.util.Scanner;

public class Ejercicio20T5 {

  public static void main(String[] args){
    
    Scanner s = new Scanner(System.in);
    
    System.out.print("Por favor, introduzca la altura de la pirámide: ");
    int alturaIntroducida = s.nextInt();

    System.out.print("Introduzca el carácter de relleno: ");
    String relleno = s.next();
    
    int i = 0;
    int altura = 1;
    int espacios = alturaIntroducida-1;
    int espaciosInternos = 0;
    
    while (altura < alturaIntroducida) {
      
      // inserta espacios
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }

      // pinta la línea
      System.out.print(relleno);
      for (i = 1; i < espaciosInternos; i++) {
        System.out.print(" ");
      }
      
      if (altura>1) {
        System.out.print(relleno);
      }
      
      System.out.println();
      altura++;
      espacios--;
      espaciosInternos += 2;
      
    }
    
    // base de la piramide 
    for ( i = 1; i < altura * 2; i++) {
      System.out.print(relleno);
    }
    
  }
}
