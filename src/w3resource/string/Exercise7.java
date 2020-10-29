package w3resource.string;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("String 1: ");
        String str = scanner.nextLine();
        System.out.print("String 2: ");
        String str1 = scanner.nextLine();
        String strconcat=str.concat(" "). concat(str1);
        System.out.println("The concatenated w3resource.string: "+strconcat);

    }
}
