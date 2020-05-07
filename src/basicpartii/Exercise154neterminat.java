package basicpartii;

public class Exercise154neterminat {
    public static void main(String[] args) {
        boolean [][] arr={{true, false, true}, {false, true, false}};
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();

        }
    }
}
