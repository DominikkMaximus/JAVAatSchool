import java.util.Scanner;

public class Naloga12zvezdice {

	public static void main(String[] args) {
		Scanner vnos = new Scanner(System.in);
		int n = vnos.nextInt();
		vnos.close();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++)
				System.out.print(" ");
			for (int j = 0; j < 2 * i + 1; j++) {
				if (j % 2 != 0)
					System.out.print("o");
				else
					System.out.print('*');
			}

			System.out.println();
		}
	}

}
