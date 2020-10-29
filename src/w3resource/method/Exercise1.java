package w3resource.method;

import java.util.Scanner;

public class Exercise1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        smallest();
    }

    public static void smallest() {
        int[] array = arrays();
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("The smallest value is: " + min);
    }

    public static int[] arrays() {
        int n = numbers();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("input number "+(i+1));
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
