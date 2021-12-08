import java.util.Scanner;
public class Naloga3 {

	public static void main(String[] args) {
		Scanner vhod = new Scanner(System.in);
		int a = vhod.nextInt();
		int b = vhod.nextInt();
		double x = vhod.nextDouble();
		
		int zgornjameja = Math.max(a,b);
		int spodnjameja = Math.min(a,b);
		
		if(x<=zgornjameja&&x>=spodnjameja)
			System.out.println("X se nahajana zaprtem intervalu vnesenih stevil");
			else System.out.println("X se NE nahajana zaprtem intervalu vnesenih stevil");
		vhod.close();
	}

}
