package interviewproblems;

public class TernaryOperators {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int c = 30;
        int res;
        res = ((a > b)
                    // daca da verificam urmatoarea conditie
                    ? (a > c)
                        //daca da
                            ? a
                        //daca nu
                            : c
                    //daca nu verificam urmatoarea conditie
                    : (b > c)
                        //daca da
                            ? b
                        //daca nu
                            : c);
        System.out.println(res);

        //varianta cu if
//        if (a > b) {
//            if (a > c) {
//                System.out.println(a);
//            } else {
//                System.out.println(c);
//            }
//        } else if (b > c) {
//            System.out.println(b);
//        } else {
//            System.out.println(c);
//        }
    }
}
