package w3resource.conditionalstatement;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("give the number: ");
        int sc=scanner.nextInt();
        for (int i = 0; i <11 ; i++) {
            System.out.println(sc+" X "+ i +" = "+ sc*i);
        }
    }
}
