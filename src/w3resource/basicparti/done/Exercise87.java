package w3resource.basicparti.done;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise87 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number");
        int n = scanner.nextInt();
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        System.out.println(sum);
        ArrayList<String> cifre=new ArrayList<>();


        while (sum != 0) {
            int a = sum % 10;
            cifre.add(digitName(a));
            sum = sum / 10;
        }
        printReverse(cifre);

    }

    public static String digitName(int n) {
        String s = "";
        switch (n) {
            case (1):
                s = "one";
                break;
            case (2):
                s = "two";
                break;
            case (3):
                s = "three";
                break;
            case (4):
                s = "four";
                break;
            case (5):
                s = "five";
                break;
            case (6):
                s = "six";
                break;
            case (7):
                s = "seven";
                break;
            case (8):
                s = "eight";
                break;
            case (9):
                s = "nine";
                break;
            case (0):
                s = "zero";
                break;
            default:
                break;
        }
        return s;
    }

    public static void printReverse(ArrayList<String> lista){
        for (int i = lista.size()-1; i >=0 ; i--) {
            System.out.print(lista.get(i)+" ");

        }
    }


}
