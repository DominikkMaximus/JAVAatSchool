
  public static void stejbesedesoglsam(String[] args) {
    String niz="srgis giosečg ačeo iurhb ieghs il.";
    int besede=1, sam=0,sogl=0;
    String samog="aeiouAEIOU";
    for(int i=0;i<niz.length();i++){
      char znak=niz.charAt(i);
      if(Character.isLetter(znak)){
        if(samog.indexOf(znak)>=0)
          sam++;
        else sogl++;
      }
      else if(Character.isWhitespace(znak))
        besede++;
   }
    System.out.println("Samoglasnikov "+sam +" soglasnikov "+sogl+" besed "+besede);
  }
