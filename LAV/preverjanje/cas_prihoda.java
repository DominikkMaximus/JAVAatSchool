import java.util.Scanner;

public class cas_prihoda {

	public static void main(String[] args) {
		Scanner vhod = new Scanner(System.in);
		System.out.println("vnesi uro");
		int ura = vhod.nextInt();
		System.out.println("vnesi minute");
		int min = vhod.nextInt();
		System.out.println("vnesi cas potovanja (minute)");
		int pot = vhod.nextInt();
		vhod.close();
		min +=pot;
		if (min > 59) {
			ura += (min / 60);
			min  %= 60;
		}
		ura %=24;
		System.out.println("ura: "+ura+" minute: "+min);

	}

}
