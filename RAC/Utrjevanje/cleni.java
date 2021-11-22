public class cleni {
    public static void main(String[] args) {
        int predznak = 1;
        double y = 0; double clen = 1;
        for (double i = 1; i < 21; i++) {
            y += clen;
            clen =  (1 / (i))*predznak;
            predznak *= -1;
            System.out.println(y);
        }

    }
}
