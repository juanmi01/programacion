import java.util.Scanner;

public class Ejercicio11T4 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Introduzca la hora y los minutos separados con un espacio: ");
    int hora = in.nextInt();
    int minutos = in.nextInt();
    
    int total1 = (hora * 3600) + (minutos * 60);
    int total2 = (24 * 3600) - total1;
    System.out.println("Faltan " +total2+ " sg para las 00:00");
  }
}
