import java.util.Random;

class Main {
  public static void main(String[] args) {
    int stevec9 = 0;
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

    // preštej in oštevilči prazne celice s številom bomb v soseščini
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[i].length; j++) {
        if (m[i][j] == 0) {
          for (int ii = i - 1; ii <= i + 1; ii++)
            for (int jj = j - 1; jj <= j + 1; jj++)
              if ((ii >= 0) && (jj >= 0) && (ii < vrstic) && (jj < stoplcev) && (m[ii][jj] == 9))
                stevec9++;
          m[i][j] = stevec9;
          stevec9 = 0;
        }
      }
    }
    izpis(m);
  }

  public static void izpis(int tab[][]) {
    for (int i = 0; i < tab.length; i++) {
      for (int j = 0; j < tab[i].length; j++)
      if(tab[i][j]==0)
        System.out.print(". ");
      else
        System.out.print(tab[i][j] + " ");
      System.out.println();
    }
    System.out.println();
  }
}
