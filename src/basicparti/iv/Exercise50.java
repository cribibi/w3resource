package basicparti.iv;


public class Exercise50 {
    public static void main(String[] args) {

        for (int i = 1; i <100 ; i++) {
            divizibilCu3(i);
        }
        System.out.println();

        for (int i = 1; i <100 ; i++) {
            divizibilCu5(i);
        }
        System.out.println();
        for (int i = 1; i <100 ; i++) {
            divizibilCu3si5(i);

        }



    }
    public static void divizibilCu3(int i){
        if (i%3==0){
            System.out.print(i +", ");
        }
    }

    public static void divizibilCu5(int i){
        if (i%5==0){
            System.out.print(i+", ");
        }
    }

    public static void divizibilCu3si5(int i){
        if (i%5==0&& i%3==0){
            System.out.print(i+", ");
        }
    }
}
