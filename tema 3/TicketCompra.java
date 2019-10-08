public class TicketCompra {
  public static void main(String[] args) {
    
    //producto 1
    
    String nombre1;
    
    System.out.print("Introduzca el nombre del primer producto: ");
    nombre1 = System.console().readLine();
    
    String linea1;
    
    System.out.print("Introduzca la cantidad del producto comprado: ");
    linea1 = System.console().readLine();
    int cant1;
    cant1 = Integer.parseInt( linea1 );
    
    System.out.print("Introduzca precio del producto comprado: ");
    linea1 = System.console().readLine();
    double prec1;
    prec1 = Double.parseDouble( linea1 );
    
    System.out.print("Introduzca tipo de IVA: ");
    linea1 = System.console().readLine();
    double pt1;
    pt1 = prec1 * cant1;
    double IVA1;
    IVA1 = Double.parseDouble( linea1 );
    double precioIva1;
    precioIva1 = (IVA1 / 100) * prec1;
    double pcI1;
    pcI1 = ((IVA1/100)/1) + IVA1;
    
    //producto 2
     
    String nombre2;
    
    System.out.print("Introduzca el nombre del segundo producto: ");
    nombre2 = System.console().readLine();
    
    String linea2;
    
    System.out.print("Introduzca la cantidad del producto comprado: ");
    linea2 = System.console().readLine();
    double cant2;
    cant2 = Double.parseDouble( linea2 );
    
    System.out.print("Introduzca precio del producto comprado: ");
    linea2 = System.console().readLine();
    double prec2;
    prec2 = Double.parseDouble( linea2 );
    System.out.print("Introduzca tipo de IVA: ");
    linea2 = System.console().readLine();
    double pt2;
    pt2 = prec2 * cant2;
    double IVA2;
    IVA2 = Double.parseDouble( linea2 );
    double precioIva2;
    precioIva2 = (IVA2 / 100) * prec2;
    double pcI2;
    pcI2 = ((IVA2/100)/1) + IVA2;
    
    //producto 3 
     
      String nombre3;
    
    System.out.print("Introduzca el nombre del tercer producto: ");
    nombre3 = System.console().readLine();
    
    String linea3;
    
    System.out.print("Introduzca la cantidad del producto comprado: ");
    linea3 = System.console().readLine();
    int cant3;
    cant3 = Integer.parseInt( linea3 );
    
    System.out.print("Introduzca precio del producto comprado: ");
    linea3 = System.console().readLine();
    double prec3;
    prec3 = Double.parseDouble( linea3 );
    
    System.out.print("Introduzca tipo de IVA: ");
    linea3 = System.console().readLine();
    double pt3;
    pt3 = prec3 * cant3;
    double IVA3;
    IVA3 = Double.parseDouble( linea3 );
    double precioIva3;
    precioIva3 = (IVA3 / 100) * prec3;
    double pcI3;
    pcI3 = ((IVA3/100)/1) + IVA3;
    
    // producto 4
    
      String nombre4;
    
    System.out.print("Introduzca el nombre del cuarto producto: ");
    nombre4 = System.console().readLine();
    
    String linea4;
    
    System.out.print("Introduzca la cantidad del producto comprado: ");
    linea4 = System.console().readLine();
    double cant4;
    cant4 = Double.parseDouble( linea4 );
    
    System.out.print("Introduzca precio del producto comprado: ");
    linea4 = System.console().readLine();
    double prec4;
    prec4 = Double.parseDouble( linea4 );
    
    System.out.print("Introduzca tipo de IVA: ");
    linea4 = System.console().readLine();
    double pt4;
    pt4 = prec4 * cant4;
    double IVA4;
    IVA4= Double.parseDouble( linea4 );
    double precioIva4;
    precioIva4 = (IVA4 / 100) * prec4;
    double pcI4;
    pcI4 = ((IVA4/100)/1) + IVA4;
    
    double pT = pt1 + pt2 + pt3 + pt4;
    
    System.out.printf("%-10s %10s %10s %10s %7.8s\n", "Producto", "Cantidad", "Precio total $", "Precio IVA", "IVA");
    System.out.printf("%-10s %10s %10s %10s %10s\n", nombre1,  cant1, prec1, pcI1, precioIva1);
    System.out.printf("%-10s %10s %10s %10s %10s\n", nombre2,  cant2, prec2, pcI2, precioIva2);
    System.out.printf("%-10s %10s %10s %10s %10s\n", nombre3,  cant3, prec3, pcI3, precioIva3);
    System.out.printf("%-10s %10s %10s %10s %10s\n", nombre4,  cant4, prec4, pcI4, precioIva4);
    System.out.printf("%-10s\n", "precio total: ", pT);
  }
}
