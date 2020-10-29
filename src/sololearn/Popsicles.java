package sololearn;

import java.util.Scanner;

public class Popsicles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many siblings are there?");
        int siblings = scanner.nextInt();
        System.out.println("how many popsicles do you have?");
        int popsicles = scanner.nextInt();
        getAnswer(siblings, popsicles);

    }

    public static void getAnswer(int siblings, int popsicles) {
        double number = (double) popsicles / siblings;
        if (number == (int) number) {
            System.out.println("yes, you can give them the poposicles");
        } else {
            System.out.println("no, you can't give them the popsicles");
        }
    }
}
