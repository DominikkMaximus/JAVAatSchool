
public class macke {

	public static void main(String[] args) {
		long misi = 1111111;
		int macke;
		for(int i =2; i<Math.ceil(Math.pow(misi,0.5))+1;i++){
			if(misi%i==0){
				macke = i;
				System.out.println("St. mack = " +macke+", Stevilo misi na macko = " + (misi/macke));
				break;
			}
		
		}

	}

}
