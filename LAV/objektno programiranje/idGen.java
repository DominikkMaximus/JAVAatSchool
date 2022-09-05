class idGen {
	public static void main(String[] args) {
		for(int i=0;i<100;i++){
			System.out.println(new Evidenca("a","b").id);
		}
	}
}
class Evidenca{
	static int num = 1;
	int id;
	String ime;
	String priimek;

	Evidenca(String i, String p) {
		this.id = num++;
		this.ime = i;
		this.priimek = p;
	}
}
