package w3resource.basicparti.done;

public class Exercise96 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 10, 5, 6, 7, 30, 60, 20};
        boolean b = false;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == 10) {
                    if (arr[j] == 20) {
                        b = true;
                        break;
                    }
                }
            }
        }
        System.out.println(b);
    }
}
