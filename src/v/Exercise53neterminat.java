package v;

import java.util.Scanner;

public class Exercise53neterminat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int n1=scanner.nextInt();
        System.out.print("Input the second number: ");
        int n2=scanner.nextInt();
        System.out.print("Input the third number: ");
        int n3=scanner.nextInt();
        if (n1<n2){
            System.out.println("The result is: true");
        }
    }
}
