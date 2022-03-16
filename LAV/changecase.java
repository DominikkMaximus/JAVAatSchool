
class changecase {
  public static void main(String[] args) {
    String niz="ABCDEFGHIJKLMNOPRSTUVZQWYXabcdefghijklmnoprstuvzqwyx0123456789";
    StringBuffer sb = new StringBuffer(niz);
    for(int i=0;i<sb.length();i++){
      if(Character.isUpperCase(sb.charAt(i)))
        sb.setCharAt(i,((sb.charAt(i)+"").toLowerCase()).charAt(0));
      else if(Character.isLowerCase(sb.charAt(i)))
        sb.setCharAt(i,((sb.charAt(i)+"").toUpperCase()).charAt(0));
    }
    System.out.println(sb);
  }
}
