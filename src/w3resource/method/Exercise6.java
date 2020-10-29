package w3resource.method;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        sum();
    }

    public static void sum() {
        int nr = nr();
        int sum = 0;
        while (nr!=0){
            sum+=nr%10;
            nr/=10;
        }
        System.out.println(sum);
    }

    public static int nr() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number: ");
        int nr = scanner.nextInt();
        return nr;
    }
}
