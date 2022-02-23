   public static void stejsubstring(String[] args) {
    String besedilo ="danes je lep dan";
    String substring = "dan";
    int stPonvitev =stejPonovitve(besedilo,substring); 
    System.out.println(stPonvitev);
  }
  public static int stejPonovitve(String niz, String substring){
    int stPonovitev=0;
    int index=0;
    while((index=niz.indexOf(substring,index))!=-1){
  
      stPonovitev++;
      index+=substring.length();
      System.out.println(stPonovitev);
    }
    return stPonovitev;
  }
