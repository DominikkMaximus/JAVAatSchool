class Main {
	public static void main(String[] args) {

	}
}

class vozilo {
	double dolzina;
	int masa, st_oseb;

	vozilo(double a, int b, int c) {
		this.dolzina = a;
		this.masa = b;
		this.st_oseb = c;
	}
}

class avto extends vozilo {
	String barva;
	int cena;
	private String lastnikIme, lastnikPriimek;

	avto(String i, String p, String b, int c, double d, int m, int s) {
		super(d, m, s);
		this.lastnikIme = i;
		this.lastnikPriimek = p;
		this.barva = b;
		this.cena = c;

	}

	void setLastnik(String i, String p) {
		this.lastnikIme = i;
		this.lastnikPriimek = p;
	}

	void preberi() {
		System.out.println(this.lastnikIme + " " + this.lastnikPriimek);
	}

	String getLastnik() {
		return this.lastnikIme + " " + this.lastnikPriimek;
	}
}
