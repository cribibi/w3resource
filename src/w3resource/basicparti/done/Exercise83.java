package w3resource.basicparti.done;

import java.util.Arrays;

public class Exercise83 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, -5, 4};
        System.out.println("Array1: "+Arrays.toString(array1));
        int[] array2 = {1, 4, -5, -2};
        System.out.println("Array2: " + Arrays.toString(array2));
        int[] result = new int[4];
        for (int i = 0; i <array1.length ; i++) {
            result[i]=array1[i]*array2[i];
        }
        System.out.print("Result: ");
        for (int i = 0; i <result.length ; i++) {
            System.out.print(result[i]+" ");
        }
    }
}
