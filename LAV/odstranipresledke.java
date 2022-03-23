class odstranipresledke {
  public static void main(String[] args) {
    String niz1= "danes  je  lep   dan";
    String[] niz= niz1.split(" ");
    StringBuffer sb = new StringBuffer("");
    for(int i=0;i<niz.length;i++)
      if(niz[i].length()!=0)
        sb.append(String.valueOf(niz[i].charAt(0)).toUpperCase()+niz[i].substring(1)+" ");
    niz1 = sb.toString().trim();
    System.out.println(niz1);
  }
}
