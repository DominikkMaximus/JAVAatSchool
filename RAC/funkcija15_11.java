public class funkcija15_11{

     public static void main(String []args){
       double y;
       double x=-2;
       for(;x<=2;x+=0.2){
        if(x<-1)
            y=-1;
        else if(x<1)
            y=x;
        else
            y=1;
        System.out.format("x= %.2f ",x);
        System.out.format("y=%.2f %n",y);
           
       }
    }
}
