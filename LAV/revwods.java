
class revwords {
  public static void main(String[] args) {
    String niz="ABCDEFGHIJKLMNOPRSTUVZQWYX abcdefghijklmnoprstuvzqwyx 0123456789";
    String tab[]=niz.split(" ");
    for(int i=0;i<tab.length;i++){
      tab[i] =new StringBuilder(tab[i]).reverse().toString();
    }
    String revNiz = String.join(" ",tab);
    System.out.println(revNiz);
  }
}
