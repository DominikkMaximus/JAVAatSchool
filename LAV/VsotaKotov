import java.util.Scanner;

public class VsotaKotov {

	public static void main(String[] args) {
		
		Scanner vhod = new Scanner(System.in);
		//vnos kotov
		System.out.println("Vnesi stopinje prvega kota: ");
		int alfaStopinje = vhod.nextInt();
		System.out.println("Vnesi minute prvega kota: ");
		int alfaMinute = vhod.nextInt();
		System.out.println("Vnesi sekunde prvega kota: ");
		int alfaSekunde = vhod.nextInt();
		System.out.println("Vnesi stopinje drugega kota: ");
		int betaStopinje = vhod.nextInt();
		System.out.println("Vnesi minute drugega kota: ");
		int betaMinute = vhod.nextInt();
		System.out.println("Vnesi sekunde drugega kota: ");
		int betaSekunde = vhod.nextInt();
		vhod.close();
		//sestevek brez prenosov
		int sestevekStopinje = alfaStopinje + betaStopinje;
		int sestevekMinute = alfaMinute + betaMinute;
		int sestevekSekunde = alfaSekunde + betaSekunde;
		
        
        //prenos
         if (sestevekSekunde > 59) {
			sestevekMinute = sestevekMinute + (sestevekSekunde / 60);
			sestevekSekunde = (sestevekSekunde % 60);
		}
		if (sestevekMinute > 59) {
			sestevekStopinje = sestevekStopinje + (sestevekMinute / 60);
			sestevekMinute = (sestevekMinute % 60);
		}
		
		//izpis
		System.out.println("Vsota kotov je " + sestevekStopinje + " stopinj, " + sestevekMinute + " minut, " + sestevekSekunde + " sekund.");
         
     }
}
