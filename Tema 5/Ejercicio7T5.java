import java.util.Scanner;
public class Ejercicio7T5 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int intentos = 4;
    boolean acertado = false; 
    do {
      System.out.print("Intrudzca la contraseña de la caja fuerte: ");
      int contraseña = in.nextInt();
      
      if(contraseña == 1234) {
        acertado = true;
      } else {
        System.out.println("Clave incorrecta");
      }
      
      intentos--;
    } while ((intentos > 0) && (!acertado));
    if (acertado) {
      System.out.println("Ha abierto la caja fuerte.");
    } else {
      System.out.println("Lo siento , ha agotado las 4 oportunidades.");
    }
    
  }
}
