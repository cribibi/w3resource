package sololearn;

import java.util.Scanner;

public class FruitBowl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many fruits do you have in the bowl? The number has to be even");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            int apples = number / 2;
            int bananas = number / 2;
            int pie=3;
            int pies=apples/pie;
            System.out.println("We can make "+pies+" pies");
        } else {
            System.out.println("The number is not even.");
        }
    }
}
