public class izpisi {
  public static void main(String[] args) {
		
		Cas z=new Cas();
		Cas a=new Cas(7,45);
		
    System.out.println(z.ura+":"+z.min);
		z.izpis();
		System.out.println(z);
		
    System.out.println(a.ura+":"+a.min);
		a.izpis();
		System.out.println(a);
  }
}
class Cas{
	int ura;
	int min;
	public Cas(){ura=0;min=0;};
	public Cas(int u,int m){
		ura=u;min=m;
	};
	public void izpis(){
    System.out.println(this.ura+":"+this.min);
		
	}
	public String toString(){
		return this.ura+":"+this.min;
	}
}
