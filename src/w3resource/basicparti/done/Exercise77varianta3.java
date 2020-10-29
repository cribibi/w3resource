package w3resource.basicparti.done;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise77varianta3 {
    public static void main(String[] args) {
        System.out.println("Creating the first array");
        int [] array1=createArray();
        System.out.println("Creating the second array");
        int[] array2 = createArray();

        int[] array3 = new int[2];
        array3[0] = array1[0];
        array3[array3.length - 1] = array2[array2.length - 1];

        System.out.print("Array1 is : ");
        System.out.println(Arrays.toString(array1));
        System.out.print("Array2 is : ");
        System.out.println(Arrays.toString(array2));
        System.out.print("New Array is : ");
        System.out.println(Arrays.toString(array3));
    }

    public static int[] createArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("give the size of the array: ");
        int size=scanner.nextInt();
        int i=0;
        int[] array1 = new int[size];
        while (true){
            System.out.print("input element ["+i+"]: ");
            array1[i++] = scanner.nextInt();
            if (i==size){
                break;
            }
        }
        return array1;
    }
}
