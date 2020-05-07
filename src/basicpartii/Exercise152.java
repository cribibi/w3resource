package basicpartii;

import java.util.Scanner;

public class Exercise152 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input first number: ");
        int n1=scanner.nextInt();
        System.out.print("Input second number: ");
        int n2=scanner.nextInt();
        System.out.print("Input third number: ");
        int n3=scanner.nextInt();
        System.out.print("Input fourth number: ");
        int n4=scanner.nextInt();

        if ((n1==n2)&&(n2==n3)&&(n3==n4)){
            System.out.println("The numbers are equal");
        }else{
            System.out.println("The numbers are not equal ");
        }
    }
}
