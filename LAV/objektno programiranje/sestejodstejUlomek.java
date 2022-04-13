public class Main {
  public static void main(String[] args) {
    Ulomek prvi=new Ulomek(2,4);
		Ulomek drugi=new Ulomek(5,8);
		prvi.izpis();
		drugi.izpis();
		System.out.println(prvi.primerjava(drugi));
		Ulomek.izpisi(prvi.sestevaj(drugi));
		Ulomek.izpisi(prvi.odstevanje(drugi));
  }
}

class Ulomek {
	public int stevec=0;
	public int imenovalec=1;

	public Ulomek(){}
	
	public Ulomek(int a, int b){
		this.stevec=a; this.imenovalec=b;
	}

	private Ulomek okrajsaj(Ulomek a){
		Ulomek okrajsan = new Ulomek(stevec,imenovalec);
		for(int i=a.imenovalec;i>1;i--){
			if(a.imenovalec%i==0&&a.stevec%i==0){
				okrajsan.stevec=a.stevec/i;
				okrajsan.imenovalec=a.imenovalec/i;
				break;
			}
		}
		return okrajsan;
	}
	public void izpis(){
		System.out.println(this.stevec+"/"+this.imenovalec);
	}
	public static void izpisi(Ulomek a){
		System.out.println(a.stevec+"/"+a.imenovalec);
	}
	public int primerjava(Ulomek a){
		if(this.stevec*a.imenovalec>a.stevec*this.imenovalec)
			return 1;
		if(this.stevec*a.imenovalec==a.stevec*this.imenovalec)		
			return 0;
		return -1;
	}
	public Ulomek sestevaj(Ulomek a){
		int stev1=this.stevec*a.imenovalec;
		int stev2=a.stevec*this.imenovalec;
		int imenovalec=a.imenovalec*this.imenovalec;
		Ulomek stevilo = new Ulomek(stev1+stev2,imenovalec);
		return okrajsaj(stevilo);
	}
	public Ulomek odstevanje(Ulomek a){
		int stev1=this.stevec*a.imenovalec;
		int stev2=a.stevec*this.imenovalec;
		int imenovalec=a.imenovalec*this.imenovalec;
		Ulomek stevilo = new Ulomek(stev1-stev2,imenovalec);
		return okrajsaj(stevilo);
	}
}
