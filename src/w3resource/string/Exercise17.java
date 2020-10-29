package w3resource.string;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Given String: ");
        String str = scanner.nextLine();
        char[] arrchar=new char[str.length()];

        for (int i = 0; i <str.length() ; i++) {
            arrchar[i]=str.charAt(i);
        }
        System.out.print("The char array equals "+"\""+arrchar+"\"");
    }
}
