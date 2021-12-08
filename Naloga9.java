import java.util.Scanner;
public class Naloga9 {
	//kalkulator
	public static void main(String[] args) {
		//vnos
		Scanner vhod = new Scanner(System.in);
		char operator = vhod.nextLine().charAt(0);
		double a = vhod.nextDouble();
		double b = vhod.nextDouble();
		
		vhod.close();
		double rezultat =0;
		// pogoji za izraèun
		if (operator == '+')
			rezultat = a+b;
		else if (operator == '-')
			rezultat = a-b;
		else if (operator == '*')
			rezultat = a*b;
		else if (operator == '/')
			rezultat = a/b;
		System.out.println(rezultat);

	}

}
