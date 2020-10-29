package interviewproblems;

//95. Calculati fibonnaci
//0,1,1,2,3,5,8,13,21,34,55, 89

import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type the number of the element you wish to calculate: ");
        int n = scanner.nextInt();

        if (n == 1) {
            System.out.println(0);
        } else if (n == 2) {
            System.out.println(1);
        } else {

            // Ai putea sa incepi de la 2 sa termini la n, pentru ca deja stii primele 2 elemente
            // ai ignorat cazul in care n=1; dar asta se rezolva usor returnand b in loc de sum.
            // Altfel pentru  n=2, iti returneaza 0.

            int result = getFinonnaci(n);
            System.out.println(result);

            //poti chiar si fara aux,daca in b salvezi suma lor, atunci a ul ca sa fie fostul b trebuie sa fie suma lor -a, deci b-a.
            result = getFibonnaci2(n);
            System.out.println(result);

            getFibonnaci3(n);
        }
    }

    private static int getFinonnaci(int n) {
        int a = 0;
        int b = 1;
        int aux;
        for (int i = 2; i < n; i++) {
            aux = a + b;
            a = b;
            b = aux;
        }
        return b;
    }

    private static int getFibonnaci2(int n) {
        int a = 0;
        int b = 1;
        for (int i = 2; i < n; i++) {
            b = a + b;
            a = b - a;
        }
        return b;
    }

    private static void getFibonnaci3(int n) {
        int a = 0;
        int b = 1;
        int sum = 0;
        for (int i = 2; i < n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println(sum);
    }
}
