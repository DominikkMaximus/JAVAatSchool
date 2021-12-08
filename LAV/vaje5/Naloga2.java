
import java.util.Random;
public class Naloga2 {

	public static void main(String[] args) {
		//vnos
		Random r = new Random();
		int x1 = 0;
		int y1 = 0;
		int x2 = 1500;
		int y2 = 700;
		int minX = Math.min(x1, x2);
		int maxX = Math.max(x1, x2);
		int minY = Math.min(y1, y2);
		int maxY = Math.max(y1, y2);
		
		for(int i =0; i<1000; i++){
		int x = r.nextInt(1940)-20; // [-20,1929]
		int y = r.nextInt(1120)-20; //[-20,1099]
		
		//priemrjanje ali je x znotraj oz. na meji pravokotnika
		if (x>minX && x<maxX && y>minY && y<maxY)
				//System.out.println("Toèka je znotraj pravokotnika");
			;
		//else
			if(x==minX || x== maxX || y == minY || y == maxY)
			System.out.println("Toèka je na robu pravokotnika");
		//else if((x<minX || x>maxX)&&(y<minY || y>maxY))
			//System.out.println("Toèka ni v pravokotniku");
		}
			
	}

}
