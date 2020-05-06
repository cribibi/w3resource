package basicparti.vi;

import java.util.Scanner;

public class Exercise63neterminat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int n1=scanner.nextInt();
        System.out.print("Input the second number: ");
        int n2=scanner.nextInt();
        if (n1>n2){
            System.out.println(n1);
        }else if (n1<n2){
            System.out.println(n2);
        } else {
            System.out.println("0");

        }
        
    }
}
