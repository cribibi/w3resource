package iiii;

public class Exercise33 {
    public static void main(String[] args) {
        int a = 25;
        int sum = 0;

        while (a != 0) {
            sum = sum + (a % 10);
            a = a / 10;
        }
        System.out.println("The sum of the digits is : " + sum);
    }
}
