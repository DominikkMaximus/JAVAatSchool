public class funkcija15_11_2{

     public static void main(String []args){
       double y;
       double x=-3;
       for(;x<=3;x+=0.25){
        if(x<-1)
            y=x+3;
        else if(x<0)
            y=2*x+4;
        else if(x<1)
            y=-2*x+4;
        else
            y=-x+3;
        System.out.format("x= %.2f ",x);
        System.out.format("y=%.2f %n",y);
           
       }
    }
}
