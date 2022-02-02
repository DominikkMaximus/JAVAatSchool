
class zapstevilarotated {
  public static void main(String[] args) {
    int r[][] = new int[6][7];
    int stevilo = 1;
    for (int i = 0; i < r[0].length; i++)
      for (int j = 0; j < r.length; j++)
        r[j][i] = stevilo++;
    izpis2d(r);
  }
  static void izpis2d(int tab[][]) {
    for (int i = 0; i < tab.length; i++) {
      for (int j = 0; j < tab[i].length; j++) {
        System.out.print(tab[i][j] + " ");
      }
      System.out.println();
    }
  }
}
