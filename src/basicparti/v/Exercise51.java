package basicparti.v;

import java.util.Scanner;

public class Exercise51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number(string): ");
        String str =scanner.nextLine();
        int i = Integer.parseInt(str);
        System.out.println("The integer value is: "+i);
    }
}
