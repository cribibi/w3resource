package interviewproblems;

import java.util.Scanner;

//92. Verificati ca un numar este prim.
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the number you want to check: ");
        int a = scanner.nextInt();
        if (a < 2) {
            System.out.println("The number has to be bigger than 1");
        } else {
            boolean estePrim = isPrime(a);
            System.out.println("The number is prime: " + estePrim);
        }
    }

    public static boolean isPrime(int a) {
        boolean b = true;
        for (int i = 2; i < (a / 2 + 1); i++) {
            if (a % i == 0) {
                b = false;
            }
        }
        return b;
    }
}
