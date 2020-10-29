package w3resource.basicparti.x;

public class Exercise108Bianca {
    public static void main(String[] args) {
        int x = 2099999999;
        int y = 199999999;
        int z = 1234567;
        int sum = 0;
        metoda(x, sum);
        metoda(y, sum);
        sumCifre(x);
        sumCifre(y);
    }

    public static void metoda(int x, int sum) {
        while (x != 0) {
            sum = sum + x % 10;
            x = x / 10;
        }

        if (sum / 10 != 0) {
            metoda(sum, 0);
        } else {
            System.out.println(sum);
        }
    }

    //metoda lui bogdan grupa15
    public static void sumCifre(int n) {
        int sum = 0;
        int temp = 0;
        while (n > 0) {
            temp = n % 10;
            n = n / 10;
            sum += temp;
        }
        if (sum > 9) {
            sumCifre(sum);
            return;
        }
        System.out.println(sum);
    }


}
