package ii;

public class Exercise22Neterminat {
    public static void main(String[] args) {
        //binary to decimal

        int a = 100;
        int a2=0;
        while (a>0){
            a2=a2+a/100;
            a=a/10;
        }
        System.out.println("a este " + a);
        System.out.println("a2 este " + a2);

    }
}
