package w3resource.method;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        vowels();
    }

    public static void vowels() {
        String s = s();
        int count = 0;
        String vowels = "aeiou";
        String [] vowel={"a", "e", "i", "o", "u"};
        for (int i = 0; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) !=-1){
                count++;
            }
        }
        System.out.println(count);
    }

    public static String s() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the String: ");
        String s = scanner.nextLine();
        return s;
    }
}
