 public static void main(String[] args) {
    System.out.println(ujemanje("danes je lep dan","danes je lep dan"));
  }
  public static int ujemanje(String niz, String niz2){
    int podobnost=0;
    for(int i=0;i<Math.min(niz.length(),niz2.length());i++){
      if(niz.charAt(i)==niz2.charAt(i))
        podobnost++;
    }
    return podobnost;
  }
