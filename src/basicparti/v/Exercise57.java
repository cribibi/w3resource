package basicparti.v;

import java.util.Scanner;

public class Exercise57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int n=scanner.nextInt();

        int counter=0;
        for (int i = 1; i <=n ; i++) {
            if (n%i==0){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
