public class Znamka{
  //lastnosti
  String drzava;
  int letnica;
  String motiv;
  double cena;
  //konstruktorji
  public Znamka(String d, int l, String m, double c){
    drzava=d;
		letnica=l;
		motiv=m;
		cena=c;
  }
	//metode
	public void izpis(){
		System.out.println("Drzava: "+drzava);
		System.out.println("Letnica: "+letnica);
		System.out.println("Motiv: "+motiv);
		System.out.println("Cena: "+cena);
	}
}
