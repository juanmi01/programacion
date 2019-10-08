import java.util.Scanner;
public class Ejercicio8T3s {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce las horas trabajadas al día y los dias trabajados a la semana separado con un espacio: ");
    int horas = s.nextInt();
    int dias = s.nextInt();
    int total = (dias * horas) * 12;
    System.out.println("Cobras a la semana: " + total);
  }
}
