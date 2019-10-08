import java.util.Scanner;
public class Ejercicio12T3 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzxa nota del primer examen: ");
    double nota1 = Double.parseDouble(s.nextLine());
    System.out.print("¿Qué nota quieres sacar en el trimestre? ");
    double media = Double.parseDouble(s.nextLine());
    
    double nota2 = (media - nota1 * 0.4) / 0.6;
     System.out.println("Para tener un " +media+ " en el trimetre necesitas sacar " +nota2+ " en el segundo examen");
  }
}
