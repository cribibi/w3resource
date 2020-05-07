package basicparti.x;

import java.util.Scanner;

public class Exercise108Florin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti un numar :");
        int nrUser = scan.nextInt();
        int nrMagic = digitsSum(nrUser);
        System.out.println(nrMagic);
    }

    static int digitsSum(int nr) {
        int sum = 0;
        while (true) {
            if (nr / 10 == 0) {
                //System.out.println(nr);
                sum += nr;
                break;
            }
            int lastDigit = nr % 10;
            sum += lastDigit;
            // System.out.println(lastDigit);
            nr /= 10;
        }
        if (sum / 10 == 0) return sum;
        else return digitsSum(sum);
    }
}

