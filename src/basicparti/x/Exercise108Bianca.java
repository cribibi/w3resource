package basicparti.x;

public class Exercise108Bianca {
    public static void main(String[] args) {
        int x=2099999999;
        int y=199999999;
        int sum=0;
        metoda(x, sum);
        metoda(y, sum);
    }

    public static void metoda(int x, int sum){
        while(x!=0){
            sum=sum+x%10;
            x=x/10;
        }

        if (sum/10!=0){
            metoda(sum, 0);
        }else{
            System.out.println(sum);
        }
    }
}
