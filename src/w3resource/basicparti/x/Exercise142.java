package w3resource.basicparti.x;

public class Exercise142 {
    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "fedcba";
        String s3 = "aab";
        metoda(s1, s2);
        metoda(s1, s3);
    }

    public static void metoda(String s1, String s2) {
        boolean b = true;
        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(s2.length() - 1 - i)) {
                    b = false;
                    break;
                }
            }
            System.out.println(b);
        } else {
            b = false;
            System.out.println(b);
        }
    }
}
