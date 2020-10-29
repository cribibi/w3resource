package w3resource.conditionalstatement;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        System.out.print("input the number of terms: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i < n + 1; i++) {
            System.out.println("The number is: " + i +
                    " and the cube of " + i + " is " + i * i * i);
        }
    }
}
