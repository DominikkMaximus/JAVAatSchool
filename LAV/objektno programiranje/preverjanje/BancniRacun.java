class BancniRacun {

int stanje; int limit;



	BancniRacun(){

		this.stanje=0;

		this.limit=500;

	}

	

	BancniRacun(int s, int l){

		this.stanje=s; this.limit=l;

	}



	void polog(int znesek){

		this.stanje+=znesek;

	}

	boolean dvig(int znesek){

				if(this.stanje+this.limit>=znesek)

			return  true;

		return false;

	}



	void spremeniLimit(int novLimit)

	{

		this.limit=novLimit;

	}

	void pripisObresti(double odstotek){

		this.stanje=(int) (this.stanje*(1+odstotek));

	}

	int vrniStanje(){return this.stanje;}

	int vrniLimit(){return this.limit;}

}
