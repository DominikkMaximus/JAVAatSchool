import java.util.Scanner;
public class Vaja2 {

	public static void main(String[] args) {
		Scanner vnos = new Scanner(System.in);
		int x = vnos.nextInt();
		int prvaStevka =0;
		int drugaStevka = 0;
		int tretjaStevka = 0;
		int cetrtaStevka = 0;
		
		prvaStevka += (x%10)*1000;
		drugaStevka += (Math.pow(((x/100)),2)%10)*100;
		tretjaStevka += (Math.pow((x/10),2)%10)*10;
		cetrtaStevka += ((x/1000)%10)*1;
		int novoStevilo = prvaStevka+drugaStevka+tretjaStevka+cetrtaStevka;
		System.out.println(novoStevilo);
		vnos.close();
	}

}
