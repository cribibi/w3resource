package w3resource.basicparti.done;

import java.util.Scanner;

public class Exercise54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int n1=scanner.nextInt();
        System.out.print("Input the second number: ");
        int n2=scanner.nextInt();
        System.out.print("Input the third number: ");
        int n3=scanner.nextInt();
        if ((n1%10==n2%10)||(n2%10==n3%10)||(n1%10==n3%10)){
            System.out.println("The result is: true");
        }
    }
}
