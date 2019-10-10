import java.util.Scanner;
public class Ejercicio4T4 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Introduzca las horas trabajadas a la semana ");
    int horas = in.nextInt();
    
    if (horas< 0) {
      System.out.println("Error");      
     } else if  (horas<41) {
      int total1;
      total1 = horas * 12;
      System.out.println("Usted cobra: " +total1+ " a la semana");
    } else {
      int total2;
      total2 = horas * 16;
      System.out.println("Usted cobra: " +total2+ " a la semana");
    }
  }
}
