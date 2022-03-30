class Ulomek{
	int stevec;
	int imenovalec;

	public Ulomek(int st,int im){
		stevec=st;
		imenovalec=im;
	}
	public void izpis(){
		System.out.println(stevec+"/"+imenovalec);
	}
	public int delitelj(){
		for(int i=Math.min(stevec,imenovalec);i>1;i--){
			if(stevec%i==0&&imenovalec%i==0)
				return i;
		}
		return 1;
	}
	public void pokrajsaj(){
		int del=delitelj();
		stevec/=del;
		imenovalec/=del;
	}
	public boolean equals (Ulomek a){
		pokrajsaj();
		a.pokrajsaj();
		if(stevec==a.stevec&&imenovalec==a.imenovalec)
			return true;
		return false;
	}
}
