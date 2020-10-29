package w3resource.basicparti.nefacute;

import java.util.Scanner;

public class Exercise62neterminat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int n1 = scanner.nextInt();
        System.out.print("Input the second number: ");
        int n2 = scanner.nextInt();
        System.out.print("Input the third number: ");
        int n3 = scanner.nextInt();
        boolean b=false;

        if (n1 < 20 && n2 < 20 && n3 < 20) {
            System.out.println();
        } else if (n1 >= 20) {
            if (n1 < n2 - n3 || n1 < n3 - n2) {
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        } else if (n2 >= 20) {
            if (n2 < n1 - n3 || n2 < n1 - n3) {
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        } else if (n3 >= 20) {
            if (n3 < n1 - n2 || n3 < n2 - n1) {
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        } else {
            System.out.println("false");
        }
    }


}

