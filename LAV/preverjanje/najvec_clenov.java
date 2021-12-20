
public class najvec_clenov {

	public static void main(String[] args) {
		int stevec = 0, max = 0;
		int maxval = 0;
		for (int i = 100; i < 1000; i++) {
			int n = i;
			while (n != 1) {
				if (n % 2 == 0)
					n /= 2;
				else
					n = 3 * n + 1;
				stevec += 1;
			}
			if (stevec > max) {
				maxval = i;
				max = stevec;
			}
			stevec = 0;
		}System.out.println(maxval);

	}

}
