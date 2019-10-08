public class Ejercicio5T3 {
  public static void main(String[] args){
    String linea;
    System.out.print("Inserte la base del triángulo ");
    linea = System.console().readLine();
    int base;
    base = Integer.parseInt( linea );
    System.out.print("Inserte la altura del trigángulo ");
    linea = System.console().readLine();
    int altura;
    altura = Integer.parseInt( linea );
    int mult = (base * altura) / 2;
    System.out.print("El área del triangulo es " +mult);
  }
} 
