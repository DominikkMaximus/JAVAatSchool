
public class Nasloga25 {

	public static void main(String[] args) {
		int n = 20304;
		int produkt = 1;
		while(n>0){
			if(n%10 != 0)
				produkt*=(n%10);
			n/=10;
		}
		System.out.println(produkt);
				
	
	
	}

}
