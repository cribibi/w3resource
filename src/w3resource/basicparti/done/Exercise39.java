package w3resource.basicparti.done;

public class Exercise39 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if (arr[j] != arr[i] && arr[k] != arr[i] && arr[j] != arr[k]) {
                        int a = arr[i] * 100 + arr[j] * 10 + arr[k];
                        System.out.println(a);
                        counter++;
                    }
                }
            }
        }
        System.out.println("Total number of the three-digit-number is " + counter);
    }
}
