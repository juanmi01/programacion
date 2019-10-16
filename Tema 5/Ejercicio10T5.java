import java.util.Scanner;
public class Ejercicio10T5 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double divisor= 0;
    double numero= 0;
    double suma = 0;
    do {
      System.out.print("Introduzca números, para parar introduzca un nímero negativo: ");
      numero = s.nextInt();
      divisor++;
      suma += numero;
    } while(numero>=0);
    double media = (suma - numero)/ (divisor -1);
    System.out.println("La media de los numeros ingresados previamente es de: " +media);
  }
}
