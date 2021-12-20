public class statistika_metovkocke {

	public static void main(String[] args) {
		int met = 0, sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0, sum6 = 0;
		for (int i = 0; i < 1000; i++) {
			met = (int)(Math.random() * 6 + 1);
			switch (met) {
			case 1:
				sum1 += 1;
				break;
			case 2:
				sum2 += 1;
				break;
			case 3:
				sum3 += 1;
				break;
			case 4:
				sum4 += 1;
				break;
			case 5:
				sum5 += 1;
				break;
			case 6:
				sum6 += 1;
				break;
			}
		}
		System.out
				.println("1: " + sum1 + " 2: " + sum2 + " 3: " + sum3 + " 4: " + sum4 + " 5: " + sum5 + " 6: " + sum6);
	}

}
