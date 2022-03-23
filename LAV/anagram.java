class Main {
  public static void main(String[] args) {
    System.out.println(anagrama("danes je lep dan","je danes lep daan"));
  }
  public static boolean anagrama(String niz, String niz2){
    if(Math.max(niz.length(),niz2.length())==niz.length()){
      String tmp=niz;
      niz=niz2;
      niz2=tmp;
      }
    for(int i=0;i<niz2.length();i++){
      if(niz.indexOf(niz2.charAt(i))<0)
        return false;
    }
    return true;
  }
}
