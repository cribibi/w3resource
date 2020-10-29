package w3resource.basicparti.done;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise77 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array1=new int[3];
        int[] array2 = new int [3];

        for (int i = 0; i <3 ; i++) {
            System.out.print("input element: ");
            array1[i]=scanner.nextInt();
        }

        for (int i = 0; i <3 ; i++) {
            System.out.print("input element: ");
            array2[i]=scanner.nextInt();
        }

        int[] array3 = new int[2];
        array3[0]=array1[0];
        array3[array3.length-1]=array2[array2.length-1];

        System.out.print("Array1: ");
        System.out.println(Arrays.toString(array1));
        System.out.print("Array2: ");
        System.out.println(Arrays.toString(array2));
        System.out.print("New Array: ");
        System.out.println(Arrays.toString(array3));
    }
}
