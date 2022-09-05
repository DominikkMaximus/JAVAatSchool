class Main {
	public static void main(String[] args) {
		Evidenca vsi [] = new  Evidenca[100];
		for(int i=0;i<vsi.length;i++){
			vsi[i]=new Evidenca("ime"+i,"priimek"+i);
		}
		for(int i=0;i<vsi.length;i++){
			System.out.println(vsi[i]);
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
	public String toString(){
		return this.ime+" "+this.priimek+" "+this.id;
	}
}
