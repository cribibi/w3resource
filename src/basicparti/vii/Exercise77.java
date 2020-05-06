package basicparti.vii;

import java.util.Arrays;

public class Exercise77 {
    public static void main(String[] args) {
        int[] array1 = {50, -20, 0};
        int[] array2 = {5, -50, 10};
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
