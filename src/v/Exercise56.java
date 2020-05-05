package v;

import java.util.Scanner;

public class Exercise56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int n1=scanner.nextInt();
        System.out.print("Input the second number: ");
        int n2=scanner.nextInt();
        System.out.print("Input the division number: ");
        int n3=scanner.nextInt();
        int counter=0;
        for (int i = n1; i <=n2 ; i++) {
            if (i%n3==0){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
