import java.util.Scanner;
public class Ejercicio1T4 {
  public static void main(String[] args) {
    String diaDelaSemana="";
    
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un dia de la semana: ");
    String semana = s.nextLine();
    
    switch (semana) {
      case "Lunes":
        diaDelaSemana = "ED";
        break;
      case "Martes":
        diaDelaSemana = "PRO";
        break;
      case "Miércoles":
        diaDelaSemana = "PRO";
        break;
      case "Jueves":
        diaDelaSemana = "PRO";
        break;
      case "Viernes":
        diaDelaSemana = "FOL";
        break;
      default:
        diaDelaSemana="¿Cómo?";
    }
    System.out.println("La asignatura que te toca es: " + diaDelaSemana);
    
  }
}
