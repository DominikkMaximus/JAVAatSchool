import java.util.Scanner;
public class Zlitje{

     public static void main(String []args){
        
        Scanner vnos = new Scanner(System.in);
        System.out.println("Vnesi dve trimestni celi stevili");
        int a = vnos.nextInt();
        int b = vnos.nextInt();
        vnos.close();
        
        if ((a>99)&&(a<1000)&&(b>99)&&(b<1000)){
            
            int enicaA = a%10;
            a /= 10;
            int deseticaA = a%10;
            a/=10;
            int stoticaA = a%10;
            
            int enicaB = b%10;
            b/=10;
            int deseticaB = b%10;
            b/=10;
            int stoticaB = b%10;
            
            int zlitje= stoticaA*100000+stoticaB*10000+deseticaA*1000+deseticaB*100+enicaA*10+enicaB;
            
            System.out.println(zlitje);
        }
        else{
        System.out.println("Niste vnesli dveh trimestnih celih stevil");}
     }
}
