package basicparti.viii;

import java.util.Scanner;

public class Exercise87neterminat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number");
        int n = scanner.nextInt();
        int sum = 0;
        while (n != 0) {
            sum = sum+n % 10;
            n = n / 10;
        }
        System.out.println(sum);
    }


}
