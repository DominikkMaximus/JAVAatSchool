  public static void jepalindrom(String[] args) {
    String niz="pericarezeracirep";
    //brez zanke
    StringBuffer reversed= new StringBuffer(niz);
    reversed.reverse();
    if(reversed.toString().compareTo(niz)==0){
      System.out.println("Je palindrom");
    }
    else
      System.out.println("Ni palindrom");
  
  //z zanko
  boolean jepalindrom=true;
  for(int i=0;i<niz.length()/2+1;i++){
    if(niz.charAt(i)!=niz.charAt(niz.length()-1-i)){
      jepalindrom=false;
      break;
    }
  }
  if(jepalindrom)
    System.out.println("Je palindrom");
  else
    System.out.println("Ni palindrom"); 
  }
