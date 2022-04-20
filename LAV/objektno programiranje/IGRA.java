import java.util.Random;
public class IGRA {
  public static void main(String[] args) {
    DelilniZep vseKarte=new DelilniZep(52);
		String[] barve={"Srce","Pik","Karo","Kriz"};
		for(int i=0;i<4;i++){
			for(int j=2;j<=14;j++){
				vseKarte.dodajKarto(new Karta(barve[i],j));
			}
		}

		vseKarte.premesaj(500);

		DelilniZep igralec1 = new DelilniZep(26);
		DelilniZep igralec2 = new DelilniZep(26);

		for(int i=0;i<Math.min(igralec1.dz.length,igralec2.dz.length);i++){
			igralec1.dodajKarto(vseKarte.vzemiKarto());
			igralec2.dodajKarto(vseKarte.vzemiKarto());
		}
			/*
		System.out.println("karte igralca 1");
		igralec1.izpis();
		System.out.println("karte igralca 2");
		igralec2.izpis();*/

		//izdelava igre
		for(int i=0;i<Math.min(igralec1.dz.length,igralec2.dz.length);i++){
			Karta k1= igralec1.vzemiKarto();
			Karta k2= igralec2.vzemiKarto();
			if(k1.primerjaj(k2)==1)
				System.out.println("zmagal je igralec1");
			else if(k1.primerjaj(k2)==-1)
				System.out.println("zmagal je igralec2");
			else
				System.out.println("neodloceno");
		}
	}
}

class Karta{
	String barva;//pik,karo,križ ali srce
	int vrednost;//2,3,4,5,6,7,8,9,10,11,12,13,14
	
	public Karta (String barva,int vrednost){
		this.barva=barva;
		this.vrednost=vrednost;
	}

	public void izpis(){
		System.out.println(barva+" "+vrednost);
	}

	public int primerjaj(Karta k){
		if(this.vrednost>k.vrednost)
			return 1;
		if(this.vrednost<k.vrednost)
			return -1;
		return 0;
	}

}

class DelilniZep{
	Karta [] dz;
	int index=0;
	
	public DelilniZep(int kapaciteta){
		this.dz = new Karta[kapaciteta];
	}

	public void izpis(){
		for(int i=0;i<this.dz.length;i++)
			this.dz[i].izpis();
	}
	
	public void premesaj(int menjav){
		Random r=new Random();
		for(int i=0;i<menjav;i++){
			int n1=r.nextInt(this.dz.length-1);
			int n2=r.nextInt(this.dz.length-1);
			Karta tmp= this.dz[n1];
			this.dz[n1]=this.dz[n2];
			this.dz[n2]=tmp;
		}
	}

	public void dodajKarto(Karta k){
		this.dz[this.index++]=k;			
	}
	
	public Karta vzemiKarto(){
		return this.dz[--this.index];
	}
	
}
