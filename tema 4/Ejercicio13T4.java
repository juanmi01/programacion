import java.util.Scanner;

public class Ejercicio13T4 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Indique tres numeros enteros separados con un espacio: ");
    int uno = in.nextInt();
    int dos = in.nextInt();
    int tres = in.nextInt();
    
    if(uno<dos) {
      if (uno<tres) {
        if(dos<tres) {
          System.out.println("El orden sería: " +tres + " > " +dos+ " > " +uno);
        } else if(tres<dos) {
          System.out.println("El orden sería: " +dos+ " > " +tres+ " > " +uno);
        }
      } else if (tres<uno) {
        System.out.println("El orden sería: " +dos+ " > " +uno+ " > " +tres);
      }
    } else if(dos<uno) {
      if(uno<tres) {
        System.out.println("El orden sería: " +tres+ " > " +uno+ " > " +dos);
      } else if(tres<uno) {
        if (tres<dos) {
          System.out.println("El orden sería: " +uno+ " > " +dos+ " > " +tres);
        } else if(dos<tres) {
          System.out.println("El orden sería: " +uno+ " > " +tres+ " > " +dos);
        }
      }
    }
  }
}
