import java.util.Scanner;
public class Naloga7 {

	public static void main(String[] args) {
		
		Scanner vhod = new Scanner(System.in);
		int n = vhod.nextInt();
		vhod.close();
	
		for(int delitelj = 1;delitelj<=n;delitelj++)
			if(n%delitelj ==0)
				System.out.println(delitelj);
	}

}
