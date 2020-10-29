package w3resource.basicparti.done;

public class Exercise37reversestring {

    public static void main(String[] args) {
        String str = "The quick brown fox";
        reverseString(str);
    }

    public static void reverseString(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
