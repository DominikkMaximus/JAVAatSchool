import java.util.Scanner;
public class Naloga4 {

	public static void main(String[] args) {
		//vnos vrednosti
		Scanner vhod = new Scanner(System.in);
		double vrednost1 = vhod.nextDouble();
		double vrednost2 = vhod.nextDouble();
		double vrednost3 = vhod.nextDouble();
		vhod.close();
		
		double v1 = vrednost1 + vrednost2;
		double v2 = vrednost1 + vrednost3;
		double v3 = vrednost2 + vrednost3;
		
		if(v1>=v2 && v1>v3)
			System.out.println(vrednost1 + " " + vrednost2);
		else if(v2>v1 && v2>v3)
			System.out.println(vrednost1 + " " + vrednost3);
		else
			System.out.println(vrednost2 + " " + vrednost3);
		
	}

}
