package w3resource.basicpartii;

public class Exercise162 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 17, 7, 25, 3, 100};
        double average=average(arr);
        System.out.println(average);
        biggerThanAverage(arr);

    }

    public static int average(int[] arr) {
        int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
        }
        return sum/arr.length;
    }

    public static void biggerThanAverage(int [] arr){
       int  average=average(arr);
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>average){
                System.out.println(arr[i]);
            }
        }
    }
}

