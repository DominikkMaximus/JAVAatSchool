import java.util.Scanner;
public class Naloga2 {

	public static void main(String[] args) {
		/*
		byte starost=25;
		short letoRojstva=1950;
		int steviloGlasov= 224254;
		long rezultatPotence= 8357298427288;
		char spol= 'M';
		float visina= 1.8;
		double teza = 81.874;
		boolean izposojeno =true;
		String besedilo = "Hello"+"World";
		*/
		
		Scanner vnos = new Scanner(System.in);
		
		System.out.println("Vnesi starost: " );
		byte starost = vnos.nextByte();
		//System.out.println(starost);
		
		System.out.println("Vnesi leto rojstva: " );
		short letoRojstva= vnos.nextShort();
		//System.out.println(letoRojstva);
		
		System.out.println("Vnesi  stevilo glasov: " );
		int steviloGlasov = vnos.nextInt();
		//System.out.println(steviloGlasov);
		
		System.out.println("Vnesi rezultat potence: " );
		long rezultatPotence = vnos.nextLong();
		//System.out.println(rezultatPotence);
		
		vnos.nextLine();
		System.out.println("Vnesi spol: " );
		char spol =vnos.nextLine().charAt(0);
		//System.out.println(spol);
		
		System.out.println("Vnesi visino: " );
		float visina = vnos.nextFloat();
		//System.out.println(visina);
		
		System.out.println("Vnesi tezo: " );
		double teza = vnos.nextDouble();
		//System.out.println(teza);
		
		System.out.println("Vnesi ali je izposojeno: " );
		boolean izposojeno = vnos.nextBoolean();
		//System.out.println(izposojeno);
		
		vnos.nextLine();
		System.out.println("Vnesi besedilo: " );
		String besedilo = vnos.nextLine();
		//System.out.println(besedilo);
		/*
		vnos.nextLine(); // omogoèa branje Stringa
		vnos.nextInt(); // omogoèa branje celih števil (int)
		vnos.nextDouble(); // omogoèa branje realnih števil (double)
		vnos.nextFloat(); // omogoèa branje realnih števil (float)
		vnos.nextLong(); // omogoèa branje velikih celih števil (long)
		vnos.nextShort(); // omogoèa branje manjših celih števil (short)
		vnos.nextByte(); // omogoèa branje najmanjših celih števil (byte)
		*/
		vnos.close();
		System.out.println("Starost: " +starost +", Leto rojstva: " + letoRojstva + ", Sevilo glasov: " +steviloGlasov + ", Rezultat potence: "+rezultatPotence+", Spol "+ spol + ", Visina: "+visina+", Teza: "+teza+", Izposojeno: "+ izposojeno + ", Besedilo: "+besedilo);
	}

}

