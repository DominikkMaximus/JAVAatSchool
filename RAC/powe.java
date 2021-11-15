public class powe{

     public static void main(String []args){
       int x=4;
       int n=0;
       double fak=1;
       double stevec = Math.pow(x,n);
       double e=stevec/fak;
       for(n=1;n<100;n++){
           fak*=n;
           stevec*=x;
           e+=stevec/fak;
       }
       System.out.println(e);
     }
}
