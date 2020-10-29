package w3resource.basicparti.done;

import java.util.Arrays;

public class Exercise79 {
    public static void main(String[] args) {
        int[] arr = {20, 30, 40};
        System.out.println(Arrays.toString(arr));
        for (int i = 1; i <2 ; i++) {
            int x=arr[0];
            arr[0]=arr[1];
            arr[1]=arr[2];
            arr[2]=x;
        }

        System.out.println(Arrays.toString(arr));

    }
}
