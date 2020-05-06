package basicpartii;

public class Exercise151neterminat {
    public static void main(String[] args) {
        System.out.println((101 + 0) / 3);

        System.out.println(3000000*10000000.1);

        boolean b1 = true;
        System.out.println(b1 && b1);
        boolean b2 = false;
        System.out.println(b2 && b1);

        System.out.println((b2 && b2) || (b1 && b1));

        System.out.println(((b2||b2))&&(b1&&b1));
    }
}
