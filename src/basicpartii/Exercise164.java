package basicpartii;

import java.util.Scanner;

public class Exercise164 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int i1 = scanner.nextInt();
        System.out.print("Input the second number: ");
        int i2 = scanner.nextInt();
        double counter=0;

        while(i1>1){
            i1=i1-i2;
            counter++;
        }
        System.out.println(counter);
    }
}
