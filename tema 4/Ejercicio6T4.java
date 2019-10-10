import java.util.Scanner;
public class Ejercicio6T4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce la altura en la que se encuentra el objeto: ");
        double h = in.nextDouble();
        double t;
        t = (2 * h) / 9.81;

        if (t<0) {
            System.out.println("Error, la ecuación es erronea puesto que lo de dentro de la raiz es negativo");
        } else {
            double t2 = Math.sqrt(t);
            System.out.print("El objeto tardará en caer desde " +h+ " m: "+t2+ " sg");
    
        }
    }
}
