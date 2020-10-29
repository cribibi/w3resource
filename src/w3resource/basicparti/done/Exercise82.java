package w3resource.basicparti.done;

public class Exercise82 {
    public static void main(String[] args) {
        int[] arr = {20, 30, 100, 50, 10};
        int l=arr.length;

        //odd length

        if (l % 2 == 1) {
            int x = arr[0];

            if (arr[arr.length - 1] > arr[0]) {
                x = arr[arr.length - 1];
            }

            if (arr[(arr.length / 2 )] > x) {
                x = arr[arr.length / 2 ];
            }
            System.out.println(x);

        } else{
            System.out.println("The array is of even length");
        }
    }
}
