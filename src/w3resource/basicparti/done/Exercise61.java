package w3resource.basicparti.done;

import java.util.Scanner;

public class Exercise61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a String: ");
        String str = scanner.nextLine();
        int a = str.length();
        String str2 = new String();
        for (int i = (a - 1); i >= 0; i--) {
            str2 = str2 + str.charAt(i);
        }
        System.out.print("Reverse word: ");
        System.out.println(str2);
    }
}
