package w3resource.conditionalstatement;

import java.util.Scanner;

public class Exercise20n {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input number of rows: ");
        int sc = scanner.nextInt();
        for (int i = 0; i < sc; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(1);
            }
            System.out.println();
        }
    }
}
