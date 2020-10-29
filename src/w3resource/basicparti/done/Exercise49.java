package w3resource.basicparti.done;

import java.util.Scanner;

public class Exercise49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = scanner.nextInt();
        if (number%2==0){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
