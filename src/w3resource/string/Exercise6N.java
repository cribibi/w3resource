package w3resource.string;

import java.util.Scanner;

public class Exercise6N {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input String 1 = ");
        String str1 = scanner.nextLine();
        System.out.print("Input String 2 = ");
        String str2 = scanner.nextLine();

        System.out.println(str1.compareToIgnoreCase(str2));
    }
}
