package w3resource.method;

import java.util.Scanner;

public class Exercise2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        average();

    }

    public static void average() {
        int[] array = arrays();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        System.out.println("The average is: " + (double)sum/array.length);
    }


    public static int[] arrays() {
        int n = numbers();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("input number "+(i+1)+" :");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int numbers() {
        System.out.print("how many numbers do you want to compare: ");
        int n = scanner.nextInt();
        return n;
    }

}
