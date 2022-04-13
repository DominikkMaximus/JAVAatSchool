public class imenikoseb {
  public static void main(String[] args) {
		Oseba clovek1 = new Oseba("veseli", "burek", 69);
		Oseba clovek2 = new Oseba("veseli", "burek1", 75);
		Oseba clovek3 = new Oseba("veseli2", "burek", 4);
		Oseba clovek4 = new Oseba("veseli3", "burek", 54);
		Oseba clovek5 = new Oseba("veseli", "burek4", 27);
		clovek1.izpis();
    System.out.println();
		Imenik imenik1 = new Imenik(10);
		imenik1.addOseba(clovek1);
		imenik1.addOseba(clovek2);
		imenik1.addOseba(clovek3);
		imenik1.addOseba(clovek4);
		imenik1.addOseba(clovek5);
		imenik1.izpis();
		imenik1.delete("veseli","burek1");
		imenik1.izpis();
  }
}

class Oseba{
	String ime;
	String priimek;
	int id;
	public Oseba(String i, String p, int d){
		this.ime=i; this.priimek=p; this.id=d;}
	public void izpis(){
		System.out.println(ime);
		System.out.println(priimek);
		System.out.println(id);
	}
	
}

class Imenik{
	Oseba[] osebe;
	int index = 0;
	public Imenik(int velikost){
		osebe = new Oseba[velikost];
	}
	public void izpis(){
		for(int i=0;i<this.osebe.length;i++)
			if(this.osebe[i]!=null)
				System.out.println(this.osebe[i].ime +" "+this.osebe[i].priimek);
			else
				System.out.println(this.osebe[i]);
		System.out.println();
	}
	public void addOseba(Oseba clovek){
		osebe[index++] = clovek;
	}
	
	public int isci(String ime, String priimek){
		for(int i=0;i<this.index;i++)
			if(this.osebe[i].ime.equals(ime)&&this.osebe[i].priimek.equals(priimek))
				return i;
		return -1;
	}
	public void delete(String ime, String priimek){
		for(int brisi=isci(ime,priimek);brisi!=-1&&brisi<this.index+1&&brisi<this.osebe.length;brisi++)
			this.osebe[brisi]=this.osebe[brisi+1];		
	}
}
