package vi;

import java.util.Scanner;

public class Exercise62neterminat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int n1=scanner.nextInt();
        System.out.print("Input the second number: ");
        int n2=scanner.nextInt();
        System.out.print("Input the third number: ");
        int n3=scanner.nextInt();
        int [] arr={n1, n2, n3};
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==20){
                System.out.println(i);
                break;
            }
        }


    }
}
