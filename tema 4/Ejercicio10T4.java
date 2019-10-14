import java.util.Scanner;
public class Ejercicio10T4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String horoscopo = "";

        System.out.print("Introduce tu día y mes (1-12) de nacimiento: ");
        int dia = in.nextInt();
        int mes = in.nextInt();

        switch(mes) {
                case 1: 
                    if (dia<21) {
                        horoscopo = "Capricornio";
                    } else {
                        horoscopo = "Acuario";
                    }
                break;
                case 2:
                    if (dia<20) {
                        horoscopo = "Acuario";
                    } else {
                        horoscopo = "Piscis";
                    }
                case 3:
                    if (dia<21) {
                        horoscopo = "Piscis";
                    } else {
                        horoscopo = "Aries";
                    }
                break;
                case 4:
                    if (dia<22) {
                        horoscopo = "Aries";
                    } else {
                        horoscopo = "Tauro";
                    }
                break;
                case 5:
                    if (dia<22) {
                        horoscopo = "Tauro";
                    } else {
                        horoscopo = "Géminis";
                    }
                break;
                case 6:
                    if (dia<23) {
                        horoscopo = "Géminis";
                    } else{
                        horoscopo = "Cáncer";
                    }
                break;
                case 7:
                    if (dia<23) {
                        horoscopo = "Cáncer";
                    } else {
                        horoscopo = "Leo";
                    }
                break;
                case 8:
                    if (dia<25) {
                        horoscopo = "Leo";
                    } else {
                        horoscopo = "Virgo";
                    }
                break;
                case 9:
                    if (dia<25) {
                        horoscopo = "Virgo";
                    } else {
                        horoscopo = "Libra";
                    }
                break;
                case 10:
                    if (dia<25) {
                        horoscopo = "Libra";
                    } else {
                        horoscopo = "Escorpio";
                    }
                break;
                case 11:
                    if (dia<25) {
                        horoscopo = "Escorpio";
                    } else {
                        horoscopo = "Sagitario";
                    }
                break;
                    case 12:
                    if (dia<24) {
                        horoscopo = "Sagitario";
                    } else {
                        horoscopo = "Capricornio";
                    }
                break;
                default:
              }
            System.out.println("Tu horoscopo según el día y del mes es: " +horoscopo);

        }

}  



