import java.util.Scanner;
public class Naloga32 {

	public static void main(String[] args) {
		Scanner vhod = new Scanner(System.in);
		int a = vhod.nextInt();
		vhod.close();
		System.out.println(a);
		while (a != 1) {
			if (a % 2 == 0)
				a /= 2;
			else
				a = 3 * a + 1;
			System.out.println(a);
		}

	}

}
