package w3resource.string;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the String = ");
        String str = scanner.nextLine();

        int ctr=str.codePointCount(0, 10);
        System.out.println(ctr);
    }
}
