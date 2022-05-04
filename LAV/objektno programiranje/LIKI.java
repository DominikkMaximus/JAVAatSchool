class LIKI {
  public static void main(String[] args) {

		lik moj= new lik();
		moj.izpis();
		
		pravokotnik tvoj=new pravokotnik(1.0,2.0,4,5);
		tvoj.izpis();

		krog prvi =new krog(4.0,0,0);
		System.out.println(prvi.ploscina());

		prvi.premik(5,5);

		kvadrat drugi = new kvadrat(5);
		System.out.println(drugi.ploscina());
		drugi.izpis();
  }
}

class lik{

	private double x;
	private double y;

	public lik(){
		this.x=0;
		this.y=0;
	}
	
	public lik(int a,int b){
		this.x=a;
		this.y=b;
	}
	
	public void premik(int a, int b){
		this.x+=a;
		this.y+=b;
	}

	public void izpis(){
		System.out.println("x: "+this.x+" y: "+this.y);
	}
	
}

class pravokotnik extends lik{

	double a;
	double b;

	public pravokotnik(){}
	
	public pravokotnik(double a, double b){
		this.a=a;
		this.b=b;	
	}
	
	public pravokotnik(double a, double b, int x, int y){
		super(x,y);//klic konstruktorja nadrazreda
		this.a=a;
		this.b=b;
	}
	
	public double ploscina(){
		return this.a*this.b;
	}
	
	public double obseg(){
		return this.a*2+this.b*2;
	}	
	
}
	
class krog extends lik{
	double r;

	public krog(double radij){
		this.r=radij;
	}
	
	public krog(double radij, int x,int y){
		super(x,y);
		this.r=radij;
	}
	
	public double ploscina(){
		return Math.pow(this.r,2)*Math.PI;
	}
	
	public double obseg(){
		return 2*Math.PI*this.r;
	}
	
}

class kvadrat extends pravokotnik{

	public kvadrat(double a){
		super(a,a);
	}
	
}
