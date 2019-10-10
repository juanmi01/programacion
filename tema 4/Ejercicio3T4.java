import java.util.Scanner;
public class Ejercicio3T4 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
  
    System.out.print("Escriba un número del 1 al 7 para decir el día de la semana: ");
    int semana = in.nextInt();
  
    String DiadelaSemana;
  
    switch(semana) {
      case 1:
        DiadelaSemana = "Lunes";
        break;
      case 2:
        DiadelaSemana = "Martes";
        break;
      case 3:
        DiadelaSemana = "Miércoles";
        break;
      case 4:
        DiadelaSemana = "Jueves";
        break;
      case 5:
        DiadelaSemana = "Viernes";
        break;
      case 6:
        DiadelaSemana = "Sábado";
      case 7:
        DiadelaSemana = "Domingo";
        break;
      default:
        DiadelaSemana = "Error";
  }
    System.out.println("Semana " +semana+ ": " +DiadelaSemana);
    
  }
}
