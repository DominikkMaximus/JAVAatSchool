import java.util.Random;

class Main {
  public static void main(String[] args) {
    int stevec9;
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
    int a, b, c, d;
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[i].length; j++) {
        if (m[i][j] == 0) {
          a = i - 1;
          b = i + 1;
          c = j - 1;
          d = j + 1;
          if (i == 0) {
            a = i;
            b = j + 1;
          }
          if (i == m.length - 1) {
            a = i - 1;
            b = i;
          }
          if (j == 0) {
            c = j;
            d = j + 1;
          }
          if (j == m[i].length - 1) {
            c = j - 1;
            d = j;
          }

          for (int k = a; k <= b; k++) {
            for (int l = c; l <= d; j++) {
              if (m[k][l] == 9) {
                stevec9++;
              }
            }
          }
        }
        m[i][j] = stevec9;
        stevec9 = 0;
      }
    }

    izpis(m);
  }

  public static void izpis(int tab[][]) {
    for (int i = 0; i < tab.length; i++) {
      for (int j = 0; j < tab[i].length; j++)
        System.out.print(tab[i][j] + " ");
      System.out.println();
    }
    System.out.println();
  }
}
