package basicparti.ii;

public class Exercise17Neterminat {

    public static void main(String[] args) {
        //sum of two binary numbers 10 and 11 : 101

        int a = 10;

        int b = 11;

        int a2=(int)(Math.pow(2,0)*(a%10)+Math.pow(2,1)*(a/10));
        System.out.println(a2);
        int b2=(int)(Math.pow(2,0)*(b%10)+Math.pow(2,1)*(b/10));
        System.out.println(b2);
        int c2=a2+b2;
        System.out.println(c2);
        int c=c2/2;
        c2=c2/2;
        c=c*10;
    }
}
