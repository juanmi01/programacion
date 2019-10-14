import java.util.Scanner;
public class Ejercicio9T4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Vamos a realizar un programa en el que solucione ecaciones de segundo grado");      
        System.out.print("Introduzca el valor de a: ");
        double a = in.nextDouble();
        System.out.print("Introduzca el valor de b: ");
        double b = in.nextDouble();
        System.out.print("Intrudzca el valor de c: ");
        double c = in.nextDouble();

        if((a==0)&&(b==0)&&(c==0)) {
            System.out.println("La ecuación tiene infinitas soluciones");
        } 
        if ((a==0)&&(b==0)&&(c!=0)) {
            System.out.println("Esta ecucación no tiene soluciones");
        } 
        if ((a==0)&&(b!=0)&&(c!=0)) {
            System.out.println("x1=x2: " +(-c/b));
        }
        if ((a!=0)&&(b!=0)&&(c!=0)){
            double raiz = b*b-(4*a*c);
            
            if (raiz<0) {
              System.out.print("No se puede calcular la ecuación");
            } else {
                System.out.println("x1:  " + (-b + Math.sqrt(raiz))/(2*a));
                System.out.println("x2: " + (-b - Math.sqrt(raiz))/(2*a));
            }
        }
    } 
}
