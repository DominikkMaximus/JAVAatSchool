class Main {
	public static void main(String[] args) {
		Delavec[] delavci = new Delavec[100];
		// a
		{
			Delavec najmanj = delavci[0];
			int minsum = -1;
			for (int i = 0; i < delavci.length; i++) {
				int sum = 0;
				int[] pl = delavci[i].getOd();
				for (int j = 0; j < pl.length; j++) {
					sum += pl[j];
				}
				if (sum < minsum) {
					minsum = sum;
					najmanj = delavci[i];
				}
			}
			System.out.println(najmanj.getPriimek() + " " + najmanj.getIme());
		}
		// b
		{
			int sum = 0;
			double count = 0;
			for (int i = 0; i < delavci.length; i++) {
				if (delavci[i].getZaposlitev().equals("nedolocen")) continue;
				int[] pl = delavci[i].getOd();
				for (int j = 0; j < pl.length; j++) {
					sum += pl[j];
					count++;
				}
				System.out.println("Povprecna placa: " + sum / count);
			}
		}
	}

class Delavec {
	private int matSt;
	private String priimek, ime;
	private int[] od = new int[12];
	private String zaposlitev; // dolocen, nedolocen

	String getPriimek() {
		return priimek;
	}

	String getIme() {
		return ime;
	}

	String getZaposlitev() {
		return zaposlitev;
	}

	int[] getOd() {
		return od;
	}
}
