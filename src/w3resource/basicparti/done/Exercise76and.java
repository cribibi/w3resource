package w3resource.basicparti.done;

import java.util.Arrays;

public class Exercise76and {
    public static void main(String[] args) {
        int[] array1 = {50, -20, 0};
        System.out.print("Array1: ");
        System.out.println(Arrays.toString(array1));
        int[] array2 = {5, -50, 10};
        System.out.print("Array2: ");
        System.out.println(Arrays.toString(array2));
        if (array1.length>=2&&array2.length>=2){
        if (array1[0]==array2[0] &&
        array1[array1.length-1]==array2[array2.length-1]){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
}
