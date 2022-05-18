class Atlet {
  int startna_st;
  String drzava;

  public Atlet(int ss, String d) {startna_st = ss; drzava = d;}

  public void izpis()
  {
    System.out.println("Startna številka: " + startna_st);
    System.out.printl("Država: " + drzava);
  }
}

class Skakalec extends Atlet{

	double d1;double d2;double d3;



	Skakalec(int s,String d,double d1,double d2,double d3){

		super(s,d);

		this.d1=d1;this.d2=d2;this.d3=d3;

	}

double najboljsiSkok(){

	if(d1>=d2&&d1>=d3)

		return this.d1;

	if(d2>=d1&&d2>=d3)

		return this.d2;

	return this.d3;

		

}

Skakalec boljsi(Skakalec s){

	if(this.najboljsiSkok()>=s.najboljsiSkok())

	return this;

	return s;

}

public void izpis(){

	super.izpis();

	System.out.println(this.d1);

	System.out.println(this.d2);

	System.out.println(this.d3);

}
