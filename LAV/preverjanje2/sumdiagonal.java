class sumdiagonal {
  public static void main(String[] args) {
    int tab[][] = new int[9][9];
    //napolni tabelo, drugace sta vsoti 0
    int diagonal1 = 0;
    int diagonal2 = 0;
    for (int i = 0; i < tab.length; i++){
      diagonal1+=tab[i][i];
      diagonal2+=tab[tab.length-1-i][i];
    }
    S
