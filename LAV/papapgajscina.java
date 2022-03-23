public static void main(String[] args) {
    System.out.println(papagajscina("Danes je lep dan"));
  }
  public static String papagajscina(String niz){
    String samoglasniki="aeiouAEIOU";
    StringBuffer nizpapagajscina=new StringBuffer("");
    for(int i=0;i<niz.length();i++){
      if(samoglasniki.indexOf(niz.charAt(i))>=0)
        nizpapagajscina.append(niz.charAt(i)).append("p").append(niz.charAt(i));
      else
        nizpapagajscina.append(niz.charAt(i));
    }
    
    return nizpapagajscina.toString();
  }
