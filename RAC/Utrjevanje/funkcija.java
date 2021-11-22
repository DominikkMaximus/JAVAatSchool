public class funkcija {
    public static void main(String[] args) {
        double y;

        for (double x = -3; x <= 3; x += 0.2) {
            if (x < -2)
                y = 0;
            else if (x < -1)
                y = 2 * x + 4;
            else if (x < 1)
                y = 2;
            else if (x < 2)
                y = -2 * x + 4;
            else
                y = 0;

            System.out.format("x = %.2f ",x);
            System.out.format("y = %.2f %n ",y);
        }
    }
}
