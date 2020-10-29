package interviewproblems;

import java.util.Scanner;

//94. Calculat factorial de n
//1*2*3*4*5*6*....
//1, 2, 6, 24, 120, 720
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the number whose factorial you want to calculate");
        int n = scanner.nextInt();
        getFactorial(n);
        int recursive = getRecursiveFactorial(n);
        System.out.println(recursive);
    }

    //good
    public static void getFactorial(int n) {
        int fact = 1;
        for (int i = 1; i < n + 1; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }

    //varianta recursiva - from Dorin
    private static int getRecursiveFactorial(int n) {
        if (n < 2)
            return 1;
        else return getRecursiveFactorial(n - 1) * n;
    }
}
