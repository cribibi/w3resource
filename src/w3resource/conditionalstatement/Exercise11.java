package w3resource.conditionalstatement;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input the number: ");
        int n = scanner.nextInt();
        int sum=0;
        System.out.println("numerele sunt: ");
        for (int i = 1; i <n+1 ; i++) {
            sum+=i;
            System.out.println(i);
        }
        System.out.println("suma este: "+sum);
    }
}
