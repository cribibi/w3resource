package w3resource.method;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        verification();
    }

    public static void verification() {
        String password = password();
//        if ((password.length() >= 10) && () && ()) {
//            System.out.println("Password is valid:" + password);
//        }

    }

    public static String password() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a password (You are agreeing to the above Terms and Conditions.): abcd1234");
        String password = scanner.nextLine();
        return password;
    }
}
