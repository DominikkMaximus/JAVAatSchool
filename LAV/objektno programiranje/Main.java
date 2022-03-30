public class Main {
  public static void main(String[] args) {
    /*Znamka z = new Znamka("Zimbabve",1920,"pokrajina",5);
    Znamka z2=new Znamka("Madagaskar",1930,"hribi",12.55);
   
		z.izpis();
    z2.izpis();
	*/
		Ulomek u= new Ulomek (1,5);
		Ulomek a= new Ulomek (16,80);
		
		u.izpis();
		a.izpis();
		//u.pokrajsaj();
		//u.izpis();
		System.out.println(u.equals(a));
  }
}
