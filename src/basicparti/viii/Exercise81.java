package basicparti.viii;

import java.util.Arrays;

public class Exercise81 {
    public static void main(String[] args) {
        int[] arr = {20, 30, 40};
        int [] arr1=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            arr1[i]=arr[i];
        }
        arr1[0]=arr[arr.length-1];
        arr1[arr1.length-1]=arr[0];
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));

    }
}
