
import java.util.Random;
class met_krogle {
  public static void main(String[] args) {
    int r[][] = new int[12][6];
    Random rand = new Random();
    for(int i=0;i<r.length;i++){
      for( int j=0;j<r[i].length;j++){
        r[i][j]= rand.nextInt(30);
      }
    }
    izpis2d(r);
    izpis1d(povprecjeSerije(r));

  }
  static void izpis2d(int tab[][]){
    for(int i=0;i<tab.length;i++){
      for( int j=0;j<tab[i].length;j++){
        System.out.print(tab[i][j]+" ");
      }
      System.out.println();
    }
  }
  static void izpis1d(double tab[]){
    for(int i =0;i<tab.length;i++)
    System.out.print(tab[i]+" ");
    System.out.println();
  }

  static double[] povprecjeSerije(int r[][]) {
    double[] rezultati = new double[r[0].length];
    for (int i = 0; i < r[0].length; i++) {
      double povprecje = 0;
      double stevec=0;
      for (int j = 0; j < r.length; j++) {
        if (r[j][i] > 0) {
          povprecje += r[j][i];
          stevec++;
        }
      }
      povprecje /= stevec;
      rezultati[i] = povprecje;
    }
    return rezultati;
  }
}
