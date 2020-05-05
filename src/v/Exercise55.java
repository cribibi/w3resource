package v;

import java.util.Scanner;

public class Exercise55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input seconds: ");
        int seconds = scanner.nextInt();
        int minutes = seconds / 60;
        seconds = seconds % 60;
        int hours = minutes / 60;
        minutes = minutes % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
