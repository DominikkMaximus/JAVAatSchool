
public class Naloga26 {

	public static void main(String[] args) {
		int spMeja = 0;
		int zgMeja = 10000;
		int vsotaDel = 0;
		for (int i = spMeja; i <= zgMeja; i++) {
			// za vsak i seštej njegove prave delitelje
			for (int j = 1; j <= i/2; j++)
				if (i % j == 0)
					vsotaDel += j;
			if (vsotaDel == i)
				System.out.println(i);
			vsotaDel = 0;
		}
		System.out.println("konec");

	}

}
