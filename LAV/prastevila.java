import java.util.Scanner;

public class prastevila {

	public static void main(String[] args) {
		Scanner vhod = new Scanner(System.in);
		int stevec = vhod.nextInt();
		vhod.close();
		boolean prastevilo = true;
		int i = 2;
		int n = 1;
		if (stevec != 0)
			System.out.println(2);
		while (n < stevec) {
			for (int j = 2; j < Math.ceil(Math.sqrt(i) + 1); j++) {
				if (i % j == 0) {
					prastevilo = false;
					break;
				} else
					prastevilo = true;
			}
			if (prastevilo) {
				System.out.println(i);
				n++;
			}
			i++;
		}
	}

}
