package w3resource.basicparti.done;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise95 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("give n: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));
    }
}
