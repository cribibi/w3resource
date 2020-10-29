package w3resource.method;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        words();
    }

    public static void words() {
        String s = s();
        String[] words = s.split(" ");
        System.out.println(words.length);
    }

    public static String s() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the String: ");
        String s = scanner.nextLine();
        return s;
    }
}
