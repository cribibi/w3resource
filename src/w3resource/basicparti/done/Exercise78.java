package w3resource.basicparti.done;

import java.util.Arrays;

public class Exercise78 {
    public static void main(String[] args) {
        int [] arr={5, 7};
        System.out.println("Original Array: "+Arrays.toString(arr));
//        if (arr[0]==4 ||arr[0]==7|| arr[1]==4|| arr[1]==7){
//            System.out.println("true");
//        }
        boolean b=false;
        for (int i = 0; i <2 ; i++) {
            if(arr[i]==4||arr[i]==7){
                b=true;
            }

        }
        if (b==true){
            System.out.println("true");
        }
    }
}
