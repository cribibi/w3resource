package w3resource.basicpartii;

import java.util.Scanner;

public class Exercise168 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int i1 = scanner.nextInt();
        System.out.print("Input the second number: ");
        int i2 = scanner.nextInt();
        int i1multiplied = 0;

        for (int i = 1; i <= i2; i++) {
            i1multiplied = i1multiplied + i1;
        }
        System.out.println(i1multiplied);
    }
}
