package w3resource.basicpartii;

import java.util.Scanner;

public class Exercise153 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input first number: ");
        double n1=scanner.nextDouble();
        System.out.print("Input second number: ");
        double n2=scanner.nextDouble();


        if ((n1>0)&&(n1<1)&&(n2>0)&&(n2<1)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
