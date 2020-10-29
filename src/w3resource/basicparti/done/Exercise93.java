package w3resource.basicparti.done;

public class Exercise93 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 10, 10, 5, 6, 20,4, 8, 10};
        System.out.println(zece(arr));
        System.out.println(douazeci(arr));
        System.out.println("================================");
        System.out.println(zece(arr)^ douazeci(arr));

    }

    public static boolean zece(int[] arr) {
        boolean b = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 10 && arr[i + 1] == 10) {
                b = true;
            }
        }
        return b;
    }

    public static boolean douazeci(int[] arr) {
        boolean b = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 20 && arr[i + 1] == 20) {
                b = true;
            }
        }
        return b;
    }


}
