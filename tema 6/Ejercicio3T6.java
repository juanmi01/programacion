
public class Ejercicio3T6 {

	public static void main(String[] args) {
		
		int paloNum;
		String palo = "";
		int cartaNum;
		String carta = "";
		
		paloNum = (int)(Math.random()*4) +1;
		cartaNum = (int)(Math.random()*10) + 1;
		
		switch (paloNum) { 
			case 1:
				palo  = "basto";
				break;
			case 2:
				palo = "oro";
				break;
			case 3:
				palo = "espada";
			case 4:
				palo = "copa";				
		}
		
		switch (cartaNum) {
			case 1: 
				carta = "As";
				break;
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
				carta = "" + cartaNum;
				break;
			case 8:
				carta = "Sota";
				break;
			case 9: 
				carta = "Caballo";
				break;
			case 10:
				carta =  "Rey";
				break;
			default:
		}
		
		System.out.println("La carta elegida es: " + palo + " - " +carta);
	}
}
	
