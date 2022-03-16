import java.util.Random;
class nakljucnogeslo {
  public static void main(String[] args) {
    String mozniZnaki ="ABCDEFGHIJKLMNOPRSTUVZQWYXabcdefghijklmnoprstuvzqwyx0123456789", geslo="";
    Random r=new Random();
    for(int i=0;i<8;i++)
      geslo=geslo.concat(""+mozniZnaki.charAt(r.nextInt(mozniZnaki.length())));
    System.out.println(geslo);
  }
}
