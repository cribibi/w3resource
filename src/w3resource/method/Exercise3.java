package w3resource.method;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        middle();
    }

    public static void middle() {
        String s = s();
        if (s.length() % 2 == 1) {
            System.out.println(s.charAt(s.length()/2));
        } else
            System.out.println(s.charAt(s.length()/2-1) +", "+s.charAt(s.length()/2));
    }

    public static String s() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the String: ");
        String s = scanner.nextLine();
        return s;
    }
}
