package basicparti.v;

import java.util.Scanner;

public class Exercise53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int n1=scanner.nextInt();
        System.out.print("Input the second number: ");
        int n2=scanner.nextInt();
        System.out.print("Input the third number: ");
        int n3=scanner.nextInt();
        System.out.println("Give the boolean value of abc");
        boolean b=scanner.nextBoolean();
        if ((n1<n2&&n2<n3)||b){
            System.out.println("The result is: true");
        }
    }
}
