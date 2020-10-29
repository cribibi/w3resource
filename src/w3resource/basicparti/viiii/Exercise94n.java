package w3resource.basicparti.viiii;

import java.util.Arrays;

public class Exercise94n {
    public static void main(String[] args) {
        int[] numere = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean b = true;
        while (b) {
            for (int i = 0; i < numere.length - 1; i++) {
                if (numere[i] % 2 == 0 && numere[i + 1] % 2 == 1) {
                    int a = numere[i];
                    numere[i] = numere[i + 1];
                    numere[i + 1] = a;

                } else {
                    b = false;
                }
            }

            System.out.println(Arrays.toString(numere));
        }
    }
}
