public class Main {
  public static void main(String[] args) {
    Ulomek prvi=new Ulomek(2,4);
		Ulomek drugi=new Ulomek(4,8);
		prvi.izpis();
		drugi.izpis();
		System.out.println(prvi.primerjava(drugi));
  }
}

class Ulomek {
	public int stevec=0;
	public int imenovalec=1;

	public Ulomek(){}
	
	public Ulomek(int a, int b){
		this.stevec=a; this.imenovalec=b;
	}
	public void izpis(){
		System.out.println(stevec+"/"+imenovalec);
	}
	public int primerjava(Ulomek a){
		if(this.stevec*a.imenovalec>a.stevec*this.imenovalec)
			return 1;
		if(this.stevec*a.imenovalec==a.stevec*this.imenovalec)		
			return 0;
		return -1;
	}
}
