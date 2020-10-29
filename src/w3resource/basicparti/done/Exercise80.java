package w3resource.basicparti.done;

import java.util.Arrays;

public class Exercise80 {
    public static void main(String[] args) {
        int[] arr = {20, 30, 40};
        System.out.println(Arrays.toString(arr));
        int x=0;
        if(arr[0]>arr[arr.length-1]){
            System.out.println(arr[0]);
        }else{
            System.out.println(arr[arr.length-1]);
        }
    }
}
