package w3resource.basicpartii;

import java.util.Arrays;

public class Exercise167neterminat {
    public static void main(String[] args) {
        int[] arr = {0, 3, 4, 0, 0, 1, 2, 5, 0, 7};
        int x = arr[0];
        for (int i = 0; i < arr.length - 2; i++) {
            if ((arr[i] == 0) && (arr[i + 1] != 0)) {
                x = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = x;
            } else {
                x = arr[i];
                arr[i] = arr[i + 2];
                arr[i + 2] = x;
            }

            System.out.println(Arrays.toString(arr));
        }
    }


}

