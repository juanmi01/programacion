import java.util.Scanner;
public class Ejercicio7T4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduzca la media de tus tres notas introducidos por un espacio: ");
        double n1 = in.nextDouble();
        double n2 = in.nextDouble();
        double n3 = in.nextDouble();

        double media = ( n1 + n2 + n3 ) / 3; 

        System.out.println("La media de las tres notas introducidas es de:" +media);
    }
    
}
