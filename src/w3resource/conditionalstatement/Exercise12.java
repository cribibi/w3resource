package w3resource.conditionalstatement;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("input the 5 numbers : ");
        int sum=0;
        for (int i = 0; i <5 ; i++) {
            int sc=scanner.nextInt();
            sum+=sc;
        }
        System.out.println(sum);
        System.out.println((double) sum/5);
    }
}
