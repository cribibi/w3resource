package w3resource.string;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Original String: ");
        String str = scanner.nextLine();
        System.out.print("Specified sequence of char values: ");
        String str1 = scanner.nextLine();
        if (str.contains(str1)) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
