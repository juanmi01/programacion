import java.util.Scanner;
public class Ejercicio9T3 {
  public static void main(String [] args) {
    Scanner s= new Scanner(System.in);
    
    System.out.print("Introduzca el radio del cono: ");
    double r = Double.parseDouble(s.nextLine());
    System.out.print("Introduzca la altura del cono: ");
    double h = Double.parseDouble(s.nextLine());
    
    double V =   (Math.PI  * (r * r) * h)/3l;
    
    System.out.printf("El volumen del cono es: %8.2f cm3 " ,V);
  }
}
