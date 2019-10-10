import java.util.Scanner;
public class Ejercicio2T4 {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in); 
    
    System.out.print("¿Que hora es? ");
    int hora = Integer.parseInt(in.nextLine());
    
    
    if((hora >=6)&&(hora <=12)) {
      System.out.println("¡Buenos días!");
    } 
    if ((hora>12)&&(hora<21)) {
      System.out.println("¡Buenas tardes!");
    } 
    if ((hora>=21)&&(hora<=24)||(hora>0)&&(hora<=5)) {
      System.out.println("¡Buenas noches!");
    }
    if ((hora>24)&&(hora<0)) {
      System.out.println("El dato introducido es erroneo");
    }
  }
}


