import java.util.Scanner;

public class zvezdice {

	public static void main(String[] args) {
		Scanner vhod = new Scanner(System.in);
		System.out.println("vnesi velikost kvadrata");
		int n = vhod.nextInt();
		vhod.close();

		for (int i = 0; i < n; i++) {
			if (i == 0 || i == (n - 1))
				for (int j = 0; j < n; j++)
					System.out.print('*');
			else
				for (int j = 0; j < n; j++) {
					if (j == 0 || j == (n - 1))
						System.out.print('*');
					else
						System.out.print(' ');
				}
			System.out.println();

		}
	}

}
