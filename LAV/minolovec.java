import java.util.Random;

class minolovec {
  public static void main(String[] args) {
    int vrstic = 20, stoplcev = 20;
    int[][] m = new int[vrstic][stoplcev];
    izpis(m);
    Random r = new Random();
    int stBomb = 20;
    for (int i = 0; i < stBomb; i++) {
      int vrstica = r.nextInt(vrstic);
      int stolpec = r.nextInt(stoplcev);
      if (m[vrstica][stolpec] == 9)
        i--;
      m[vrstica][stolpec] = 9;
    }
    izpis(m);
  }

  public static void izpis(int tab[][]) {
    for (int i = 0; i < tab.length; i++) {
      for (int j = 0; j < tab[i].length; j++)
        System.out.print(tab[i][j]);
      System.out.println();
    }
    System.out.println();
  }
}
