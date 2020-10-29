package w3resource.basicparti.done;

import java.util.Arrays;

public class Exercise75 {
    public static void main(String[] args) {
        int[] array1 = {50, -20, 0, 30,40, 60, 10};
        System.out.print("Test Data: array= ");
        System.out.println(Arrays.toString(array1));

        if (array1[0]==array1[array1.length-1]){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
