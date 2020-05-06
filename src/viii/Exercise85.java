package viii;

import java.util.Scanner;

public class Exercise85 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("give the word");
        String word = scanner.nextLine();
        String str = "Hello how are you?";
        String[] strArray = str.split(" ");
        if (strArray[0].equalsIgnoreCase(word)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
