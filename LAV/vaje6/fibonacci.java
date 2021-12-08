import java.util.Scanner;
public class fibonacci {

	public static void main(String[] args) {
		System.out.println("Vnesi zeleni clen fibonaccijevega zaporedja");
		Scanner vhod = new Scanner(System.in);
		int n = vhod.nextInt();
		vhod.close();
		int a=0, b=1, tmp;
		while(n>2){
			tmp=a;
			a=b;
			b+=tmp;
			n--;
		}
		System.out.println(b);
	}

}
