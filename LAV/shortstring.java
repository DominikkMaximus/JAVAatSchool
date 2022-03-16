class shortstring {
  public static void main(String[] args) {
    String niz="AAAAAABBCCCCCDDDDDEFFFFF", kratko="";
    for(int i=0;i<niz.length();i++){
      int j=i+1, stevec=1;
        if(i>0)stevec=2;
      while(niz.charAt(i)==niz.charAt(j)&&j<niz.length()-1){
        stevec++;
        j++;
      }
      kratko=kratko.concat(niz.charAt(i)+""+stevec);
      i=j;
    }
    System.out.println(kratko);
  }
}
