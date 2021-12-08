import java.util.Scanner;
public class Naloga8 {

	public static void main(String[] args) {
		//vnos meseca in leta
		Scanner vhod = new Scanner(System.in);
		System.out.println("Vnesi mesec");
		int mesec = vhod.nextInt();
		System.out.println("Vnesi leto");
		int leto = vhod.nextInt();
		vhod.close();
		
		int stDni =  0;
		
		// Je prestopno leto?
		boolean prestopnoLeto = false;
		if(leto%4 == 0 && (leto%100 != 0 || leto%400 == 0))
			prestopnoLeto = true;
		//Stevilo dni v mesecu	
		switch(mesec){
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: stDni = 30 ;break;
		case 2: if(prestopnoLeto)stDni = 29;else stDni = 28;break;
		case 4: case 6: case 9: stDni = 30;break;
		default: System.out.println("Ni mesec");break;
		}
		//Izpis
		System.out.println("Mesec " + mesec+" leta "+ leto + " ima "+stDni +" dni." );
	}

}
